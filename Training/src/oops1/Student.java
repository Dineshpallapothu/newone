package oops1;

public class Student {
	private int admino;
	private  double feepaid;
	private int course;
	private static double coursefee;

	public static double getCoursefee() {
		return coursefee;
	}

	public static void setCoursefee(double coursefee) {
		Student.coursefee = coursefee;
	}

	public Student() {
	}

	public Student(int admino, double feepaid, int course) {
		this.admino = admino;
		this.feepaid = feepaid;
		this.course = course;
	}

	public double payment() {
		return this.feepaid;
	}

	public double getdue() {

		if (course == 1) {
			return coursefee - feepaid;
		} else {
			return coursefee - feepaid;
		}
	}

	public String getCourseName() {
		if (course == 1) {
			return "java";
		} else {
			return "python";
		}
	}

	public double getfeepaid() {
		return feepaid;
	}

	public double getTotalfee() {
		if (course == 1) {
			return coursefee;
		} else {
			return coursefee;
		}
	}

}
