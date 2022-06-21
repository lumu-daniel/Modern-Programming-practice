package lab9.trial.prob10b;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
		stringStream.forEach(x -> System.out.print(x +","));
	}

}
