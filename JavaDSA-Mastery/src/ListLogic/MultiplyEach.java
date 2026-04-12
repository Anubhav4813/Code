package ListLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplyEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        for(int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
