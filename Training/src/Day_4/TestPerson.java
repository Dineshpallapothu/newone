package Day_4;

class Persons{
	protected String name;
	protected String email;
	public Persons(String name,String email) {
		this.name=name;
		this.email=email;
	}
	public void print() {
		System.out.println(this.name);
		System.out.println(this.email);
	}
	
}
class Teacher extends Persons{
	protected String subject;
	public Teacher(String name,String email,String subject) {
		super(name,email);
		this.subject=subject;
		
	}
	@Override
	public void print() {
		super.print();
		System.out.println(subject);
	}
}
class Student extends Persons{
	protected String course;
	public Student(String name,String email,String  course) {
		super(name,email);
		this.course=course;
	}
	@Override
	public void print() {
		super.print();
		System.out.println(course);
	}
	
}
public class TestPerson {

	public static void main(String[] args) {
		
		Teacher obj=new Teacher("dinesh","dineshpallapothu@gmail.com","java");
		obj.print();
		Student obj1=new Student("arun","arungunisetti@gmail.com","java-fullstack");
		obj1.print();
	}

}
