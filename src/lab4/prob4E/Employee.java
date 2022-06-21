package lab4.prob4E;

import java.util.ArrayList;
import java.util.List;

public class Employee{
	private String name;
	List<Account> listOfAccounts = new ArrayList<Account>();

	public Employee(String name) {
		this.name = name;
	}

	public double computeUpdatedBalanceSum() {
		double sum = 0;
		for (Account a : listOfAccounts){
			sum += a.computeUpdatedBalance();
		}
		return sum;
	}

	public void addAccount(Account acct) {
		if (acct != null) {
			this.listOfAccounts.add(acct);
		}
	}

	public String getName() {
		return name;
	}
}
