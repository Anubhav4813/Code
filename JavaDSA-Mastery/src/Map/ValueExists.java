package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ValueExists {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "mango");

        String valuetoCheck = "mangoes";
        boolean found = false;

        Collection<String> collectionValues = map.values();
        Iterator<String> it = collectionValues.iterator();

        while(it.hasNext()) {
            String str = it.next();
            if(str == valuetoCheck) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Value exists");
        } else {
            System.out.println("Value does not exist");
        }
    }
}
