import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1{
    int id;
    String name;

    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ComparatorUsingMultipleSortFields {
    public static void main(String[] args) {

        List<Student1> students = new ArrayList<>();
        students.add(new Student1(3, "John"));
        students.add(new Student1(1, "Alice"));
        students.add(new Student1(2, "Bob"));
        students.add(new Student1(5, "Alice"));
        students.add(new Student1(4, "John"));

        //Sorting the list on the basis of Id and then Name
        Collections.sort(students,Comparator.comparing(Student1 :: getName).thenComparing(Student1::getId));

        //Sorting using multicomparator
        System.out.println("Sorting using multicomparator");
        for(Student1 s : students){
            System.out.println(s);
        }

        //SAME THING USING ANONYMOUS INNER CLASS

//        public int compare(Student s1, Student s2) {
//            int nameCompare = s1.getName().compareTo(s2.getName()); // Sort by name
//            if (nameCompare != 0) {
//                return nameCompare; // If names are different, return name comparison result
//            }
//            return Integer.compare(s1.getId(), s2.getId()); // If names are same, sort by ID
//        }
    }
}
