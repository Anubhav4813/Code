package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountFrequencyString {
    public static void main(String[] args) {
        String str = "programming";

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry<Character, Integer> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
