package lab2_soln.prob2B;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(new ArrayList<>());
        System.out.println(order.getOrderLines().get(0));
    }
}
