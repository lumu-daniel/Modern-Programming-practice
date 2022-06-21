package lab10.prob1.bugreporter;

import lab10.prob1.classfinder.ClassFinder;
import tryOuts.B;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * 
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "lab10.prob1";
	private static final String REPORT_NAME = "/Users/test/Desktop/MIU_Courses/MPP_April/Assignments/src/lab10/prob1/bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		
		//sample code for reading annotations -- you will need to change
		//this quite a bit to solve the problem
		//Sample code below obtains a list of names of developers assigned to bugs
		List<BugItem> names = new ArrayList<BugItem>();
		for(Class<?> cl : classes) {
			if(cl.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport)cl.getAnnotation(BugReport.class);
				names.add(new BugItem(annotation.assignedTo(),
						cl.getName(),
						annotation.description(),
						annotation.reportedBy(),
						annotation.severity()));
			}
		}
		try {
			writeToFile(names);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(names);
		
	}

	private void writeToFile(List<BugItem> items) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter writer = new PrintWriter(REPORT_NAME, "UTF-8");
		for (BugItem item :
				items) {
			writer.println(item.getAssignedTo()+"\n");
			writer.println("  "+item.getReportedBy()+"\n");
			writer.println("  "+item.getClassName()+"\n");
			writer.println("  "+item.getDescription()+"\n");
			writer.println("  "+item.getSeverity()+"\n");
			writer.println("\n\n");
		}
		writer.close();
	}
	
	
}
