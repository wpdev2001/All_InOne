import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClassOnStudent {
    public static void main(String[] args) {
        List<Student> studentList= new ArrayList<>();

        studentList.add(new Student(101,"AAA"));
        studentList.add(new Student(104,"BBB"));
        studentList.add(new Student(103,"CCC"));
        studentList.add(new Student(102,"SSS"));
        studentList.add(new Student(105,"EEE"));

        //student list before sorting
        System.out.println("Student List before sorting");
        for (Student s : studentList){
            System.out.println(s);
        }

        //Collections.sort internally calls the compareTo() method of Comaparable interface
        // And the below line won't work until we implement the Comparable interface in Student class
        /*
        Collections.sort(studentList);

        //Student list after sorting
        System.out.println("Student list after sorting");
        for (Student s : studentList){
            System.out.println(s);
        }

         */

        //Inorder to sort the Collections based on multiple fields we make a use of Comparator method

        //USING ANONYMOUS FUNCTION
        /*
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student first, Student second) {
                return first.getName().compareTo(second.getName());
            }
        });
         */

        //USING LAMBDA

        //Collections.sort(studentList, (s1,s2) -> s1.getName().compareTo(s2.getName()));

        //USING METHOD REFERENCING
        Collections.sort(studentList, Comparator.comparing(Student::getName));

        //After sorting using Comparator
        System.out.println("After sort using Comparator");
        for (Student s : studentList){
            System.out.println(s);
        }
    }
}
