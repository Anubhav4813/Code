package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountUnique {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        Set<Integer> set = new HashSet<>();
        int count = 0;

        for(int i = 0; i < list.size(); i++) {
            if(!set.contains(list.get(i))) {
                set.add(list.get(i));
                count++;
            }
        }

        System.out.println("Unique elements: " + count);
    }
}
