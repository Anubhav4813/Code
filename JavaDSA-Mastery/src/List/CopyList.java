package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        List<Integer> list2 = new ArrayList<>();

        for(int i = 0; i < list.size(); i++) {
            list2.add(list.get(i));
        }

        for(int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
    }
}
