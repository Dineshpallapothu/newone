package Day3;

public class SalesTransaction {

	private int quantity;
	private double price;
	private static double rateoftax;
	        public static double getRateoftax() {
		return rateoftax;
	}

	public static void setRateoftax(double rateoftax) {
		SalesTransaction.rateoftax = rateoftax;
	}

			static int count=0;

	public SalesTransaction(int quantity, double price) {
		count++;
		this.quantity = quantity;
		this.price = price;
	}

	public SalesTransaction(double price) {
		count++;
		this.quantity = 1;
		this.price = price;
	}

	public double getamount() {
		this.price = price * quantity;
		this.price = price + (price * SalesTransaction.rateoftax);
		return price;
	}

	public SalesTransaction() {
		count++;
	}

	public int getQuantity() {
		//count++;
		return quantity;
	}

	public void setQuantity(int quantity) {

		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
