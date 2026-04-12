package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetPosition {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        int element = list.get(3);

        System.out.println(element);
    }
}
