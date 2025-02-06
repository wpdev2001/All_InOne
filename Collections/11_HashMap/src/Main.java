import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"AAA");
        map.put(2,"BBB");
        map.put(3,"CCC");
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