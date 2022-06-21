package lab5.prob3.control;
import lab5.prob3.data.Data;
import lab5.prob3.data.Logins;
import lab5.prob3.ui.Grades;
import lab5.prob3.ui.Login;
import lab5.prob3.ui.Remarks;
import lab5.prob3.ui.Start;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JFrame;


public enum Control {
	INSTANCE;
	Start start;
	Grades grades;
	Login login;
	String username;
	int requestedPage =0;
	Remarks remarks;
	private boolean isLoggedIn = false;
	public boolean isLoggedIn() {
		return isLoggedIn;
	}
	public void setLoggedIn(boolean b) {
		isLoggedIn = b;
	}
	
	public void setStart(Start st) {
		this.start = st;
	}
	public void backToStart(JFrame frame) {
		frame.setVisible(false);
		start.setMessage("");
		start.setVisible(true);
	}
	
	class LoginListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			login = new Login();
			start.setVisible(false);
			login.setVisible(true);
		}
	}
	class RemarksListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			if(Control.this.isLoggedIn()) {
				remarks = new Remarks();
				HashMap<String, String> rem 
					= Data.dataMap.get(Control.this.username).getTeacherRemarks();
				StringBuilder sb = new StringBuilder();
				for(String key : rem.keySet()) {
					sb.append(key + " : " + rem.get(key) + "\n");
				}
				remarks.setRemarks(sb.toString());
				remarks.setTitle("Teacher Remarks for " + Control.this.username);
				remarks.setHeading("Teacher Remarks for " + Control.this.username);
				Control.INSTANCE.start.setMessage("");
				Control.INSTANCE.start.setVisible(false);
				remarks.setVisible(true);
			}else {
				Control.this.requestedPage = 2;
				login = new Login();
				Control.INSTANCE.start.setMessage("");
				Control.INSTANCE.start.setVisible(false);
				login.setVisible(true);
			}
	
		}
	}
	class GradesListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			if(Control.this.isLoggedIn()) {
			grades = new Grades();
			HashMap<String, String> gr 
				= Data.dataMap.get(Control.this.username).getGrades();
			StringBuilder sb = new StringBuilder();
			for(String key : gr.keySet()) {
				sb.append(key + " : " + gr.get(key) + "\n");
			}
			grades.setGrades(sb.toString());
			grades.setTitle("Grades for " + Control.this.username);
			grades.setHeading("Grades for " + Control.this.username);
			Control.INSTANCE.start.setMessage("");
			Control.INSTANCE.start.setVisible(false);
			grades.setVisible(true);
			
			}else {
				Control.this.requestedPage = 1;
				login = new Login();
				Control.INSTANCE.start.setMessage("");
				Control.INSTANCE.start.setVisible(false);
				login.setVisible(true);
			}
		
		}
	}
	class SubmitLoginListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String username = login.getUserName();
			String password = login.getPassword();
			if(!Logins.foundUserNamePwd(username, password)) {
				login.setMessage("Login failed.");
			} else {
				Control.this.username = username;
				Control.this.isLoggedIn = true;
				login.setMessage("Successful login");
				
				if(Control.this.requestedPage> 0) {
					login.setVisible(false);
				}
				
				if(Control.this.requestedPage ==1) {
					getGradesListener().actionPerformed(evt);
				}
				if(Control.this.requestedPage ==2) {
					 getRemarksListener().actionPerformed(evt);
				}
		       
			}
		}
	}
	
	class LogoutListener implements ActionListener{
		public void actionPerformed(ActionEvent evt) {
			Control.this.isLoggedIn = false;
			start.setMessage("Logout successful");
		}
	}
	
	public SubmitLoginListener getSubmitLoginListener() {
		return new SubmitLoginListener();
	}
	public LoginListener getLoginListener() {
		return new LoginListener();
	}
	public RemarksListener getRemarksListener() {
		return new RemarksListener();
	}
	public GradesListener getGradesListener() {
		return new GradesListener();
	}
	
	public LogoutListener getLogoutListener() {
		return new LogoutListener();
	}

}
