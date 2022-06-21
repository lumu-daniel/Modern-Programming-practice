package lesson9.exercise_3;
import java.util.*;
import java.util.stream.Stream;

public class Main {

	//Use Comparator.comparing and thenComparing to sort 
	//the list by balance and then by ownerName
	//Collect your stream into a list and print the sorted 
	//result to the console
	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<Account>() {
			{
				add(new Account("Bob", 5000, 1001));
				add(new Account("Jim", 10000, 1002));
				add(new Account("Bruce", 5300, 1003));
				add(new Account("Li", 12000, 1004));
				add(new Account("Sam", 9000, 1005));
				add(new Account("Rick", 11000, 1006));
			}
		};
		
		//sorting code here

//		accounts = Stream.of(accounts).max((o1,o2)->{
//			return (((Account)o1).getOwnerName().equals(((Account)o1).getOwnerName())?((Account)o1).getBalance()-((Account)o1).getBalance():null);
//		});

	}

}
