import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(21);
        list.add(45);
        list.add(9);
        list.add(72);
        list.add(22);
        list.add(34);
        list.add(55);
        list.add(9);

        System.out.println("Max element : " + Collections.max(list));
        System.out.println("Min element : " + Collections.min(list));
        System.out.println("Element Frequency : " + Collections.frequency(list,9));

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("List in reverse order: " + list);

    }
}