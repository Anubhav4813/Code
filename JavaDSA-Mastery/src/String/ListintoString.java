package String;

import java.util.Arrays;
import java.util.List;

public class ListintoString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "mango", "banana");

        String result = String.join(",", list);
        System.out.println(result);
    }
}
