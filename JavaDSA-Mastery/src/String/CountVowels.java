package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountVowels {
    public static void main(String[] args) {
        String str = "Anubhav";

        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if(vowels.contains(ch)) {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}
