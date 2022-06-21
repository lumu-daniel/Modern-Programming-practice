package lab10.prob4.soln1;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import lab10.prob4.Employee;
import lab10.prob4.Main;
import org.junit.Test;

public class MainTest {
	Main main = new Main();
	List<Employee> employee = new ArrayList<>();

	@Test
	public void testAsString() {
		employee.addAll(List.of(
		        new Employee("John", "Sims", 110000),
		        new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000)
		));
		
		String expeted = "Alice Richards, Joe Stevens, John Sims, Steven Walters";
		
		assertEquals(main.asString(employee), expeted);
		
	}

}
