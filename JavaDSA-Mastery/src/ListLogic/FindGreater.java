package ListLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindGreater {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        int index = 30;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) > index) {
                System.out.println("Greater element is: " + list.get(i));
            }
        }
    }
}
