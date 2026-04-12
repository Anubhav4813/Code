package SmallLogicalProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPositive {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,-4,5,6,7,8,9));

        boolean allPositive = true;

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) < 0) {
                allPositive = false;
            }
        }

        if(allPositive) {
            System.out.println("Are all numbers in the array positive: " + allPositive);
        } else {
            System.out.println("Are all numbers in the array positive: " + allPositive);
        }
    }
}
