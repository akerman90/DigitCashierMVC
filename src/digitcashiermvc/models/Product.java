package digitcashiermvc.models;


public class Product {
	private String name;
	private int id;
	private double price;
	private Type type;
	
	private static int quantity;
	
	public static int getQuantity() {
		return quantity;
	}
	public static void setQuantity(int quantity) {
		Product.quantity = quantity;
	}
	
}
	
