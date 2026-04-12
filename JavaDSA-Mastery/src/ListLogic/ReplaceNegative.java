package ListLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceNegative {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, -30, 40, -50));

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) < 0) {
                list.set(i, 0);
            }
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
