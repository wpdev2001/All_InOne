import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //TreeMap sorts the elements on the basis of keys
        Map<Integer,String> map = new TreeMap<>(Comparator.reverseOrder());

        map.put(1,"AAA");
        map.put(4,"BBB");
        map.put(3,"CCC");
        map.put(5,"EEE");
        map.put(2,"DDD");
        //map.put(1,"CCC"); --> it will get override

//        Method1
//        if(!map.containsKey(1)) {
//            map.put(1,"CCC");
//        }

        //Method 2
//        map.putIfAbsent(1,"CCC");

        System.out.println(map);
        System.out.println(map.containsValue("AAA"));
        System.out.println(map.isEmpty());
        map.remove(3);
        System.out.println(map);
        map.clear();
/*
        //iterating the map
        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Iterating only keys
        for(Integer key : map.keySet()){
            System.out.println(key);
        }

        //Iterating values only
        for(String value : map.values()){
            System.out.println(value);
        }

 */
    }
}