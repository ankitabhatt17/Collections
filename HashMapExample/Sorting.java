package HashMapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// This  class use to perfomr hashmap sorting
public class Sorting {
    public static void main(String st[]){
        HashMap<Integer, Integer> intMap = new HashMap<>();
        intMap.put(9,60);
        intMap.put(2, 30);
        intMap.put(4,50);

//        intMap.keySet().stream().sorted().forEach(e -> System.out.println(e));
//
//        intMap.values().stream().sorted();

        TreeMap<Integer, Integer> treemap = new TreeMap<>(intMap);




        for(Map.Entry<Integer, Integer> k:  intMap.entrySet()){
        System.out.println(k.getKey());
            System.out.println(k.getValue());
        }



    }
}
