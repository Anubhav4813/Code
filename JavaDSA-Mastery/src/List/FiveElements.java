package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FiveElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<5; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("List Elements are: ");
        for(int num : list) {
            System.out.println(num);
        }
    }
}
