package inheritence_runtimepolymorphism;

abstract class Course {
	protected String course;
	protected double fee;
	protected double duration;

	public Course(String course, double fee, double duration) {
		super();
		this.course = course;
		this.fee = fee;
		this.duration = duration;
	}

//	public void print() {
//		System.out.println("Course name: " + course);
//		System.out.println("course fee:" + fee);
//		System.out.println("duration in months: " + duration);
//	}

	public abstract double getFee();

}

class Classroom extends Course {
	private double discount = 10;

	public Classroom(String course, double fee, double duration) {
		super(course, fee, duration);

	}

	@Override
	public double getFee() {

		return (fee) - ((discount / 100) * fee);
	}

	@Override
	public String toString() {
		return "Classroom [discount=" + discount + ", course=" + course + ", fee=" + fee + ", duration=" + duration
				+ "]";
	}

}

class OnlineStudent extends Course {
	private String url;

	public OnlineStudent(String course, double fee, double duration, String url) {
		super(course, fee, duration);
		this.url = url;
	}

	@Override
	public double getFee() {

		return fee;
	}

	@Override
	public String toString() {
		return "OnlineStudent [url=" + url + ", course=" + course + ", fee=" + fee + ", duration=" + duration + "]";
	}

}

public class TestCourse {
	public static void main(String args[]) {
		Course cobj = new Classroom("java", 10000, 3.5);

		System.out.println("---------");
		OnlineStudent oobj = new OnlineStudent("sql", 2000, 2, "www.zoom.com");

		System.out.println(cobj);
		System.out.println(oobj);
	}

}
