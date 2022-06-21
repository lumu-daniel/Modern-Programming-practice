package lab5.prob4.extpackage;

import lab5.prob4.CustOrderFactory;
import lab5.prob4.Customer;
import lab5.prob4.Order;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
//		Customer cust = new Customer("Bob");
//		Order order = Order.newOrder(cust, LocalDate.now());
//		order.addItem("Shirt");
//		order.addItem("Laptop");
//
//		order = Order.newOrder(cust, LocalDate.now());
//		order.addItem("Pants");
//		order.addItem("Knife set");
//		System.out.println(cust.getOrders());			//previous  code

		Customer cust = CustOrderFactory.createCustomer("Bob");
		Order order = CustOrderFactory.newOrder(cust, LocalDate.now());  			 //can place  0..*
		order.addItem(CustOrderFactory.newItem("Shirt"));
		order.addItem(CustOrderFactory.newItem("Laptop"));

		order = CustOrderFactory.newOrder(cust, LocalDate.now());
		order.addItem(CustOrderFactory.newItem("Pants"));
		order.addItem(CustOrderFactory.newItem("Knife set"));

		System.out.println(cust.getOrders());

	}
}

		
