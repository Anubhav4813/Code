package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveElement {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        int element = 30;

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            int num  = it.next();
            if(num == element) {
                it.remove();
            }
        }

        Iterator<Integer> it2 = set.iterator();
        while(it2.hasNext()) {
            System.out.print(it2.next() + " ");
        }
    }
}
