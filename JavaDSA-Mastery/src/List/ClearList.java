package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClearList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        while(!list.isEmpty()) {
            list.remove(0);
        }

        boolean isNil = list.isEmpty();
        System.out.println(isNil);
    }
}
