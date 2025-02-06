import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student(3,"AAA"));
        studentSet.add(new Student(2, "BBB"));
        studentSet.add(new Student(3, "CCC"));
        studentSet.add(new Student(1,"DDD"));

        /*Over here even if their names are different but the equals method will check on the
        basis of id and here id is same so the equals method will return it as true.
        */
        Student s1 = new Student(2,"Ram");
        Student s2 = new Student(2,"Shyam");

        System.out.println(s1.equals(s2));

        System.out.println(studentSet);

    }
}