package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateKeyValuePairs {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "mango");

        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
