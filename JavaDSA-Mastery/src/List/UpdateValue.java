package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdateValue {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        int index = 1;
        int value = 100;
        if (index >= 0 && index < list.size()) {
            for(int i = 0; i < list.size(); i++)  {
                if(i == index) {
                    list.set(i, value);
                }
            }
        } else {
            System.out.println("Index out of bounds");
        }


        for(int num : list) {
            System.out.print(num + " ");
        }
    }
}
