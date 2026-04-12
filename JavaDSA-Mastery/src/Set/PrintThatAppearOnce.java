package Set;

import java.util.*;

public class PrintThatAppearOnce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,5,5,6,6,7,7,8);

        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if(unique.contains(num)) {
                duplicates.add(num);
            } else {
                unique.add(num);
            }
        }

        System.out.print("Elements appearing only once: ");

        List<Integer> uniqueList = new ArrayList<>(unique);

        for(int i = 0; i < uniqueList.size(); i++) {
            int num = uniqueList.get(i);
            if(!duplicates.contains(num)) {
                System.out.print(num + " ");
            }
        }

    }
}
