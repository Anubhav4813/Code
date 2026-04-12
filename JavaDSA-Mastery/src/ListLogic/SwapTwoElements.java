package ListLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapTwoElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        int temp;
        temp = list.get(0);
        list.set(0, list.get(1));
        list.set(1 ,temp);

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
