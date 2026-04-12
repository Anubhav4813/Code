package SmallLogicalProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class LastOccurence {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,7,7,8,8,5));

        int target = 5;
        for(int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i) == target) {
                System.out.println("Last Occurence: " + i);
                break;
            }
        }
    }
}
