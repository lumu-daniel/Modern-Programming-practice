package lab10.prob4.soln2;

import static org.junit.Assert.*;

import lab10.prob4.Employee;
import lab10.prob4.Main;
import org.junit.Test;


public class Maintest2 {

	Employee employee = new Employee("Sardorbek", "Abdupattaev", 110000);
	Main main = new Main();

	@Test
	public void testFullName() {
		assertEquals(main.fullName(employee), "Sardorbek Abdupattaev");
	}
	@Test
	public void testSalaryGreaterThan100000() {
		assertEquals(main.salaryGreaterThan100000(employee), true);
	}
	@Test
	public void testLastNameAfterM() {
		assertEquals(main.lastNameAfterM(employee), false);
	}

}
