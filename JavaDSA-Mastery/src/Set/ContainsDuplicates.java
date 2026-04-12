package Set;

import java.util.*;

public class ContainsDuplicates {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));

        Set<Integer> set = new HashSet<>(list);

        if(list.size() == set.size()) {
            System.out.println("No duplicates");
        } else {
            System.out.println("Duplicates found");
        }
    }
}
