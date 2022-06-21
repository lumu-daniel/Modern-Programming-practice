package lab8.part6;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Examples {


	//A
	static Function<Employee, String> getName1 = (Employee emp) -> emp.getName();
	static Function<Employee, String> getName2 = Employee::getName;

	// B
	static BiConsumer<Employee, String> setName1 = (Employee emp, String s) -> emp.setName(s);
	static BiConsumer<Employee, String> setName2 = Employee::setName;

	// C
	static Comparator<String> compare1 = (String s1, String s2) -> s1.compareTo(s2);
	static Comparator<String> compare2 = String::compareTo;

	// D
	static BiFunction<Integer, Integer, Double> power1 = (Integer x, Integer y) -> Math.pow(x, y);
	static BiFunction<Integer, Integer, Double> power2 = Math::pow;

	// E
	static Function<Apple, Integer> getWeight1 = (Apple a) -> a.getWeight();
	static Function<Apple, Integer> getWeight2 = Apple::getWeight;

	// F
	static Function<String, Integer> parseInt1 = (String s) -> Integer.parseInt(s);
	static Function<String, Integer> parseInt2 = Integer::parseInt;

	// G
	static EmployeeNameComparator employeeNameComparator = new EmployeeNameComparator();

	static Comparator<Employee> comparator1 = (Employee e1,	Employee e2) -> employeeNameComparator.compare(e1, e2);
	static Comparator<Employee> comparator2 = employeeNameComparator::compare;
	Comparator<Employee> comparator3= (Employee e1,	Employee e2) -> employeeNameComparator.compare(e1, e2);
	
	public static void main(String[] args) {

//		// A
		System.out.println("A");
		Employee employee = new Employee("Sardor", 150000);
		System.out.println(getName1.apply(employee));
		System.out.println(getName2.apply(employee));

		// B
		System.out.println("B");
		setName1.accept(employee, "Sardorbek");
		setName2.accept(employee, "Daniel");
		setName2.accept(employee, "Masuko");

		// C
		System.out.println("C");
		System.out.println(compare1.compare("Employee", "Employee"));
		System.out.println(compare1.compare("Employee", "Employee2"));

		// G
		System.out.println("G");
		Employee emp1 = new Employee("employee", 100_000);
		Employee emp2 = new Employee("employee", 220_000);
		System.out.println(comparator1.compare(emp1, emp2));
		System.out.println(comparator2.compare(emp1, emp2));

		setName1.accept(emp1, "Sardorbek");


	}

}
