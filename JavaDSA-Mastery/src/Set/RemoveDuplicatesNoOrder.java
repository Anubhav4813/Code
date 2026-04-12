package Set;

import java.util.*;

public class RemoveDuplicatesNoOrder {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 20, 20, 30, 30, 10, 40, 50, 60, 60));

        Set<Integer> set = new HashSet<>(list);

        List<Integer> result = new ArrayList<>(set);

        System.out.println(result);
    }
}
