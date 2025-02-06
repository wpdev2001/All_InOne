import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    /*
    LinkedHashMap is a subclass of HashMap that maintains the insertion order of elements.
    It is part of Java's java.util package and extends HashMap while maintaining a doubly linked list to preserve order.
     */
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();

        // Adding key-value pairs
        linkedMap.put(1, "Apple");
        linkedMap.put(3, "Orange");
        linkedMap.put(2, "Banana");
        linkedMap.put(4, "Grapes");

        // Display the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedMap);

        // Accessing elements
        System.out.println("Value of key 2: " + linkedMap.get(2));

        // Checking if key exists
        System.out.println("Contains key 3? " + linkedMap.containsKey(3));

        // Checking if value exists
        System.out.println("Contains value 'Mango'? " + linkedMap.containsValue("Mango"));

        // Removing an element
        linkedMap.remove(3);
        System.out.println("After removing key 3: " + linkedMap);

        // Iterating using for-each loop
        System.out.println("Iterating LinkedHashMap:");
        for (Map.Entry<Integer, String> entry : linkedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Clearing the map
        linkedMap.clear();
        System.out.println("After clearing: " + linkedMap);
    }
}
