package SmallLogicalProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,9));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5,6,7,8,10,12));
        ArrayList<Integer> merged = new ArrayList<>();

        for(int i = 0; i < list1.size(); i++) {
            merged.add(list1.get(i));
        }

        for(int i = 0; i < list2.size(); i++) {
            merged.add(list2.get(i));
        }

        for(int i = 0; i < merged.size(); i++) {
            System.out.print(merged.get(i) + " ");
        }
    }
}
