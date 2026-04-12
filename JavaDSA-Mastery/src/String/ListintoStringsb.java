package String;

import java.util.Arrays;
import java.util.List;

public class ListintoStringsb {
    public static void main(String[] args) {
        // take a look at this appraoch
        List<String> list = Arrays.asList("apple", "mango", "banana");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));

            if(i != list.size() - 1) {
                sb.append(", ");
            }
        }

        System.out.println(sb.toString());
    }
}
