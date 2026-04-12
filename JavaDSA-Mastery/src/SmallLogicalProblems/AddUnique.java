package SmallLogicalProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class AddUnique {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for(int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            boolean isDuplicate = false;

            for(int j = 0; j < uniqueList.size(); j++) {
                if(uniqueList.get(j).equals(current)) {
                    isDuplicate = true;
                    break;
                }

            }

            if(!isDuplicate) {
                uniqueList.add(current);
            }
        }


        System.out.println(uniqueList);
    }
}
