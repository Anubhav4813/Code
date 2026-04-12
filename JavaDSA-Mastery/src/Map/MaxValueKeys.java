package Map;

import java.util.*;

public class MaxValueKeys {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 30);

        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();

        int max = Integer.MIN_VALUE;
        List<String> keys = new ArrayList<>();

        while(it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();

            if(entry.getValue() > max) {
                max = entry.getValue();
                keys.clear();
                keys.add(entry.getKey());
            } else if(entry.getValue() == max) {
                keys.add(entry.getKey());
            }
        }

        System.out.println("keys with highest value" + keys);
    }
}
