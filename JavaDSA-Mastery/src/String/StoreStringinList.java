package String;

import java.util.ArrayList;
import java.util.List;

public class StoreStringinList {
    public static void main(String[] args) {
        String str = "Anubhav";
        System.out.println(str);

        List<Character> list = new ArrayList<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            list.add(ch);
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");
        }
    }
}
