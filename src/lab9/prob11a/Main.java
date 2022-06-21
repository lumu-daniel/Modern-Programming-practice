package lab9.prob11a;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		

		System.out.println(FILTER_WITH_TRI.apply(emps,100000d,"^[N-Z].*"));

	}

	public static TriFunction<List<Employee>,Double,String,List<String>>
			FILTER_WITH_TRI = (employees,salary,regex)->
			employees.stream()
					.filter(emp->emp.getSalary()>salary && emp.getLastName().matches(regex))
					.map(name->name.getFirstName() + " " + name.getLastName())
					.sorted()
					.collect(Collectors.toList());
}
