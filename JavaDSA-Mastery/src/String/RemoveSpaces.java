package String;

import java.util.ArrayList;
import java.util.List;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Hello World Programming";

        List<Character> list = new ArrayList<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch != ' ') {
                list.add(ch);
            }
        }

        String result = "";
        for(int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }

        System.out.println("Original String: " + str);
        System.out.println("RemoveSpaces: " + result);
    }
}
