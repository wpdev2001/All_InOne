import java.util.ArrayDeque;

//We could implement Stack as well as Queue data structure using ArrayDeque
public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.offer(20);
        deque.offerFirst(40);
        deque.offer(25);
        deque.offerLast(45);
        deque.offer(50);
        deque.offer(60);
        deque.offer(80);
        deque.offer(70);

        System.out.println("Original arraydeque" + deque);
        
        //peek
        System.out.println("arraydeque peek: " + deque.peek());
        System.out.println("arraydeque peekFirst: " + deque.peekFirst());
        System.out.println("arraydeque peekLast: " + deque.peekLast());
        
        //poll
        System.out.println("arraydeque poll: " + deque.poll());
        System.out.println("arraydeque pollFirst: " + deque.pollFirst());
        System.out.println("arraydeque pollLast: " + deque.pollLast());

        System.out.println("arraydeque" + deque);


    }
}