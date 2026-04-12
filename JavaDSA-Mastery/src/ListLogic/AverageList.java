package ListLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 22, 33, 44, 55, 66, 77, 88, 99));

        int total_count = 0;
        for(int i = 0; i < list.size(); i++) {
            total_count++;
        }

        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        int average = sum / total_count;
        System.out.println(average);
    }
}
