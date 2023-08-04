package Day_4;

class Employee {
	private String name, job;

	public Employee(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.job);
	}
}

class SalariedEmployee extends Employee {
	protected int salary;

	public SalariedEmployee(String name, String job, int salary) {
		super(name, job);
		this.salary = salary;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.salary);
	}



}

class Consultance extends Employee {
	private int hours;
	private int perhour;

	public Consultance(String name, String job, int hours, int perhour) {
		super(name, job);
		this.hours = hours;
		this.perhour = perhour;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.perhour);
	}

	public double getpayement() {
		return this.hours * this.perhour;
	}
}

class OverseasEmployee extends SalariedEmployee {
	private int allowance;
	//private int salary;

	public OverseasEmployee(String name, String job, int allowance, int salary) {
		super(name, job,salary);
		this.allowance = allowance;
		this.salary = salary;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.allowance);
		
	}

	public double getPayment() {
		return this.allowance + this.salary;
	}

}

public class TestEmployee {

	public static void main(String[] args) {
		

		OverseasEmployee oe = new OverseasEmployee("dinesh", "developer", 10000, 100000);
		oe.print();
		System.out.println(oe.getPayment());

		Consultance cons = new Consultance("Arun", "Developer", 5, 2000);
		cons.print();
		System.out.println(cons.getpayement());

	}

}
