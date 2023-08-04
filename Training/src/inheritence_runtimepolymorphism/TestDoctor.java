package inheritence_runtimepolymorphism;

abstract class Doctor {
	protected String name;

	public Doctor(String name) {
		super();
		this.name = name;
	}

	public void print() {
		System.out.println(name);
	}

	public abstract double getpay();
}

class ResidentDoctor extends Doctor {
	private double salary;
	private String address;

	public ResidentDoctor(String name, double salary, String adress) {
		super(name);
		this.salary = salary;
		this.address = adress;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(salary);
		System.out.println(address);
	}

	@Override
	public double getpay() {

		return salary;
	}

}

class consultantDoctor extends Doctor {
	private int visits;
	private double pervisit;
	private String adress;

	public consultantDoctor(String name, int visits, double pervisit, String adress) {
		super(name);
		this.visits = visits;
		this.pervisit = pervisit;
		this.adress = adress;
	}

	@Override
	public double getpay() {

		return visits * pervisit;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(getpay());
		System.out.println(adress);
	}

}

public class TestDoctor {

	public static void main(String[] args) {
		Doctor d = new consultantDoctor("praveen", 10, 1000, "vizag");
		d.print();
		System.out.println(d.getpay());
		System.out.println("----------");
		d = new ResidentDoctor("arun", 10000, "vizag");
		d.print();
		System.out.println(d.getpay());
	}

}
