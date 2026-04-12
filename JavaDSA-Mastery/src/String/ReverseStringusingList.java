package String;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringusingList {
    public static void main(String[] args) {
        String str = "Anubhav";

        List<Character> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--) {
            reversed += list.get(i);
        }

        System.out.println(reversed);
    }
}
