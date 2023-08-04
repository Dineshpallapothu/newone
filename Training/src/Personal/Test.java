package Personal;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String args[]) {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(1,"Corenut","X"));
        studentSet.add(new Student(1,"Corenuts","IX"));
        System.out.println(studentSet);
    }
}