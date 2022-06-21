package lab8.lab8_prob2.prob2A;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		//return e1.name.compareTo(e2.name);
		int i = e1.name.compareTo(e2.name);
		if(i != 0) { return i; }
		return Integer.compare(e1.salary, e2.salary);
		
	}
}
