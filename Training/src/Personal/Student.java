package Personal;

import java.util.Objects;

public class Student {

    private int id;
    private String name;
    private String grade;
    public Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", grade='" + grade + '\'' + '}';
    }
}