package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CreateMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "orange");
        map.put(4, "mango");
        map.put(5, "kiwi");

        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
