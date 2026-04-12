package SmallLogicalProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class ListSquare {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        ArrayList<Integer> square = new ArrayList<>();

        for(int i = 0; i < list.size(); i++) {
            square.add(list.get(i) * list.get(i));
        }

        System.out.println(square);
    }
}
