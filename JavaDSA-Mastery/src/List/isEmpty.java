package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class isEmpty {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2));

        boolean isEmpty = true;
        for(int i : list) {
            isEmpty = false;
            break;
        }

        if(isEmpty) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }
    }
}
