package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        Set<Integer> common = new HashSet<>();

        Iterator<Integer> it = set1.iterator();

        while(it.hasNext()) {
            Integer num = it.next();
            if(set2.contains(num)) {
                common.add(num);
            }
        }

        System.out.println(common);
    }
}
