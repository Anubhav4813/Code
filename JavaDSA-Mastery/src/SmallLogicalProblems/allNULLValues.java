package SmallLogicalProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class allNULLValues {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11, 23, 35, 47, 58, 93, null, null, 102, null));

        int count = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == null) {
                count++;
            }
        }
        System.out.println("Total number of NULL values: " + count);
    }
}
