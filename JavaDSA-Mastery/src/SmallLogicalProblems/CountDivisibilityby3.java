package SmallLogicalProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class CountDivisibilityby3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));

        int count = 0;

        for(int i = 0; i < list.size(); i++ ) {
            if (list.get(i) % 3 == 0) {
                count++;
            }
        }

        System.out.println("Total numbers that are divisible by 3 are: " + count);
    }
}
