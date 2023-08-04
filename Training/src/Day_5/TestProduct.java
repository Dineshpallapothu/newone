package Day_5;

abstract class Product {
	protected String name;
	protected double price;
	protected double quantity;

	public Product(String name, double price, double quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public void bill() {
		System.out.println(this.name + " " + this.price + " " + this.quantity);

	}

	public abstract double getNetPrice();

}

class DiscountProducts extends Product {
	private static double discount = 0.1;

	public DiscountProducts(String name, double price, double quantity) {
		super(name, price, quantity);

	}

	public double getNetPrice() {
		return (price * quantity) - (DiscountProducts.discount * (price * quantity));
	}

	public static double getDiscount() {
		return discount;
	}

	public static void setDiscount(double discount) {
		DiscountProducts.discount = discount;
	}

	public void bill() {
		super.bill();
		System.out.println("Discount-" + DiscountProducts.discount);
		System.out.println("amount " + getNetPrice());

	}

}

class TaxedProduct extends Product {
	private static double tax;

	public TaxedProduct(String name, double price, double quantity) {
		super(name, price, quantity);

	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	@Override
	public double getNetPrice() {

		return (price * quantity) + (TaxedProduct.tax * (price * quantity));
	}

	public void bill() {
		super.bill();
		System.out.println("Tax for LocalProduct" + getNetPrice());
	}

}

class ImportProduct extends Product {
	private static double tax;
	private static double importtax;

	public ImportProduct(String name, double price, double quantity) {
		super(name, price, quantity);

	}

	public static double getTax() {
		return tax;
	}

	public static void setTax(double tax) {
		ImportProduct.tax = tax;
	}

	public static double getImporttax() {
		return importtax;
	}

	public static void setImporttax(double importtax) {
		ImportProduct.importtax = importtax;
	}

	public double getNetPrice() {
		return (price * quantity) + ((importtax * (price * quantity)) + (tax * (price * quantity)));
	}

	@Override
	public void bill() {
		super.bill();
		System.out.println("Grand total" + getNetPrice());
	}

}

public class TestProduct {

	public static void main(String[] args) {
		DiscountProducts obj = new DiscountProducts("Toothpaste", 10, 10);
		obj.bill();
		System.out.println(obj.getDiscount());
		System.out.println(obj.getNetPrice());
		System.out.println("______________________");
		TaxedProduct obj1 = new TaxedProduct("drink", 100, 2);
		obj1.setTax(0.1);
		obj1.bill();
		System.out.println("____________________");
		ImportProduct obj3 = new ImportProduct("choclates", 3500, 30);
		obj3.setTax(0.1);
		obj3.setImporttax(0.2);
		obj3.bill();

	}

}
