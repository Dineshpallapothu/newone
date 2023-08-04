package oops1;

class Interest {
	private double amount;
	private double rate;

	public Interest(double amount, double rateofInterest) {
		super();
		this.amount = amount;
		this.rate = rateofInterest;
	}

	public Interest(double amount) {
		super();
		this.amount = amount;
		this.rate = 10;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getRate() {
		return this.rate;
	}

	public void setAmount(double Amount) {
		this.amount = Amount;
	}

	public double getAmount() {
		return amount;
	}

	public double getInterest() {
		return ((rate / 100) * amount);
	}

}

public class TestInterest {
	public static void main(String[] args) {
		Interest obj = new Interest(10000);
		System.out.println(obj.getAmount());
		System.out.println(obj.getRate());
		System.out.println(obj.getInterest());

	}

}
