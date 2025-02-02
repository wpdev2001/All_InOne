import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        Queue<Integer> integerQueue  = new PriorityQueue<>(); // For MinPriorityQueue
        Queue<Integer> integerQueue  = new PriorityQueue<>(Comparator.reverseOrder());

        integerQueue.offer(20);
        integerQueue.offer(12);
        integerQueue.offer(40);
        integerQueue.offer(19);

//        System.out.println(integerQueue); // OUTPUT: [12, 19, 40, 20] --> min element first rest order is undefined
        System.out.println(integerQueue); //OUTPUT : [40, 19, 20, 12] --> max element first, rest order is undefined.

        System.out.println(integerQueue.peek());

        System.out.println(integerQueue.poll());
        
    }
}