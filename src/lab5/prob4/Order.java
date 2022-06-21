package lab5.prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
	private LocalDate orderDate;
	private List<Item> items;
	
	//use a factory method
	Order(LocalDate orderDate) {  //set package level
		this.orderDate = orderDate;
		items = new ArrayList<Item>();
	}
//	public static Order newOrder(Customer cust, LocalDate date) {
//		if(cust == null) throw new NullPointerException("Null customer");
//		Order ord = new Order(date);
//		cust.addOrder(ord);
//		return ord;
//	}   										//not needed
	public void addItem(Item name){
		items.add(name);
	}
	@Override
	public String toString() {
		return orderDate + ": " + 
	              items.toString();
	}
}
