package String;

import java.util.*;

public class SetToList {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        List<Integer> list = new ArrayList<>();

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            list.add(it.next());
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
