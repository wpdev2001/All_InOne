import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //It follows insertion order
        //Doesn't allow any duplicates
        Set<Integer> hs = new LinkedHashSet<>();

        hs.add(25);
        hs.add(35);
        hs.add(15);
        hs.add(10);
        hs.add(40);
        hs.add(25);

        System.out.println(hs);

        hs.remove(10); // what if the element doesn't exists? --> don't throw any exception or any error.
        hs.remove(22);

        System.out.println(hs);

        System.out.println(hs.contains(40));
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
        hs.clear();

        System.out.println(hs);

    }
}