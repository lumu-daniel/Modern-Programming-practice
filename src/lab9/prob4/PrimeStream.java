package lab9.prob4;

import java.util.stream.Stream;

public class PrimeStream {

    public void printFirstNPrimes(long n){
        final Stream<Integer> primes = Stream.iterate(1, x->x+2);
        primes.limit(n).toList().forEach(System.out::println);
    }
}
