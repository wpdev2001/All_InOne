import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List<Integer> list  = new LinkedList<>();
        list.add(11);
        list.add(22);
        list.add(20);

        //Adding element at specific index
        list.add(1,40);

        //Creating new ArrayList
        List<Integer> list2 = new LinkedList<>();
        list2.add(101);
        list2.add(102);
        list2.add(104);

        System.out.println("List before adding elements: " + list);

        //ARRAYLIST METHODS:

        //adding elements of second list to first
        list.addAll(list2); //addAll
        System.out.println(list);

        System.out.println("Element at Index 3: " + list.get(3)); //get()

        list.remove(1); //removing index 1 element
        list.remove(Integer.valueOf(1000)); // removing element 1000 from the list

        list.set(2,1000); // updates the index 2 element to 1000
        list.contains(50); // checks whether 50 is present in the list

        list.clear(); // to clear all the elements of list

    }
}