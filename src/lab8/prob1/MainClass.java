package lab8.prob1;

import java.util.function.Supplier;

import static java.lang.Math.random;

public class MainClass {

    Supplier<Double> randoms = Math::random;
    private static Supplier<Double> randoms2 = ()->random();

    public static void main(String[] args) {
        System.out.println(randoms2.get());
        System.out.println(new RandomGetter().get());
    }

    static class RandomGetter implements Supplier<Double> {

        @Override
        public Double get() {
            return random();
        }
    }

}
