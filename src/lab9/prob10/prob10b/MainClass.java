package lab9.prob10.prob10b;

import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {
        printStreams(new String[]{"Bill", "Thomas", "Mary"});
    }


    private static void printStreams(String... data){
        System.out.println(Stream.of(data).reduce("",(x,y)->x+", "+y));
    }
}
