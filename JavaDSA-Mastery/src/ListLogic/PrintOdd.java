package ListLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintOdd {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 2, 30, 33, 53, 73, 79, 87, 4, 50, 6, 70, 8));

        for(int i = 0; i < list.size(); i++) {
            if(i % 2 != 0 ) {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
