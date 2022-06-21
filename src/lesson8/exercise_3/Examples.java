package lesson8.exercise_3;
import lesson8.exercise_1.Employee;
import org.codehaus.groovy.runtime.m12n.ExtensionModule;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
public class Examples {
	
	
	//type: Class::instanceMethod
	Function<String, String> upper1 = (String x) -> x.toUpperCase();
	Function<String, String> upper2 = String::toUpperCase;

	// type: Class::instanceMethod
	// A. (Employee e) -> e.getName()
	Function<Employee, String> emp = (Employee x) -> x.getName();
	Function<Employee, String> emp2 = Employee::getName;

	//type Class:: instanceMethod
	//B. (Employee e, String s) -> e.setName(s)
	BiConsumer<Employee,String> eName = (e, s)-> e.setName(s);
	BiConsumer<Employee, String> eName2 = Employee::setName;


	
	public void evaluator() {
		System.out.println(upper2.apply("hello"));
		
		
	}
	
	public static void main(String[] args) {
		Examples e = new Examples();
		e.evaluator();
		
	}
	
}
