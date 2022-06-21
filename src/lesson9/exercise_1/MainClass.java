package lesson9.exercise_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {
        Stream.iterate(1,n->(n+2)).limit(100).toList().forEach(System.out::println);
        Stream.iterate(9,n->(n+2)).limit(4).toList().forEach(System.out::println);
//        System.out.println(Arrays.toString(odds1.toArray()));
    }
}
