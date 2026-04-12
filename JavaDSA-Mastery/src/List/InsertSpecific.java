package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertSpecific {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        int value = 100;
        int index = 2;

        if(index >= 0 && index <= list.size()) {

            list.add(0);
            for(int i = list.size() - 1; i > index; i--) {
                list.set(i, list.get(i - 1));
            }

            list.set(index, value);
        } else {
            System.out.println("Index out of bounds");
        }

        for(int num : list) {
            System.out.print(num + " ");
        }
    }
}
