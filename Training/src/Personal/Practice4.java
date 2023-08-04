package Personal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class Students {
	int rollno;
	String name;
	String grade;
	int marks;

	public Students(int rollno, String name, String grade, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.grade = grade;
		this.marks = marks;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getRollno() {
		return rollno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(grade, marks, name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(grade, other.grade) && marks == other.marks && Objects.equals(name, other.name)
				&& rollno == other.rollno;
	}

	@Override
	public String toString() {
		return "Students [ rollno = " + rollno + ",name = " + name + ", grade = " + grade + ", marks = " + marks + " ]";
	}
}

class SortMarks implements Comparator<Students> {
	@Override
	public int compare(Students s1, Students s2) {
		return s1.getMarks() - s2.getMarks();
	}
}

public class Practice4 {
	public static void main(String n[]) {
		List<Students> st = new ArrayList<Students>();
		st.add(new Students(12, "Praveen", "B", 520));
		st.add(new Students(14, "Arun", "A", 540));
		st.add(new Students(13, "Bharath", "A", 550));
		st.add(new Students(11, "Dinesh", "B", 525));
		st.add(new Students(12, "Praveen", "B", 520));

		Collections.sort(st, new SortMarks());

		for (Students s : st) {
			System.out.println(s);
		}

	}
}
