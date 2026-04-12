package String;

import java.util.ArrayList;
import java.util.List;

public class WordLengths {
    public static void main(String[] args) {
        String str = "Java is the best programming language";

        List<Integer> lengthList = new ArrayList<>();
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch != ' ') {
                count++;
            } else {
                lengthList.add(count);
                count = 0;
            }
        }

        // Add last word length
        lengthList.add(count);
        System.out.println(lengthList);
    }
}
