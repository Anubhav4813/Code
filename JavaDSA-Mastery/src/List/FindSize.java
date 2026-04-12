package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSize {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80));

        int count = 0;
        for(int i = 0; i < list.size(); i++) {
            count++;
        }
        System.out.println("Size of the list is: " + count);
    }
}
