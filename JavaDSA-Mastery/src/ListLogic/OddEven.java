package ListLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 35, 44, 45, 53, 57, 60, 72, 89));

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
                System.out.println(list.get(i) + " is even");
            } else {
                System.out.println(list.get(i) + " is odd");
            }
        }
    }
}
