package lab9.prob8;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainClass {
	List<OrderItem> orderItems = new ArrayList<>();
	public static void main(String[] args) {
		MainClass m = new MainClass();
		m.loadOrderItemData();
		System.out.println("Do any of these Order Items have an order of flowers? " +
		   m.findProduct2("Flowers"));
	}
	
	private boolean findProduct(String prodName) {
		for(OrderItem item : orderItems) {
			if(item != null) {
				Product p=item.getProduct();
				if(p != null) {
					String name = p.getProductName();
					if(name != null) {
						if(name.equals(prodName)) return true;
					}
				}
			}
		}
		return false;
	}

	boolean result = false;
	private boolean findProduct2(String prodName) {
		orderItems.forEach(orderItem -> {
			if(Optional.ofNullable(orderItem).map(OrderItem::getProduct).map(Product::getProductName).orElse("").equals(prodName)){
				result = true;
			}
		});
		return result;
	}
	
	private void loadOrderItemData() {
		orderItems.add(new OrderItem(new Product("1016", "Tools", 131.00), 3));
		orderItems.add(new OrderItem(new Product("1017", "Fishing Rod", 111.00), 1));
		orderItems.add(new OrderItem(new Product("1018", "Game of Go",66.00), 2));
		orderItems.add(new OrderItem(new Product("1019", "Flowers", 221.00), 5));
	}
}
