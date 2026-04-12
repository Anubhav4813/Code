package String;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AddandPrintSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
