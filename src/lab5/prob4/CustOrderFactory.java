package lab5.prob4;

import java.time.LocalDate;

public class CustOrderFactory {
    
    public static Customer createCustomer(String name) {
        if(name == null) return null;
        return new Customer(name);
    }

    public static Order newOrder(Customer cust, LocalDate orderDate) {
        if(cust == null) return null;
        Order ord = new Order(orderDate);
        cust.addOrder(ord);
        return ord;
    }
    public static Item newItem(String name) {
        return new Item(name);
    }
    
}
