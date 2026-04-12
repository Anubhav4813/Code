package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeyExists {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "mango");

        int key = 4;
        boolean found = false;

        Set<Integer> keys = map.keySet();
        Iterator<Integer> it = keys.iterator();

        while(it.hasNext()) {
            int k = it.next();
            if(k == key) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Key exists");
        } else {
            System.out.println("Key does not exist");
        }
    }
}
