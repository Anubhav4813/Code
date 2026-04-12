package SmallLogicalProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstElementGreaterArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int target = 4;

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > target) {
                System.out.println(arr.get(i));
                break;
            }
        }
    }
}
