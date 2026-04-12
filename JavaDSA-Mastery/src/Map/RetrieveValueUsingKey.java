package Map;

import java.util.HashMap;
import java.util.Map;

public class RetrieveValueUsingKey {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        Integer value = map.get("B");

        System.out.println("Value for key B: " + value);
    }
}
