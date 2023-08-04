package Personal;

class Person{
	static int y=90;
	static void print() {
		
		System.out.println(y);
	}
	public void setSubjects(String string) {
		System.out.println("hai");
		
	}
}
class Teacher extends Person{

	public Teacher(String string, String string2, String string3) {
		
	}

	@Override
	public void setSubjects(String string) {
	System.out.println(string);
		
	}
	
}
public class demo1 {
	
	public static void main(String args[]) {
		Person p = new Teacher("Mike","mike@gmail.com","Java");
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Teacher);
//		if (p instanceof Person t) {
//		t.setSubjects("Java, Java EE");
//		}
//		else {
//			System.out.println("avvadhu");
//		}
	}
	
}
