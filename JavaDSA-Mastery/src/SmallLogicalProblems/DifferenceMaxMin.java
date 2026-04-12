package SmallLogicalProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class DifferenceMaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 5, 20, 8, 15));

        int max = list.get(0);
        int min = list.get(0);

        for(int i = 0; i < list.size(); i++) {
            int num = list.get(i);

            if(num > max) {
                max = num;
            } else if(num < min) {
                min = num;
            }
        }

        System.out.println("Difference between max and min: " + (max - min));
    }
}
