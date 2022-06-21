package lab9.prob9;

import java.util.stream.IntStream;

public class MainClass {

    public static void main(String[] args) {
        printSquares(4);
    }

    private static void printSquares(int num){
        IntStream.iterate(1,n->n+1).limit(num).forEach(x->System.out.println(Math.pow(x,2)));
    }
}
