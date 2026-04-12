package String;

import java.util.ArrayList;
import java.util.List;

public class StringArraytoList {
    public static void main(String[] args) {
        String[] arr = {"Anubhav", "Singh", "Kumar"};

        List<String> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        System.out.println(list);
    }
}
