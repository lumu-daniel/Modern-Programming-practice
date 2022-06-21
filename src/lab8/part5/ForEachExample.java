package lab8.part5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format

		//Lambda expression
		list.forEach(x->System.out.println(x.toUpperCase()));

		//Method reference
		Function<String,String> toUpperCase= String::toUpperCase;
		list.forEach(x-> System.out.println(toUpperCase.apply(x)));

	}
	
	public static String toUpper(String s) {
		return s.toUpperCase();
	}
	
	
}