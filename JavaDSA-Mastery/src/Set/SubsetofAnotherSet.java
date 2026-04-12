package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SubsetofAnotherSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2,3,4,5,6,7));

        boolean isSubset = true;

        Iterator<Integer> it = set1.iterator();

        while(it.hasNext()) {
            int element = it.next();
            if(!set2.contains(element)) {
                isSubset = false;
                break;
            }
        }

        if(isSubset) {
            System.out.println("set1 is subset of set2");
        } else {
            System.out.println("set1 is not subset of set2");
        }
    }
}
