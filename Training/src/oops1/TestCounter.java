package oops1;

class Counter {
	private int counter = 0;
	private int objcount = 0;

	public Counter() {
		objcount++;
	}

	public void getIncreement() {
		counter++;
	}

	public void getDecreemenr() {
		counter--;

	}

	public int getValue() {
		return counter;
	}

	public int getobjcount() {
		return objcount;
	}
}

public class TestCounter {

	public static void main(String[] args) {
		Counter count = new Counter();
		count.getIncreement();
		count.getIncreement();
		System.out.println(count.getValue());
		count.getDecreemenr();
		System.out.println(count.getValue());
		System.out.println("objects count: " + count.getobjcount());
	}

}
