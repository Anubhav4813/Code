package Set;

import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 50, 60, 60, 70, 70));

        Set<Integer> seen = new LinkedHashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        for(int i = 0; i < list.size(); i++) {
            if(!seen.add(list.get(i))){
                duplicates.add(list.get(i));
            }
        }

        seen.removeAll(duplicates);
        System.out.print("Unique elements: " + seen);
    }
}
