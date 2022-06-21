package lab8.lab8_prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		Main m=new Main();
		MyBiFunction bfun = m.new MyBiFunction();
		System.out.println(bfun.apply(2.0, 3.0));
			
	}
	
	class MyBiFunction implements BiFunction<Double, Double, List<Double>>{
		
		@Override
		public List<Double> apply(Double t, Double u) {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(t,u));
			list.add(t * u);
			return list;
		}
		
	}

}
