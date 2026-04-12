package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateValues {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "orange");
        map.put(4, "grapes");

        Iterator<String> it = map.values().iterator();

        while(it.hasNext()) {
            String fruit = it.next();
            System.out.println(fruit);
        }
    }
}
