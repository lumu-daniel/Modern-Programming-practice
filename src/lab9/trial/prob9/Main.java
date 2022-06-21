package lab9.trial.prob9;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		printSquares(4);
	}
	
	public static void printSquares(int num) {
		IntStream numSquares = IntStream.iterate(1, n -> (n)*(++n)).limit(num);
		numSquares.forEach(System.out::println);
		
	}

}
