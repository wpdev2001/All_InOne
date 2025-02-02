import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAccessDemo
{
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        //method 1 : for loop
        for(int i = 0 ;i<list.size();i++){
            System.out.println("Element using for: " + list.get(i));
        }

        //method 2 : foreach loop
        for(Integer element : list){
            System.out.println("Elements using foreach: " + element );
        }

        //method 3: using Iterator
        Iterator ir = list.iterator();
        while(ir.hasNext()){
            System.out.println("Elements using iterator: " + ir.next());
        }
    }
}
