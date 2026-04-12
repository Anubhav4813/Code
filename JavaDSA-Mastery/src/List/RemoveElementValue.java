package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementValue {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        int value = 5;
        int index = -1;

        // find index
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == value) {
                index = i;
            }
        }

        // remove element from index
        if(index != -1) {
            for(int i = index; i < list.size() - 1; i++) {
                list.set(i, list.get(i + 1));
            }

            list.remove(list.size() - 1);
        } else {
            System.out.println("Value not found in the list");
        }
    }
}
