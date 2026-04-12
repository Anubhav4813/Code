package String;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";

        List<Character> list = new ArrayList<>();

        for(int i = 0; i < str.length(); i++ ) {
            char ch = str.charAt(i);
            if(!list.contains(ch)) {
                list.add(ch);
            }
        }

        String result = "";
        for(int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            result += ch;
        }

        System.out.println(result);
    }
}
