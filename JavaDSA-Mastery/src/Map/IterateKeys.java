package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateKeys {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "mango");

        Iterator<Integer> it = map.keySet().iterator();

        while(it.hasNext()) {
            Integer nums = it.next();
            System.out.println(nums);
        }
    }
}
