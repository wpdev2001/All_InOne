import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("cat");
        animals.push("dog");
        animals.push("elephant");

        //To see the topmost element
        System.out.println(animals.peek());

        //To remove the top most element
        System.out.println(animals.pop());

        //Other Functions
    }
}