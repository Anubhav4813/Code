package ListLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 5, 30, 25, 55, 45, 95, 545));

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) > largest) {
                secondLargest = largest;
                largest = list.get(i);
            } else if (list.get(i) == secondLargest && list.get(i) != largest) {
                secondLargest = list.get(i);
            }
        }

        System.out.println("Second Largest Number is: " + secondLargest);
    }

}
