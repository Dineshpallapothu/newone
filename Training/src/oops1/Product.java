package oops1;

public class Product {

	private String name;
	private double price;
	private int quantityofhand;
	private static double taxrate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantityofhand() {
		return quantityofhand;
	}

	public void setQuantityofhand(int quantityofhand) {
		this.quantityofhand = quantityofhand;
	}

	public Product(String name, int price, int quantityofhand) {

		this.name = name;
		this.price = price;
		this.quantityofhand = quantityofhand;
	}

	public Product() {
		super();
	}

	public double getNetprice() {
		price = price + (price * taxrate / 100);
		price = price - (price * 0.05);
		return price;
	}

	public void print() {
		System.out.println(name);
		System.out.println(price);

	}

	public int sale(int qunatity) {

		return this.quantityofhand - qunatity;
	}

	public int purchase(int purchase) {
		return this.quantityofhand + purchase;
	}

	public static double getTaxrate() {
		return taxrate;
	}

	public void setTaxrate(double tax) {
		this.taxrate = tax;

	}
}
