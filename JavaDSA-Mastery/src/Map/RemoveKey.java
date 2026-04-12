package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveKey {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "orange");
        map.put(4, "grapes");

        int keyToRemove = 2;

        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            if(entry.getKey() == keyToRemove) {
                it.remove();
            }
        }

        System.out.println(map);
    }
}
