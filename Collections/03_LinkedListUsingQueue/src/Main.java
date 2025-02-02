import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //Adding elements inside queue || Alternate method use of add() method
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        //Removing the head element || Alternate method use of remove()
        System.out.println(queue.poll());

        //Returns the head of queue || Alternate method use of element()
        System.out.println(queue.peek());
    }
}