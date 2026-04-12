package SmallLogicalProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindinOneNotinOther {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(3,4,5,6,7);

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < list1.size(); i++) {
            int element = list1.get(i);
            boolean found = false;

            for(int j = 0; j < list2.size(); j++) {
                if(element == list2.get(j)) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                result.add(element);
            }
        }

        System.out.println(result);
    }
}
