package Day_8;

record Circle(int x, int y, int radius) {

	public double getarea() {
		return Math.PI* Math.pow(radius, 2);
	}

	



}
public class TestCircle {

	public static void main(String[] args) {
		
		Circle cobj=new Circle(5,5,5);
		System.out.println(cobj.getarea());
		System.out.println(cobj.toString());
		System.out.println(cobj.x());
	}

}
