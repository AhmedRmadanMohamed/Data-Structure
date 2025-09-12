package Recovery.LinkedHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LikedHashMapClass {


    public static void LinkedHashMapMethod() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            System.out.println("-------------------------------------------------------");

        }


        map.forEach((I, A) -> System.out.println(I + " : " + A));
    }

    public static void HashMapMethod() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.forEach((I, A) -> System.out.println(I + " : " + A));

    }

}
