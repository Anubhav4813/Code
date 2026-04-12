package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveElementIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

//        System.out.println("Enter your choice");
//        System.out.println("1. Remove an element by index");
//        System.out.println("2. Remove an element by value");
//        int choice = sc.nextInt();
//        if(choice == 1) {
//            System.out.println("Enter the element's index you want to remove: ");
//            int m = sc.nextInt();
//
//            list.remove(m);
//        } else if (choice == 2) {
//            System.out.println("Enter the value you want to remove: ");
//            int n = sc.nextInt();
//            boolean removed = list.remove(Integer.valueOf(n));
//            if(!removed) {
//                System.out.println("Element not found");
//            }
//        }

        int index = 2;

        if(index >= 0 && index < list.size()) {
            for(int i = index; i < list.size() - 1; i++) {
                list.set(i, list.get(i + 1));
            }

            list.remove(list.size() - 1);
        }

        for(int nums: list) {
            System.out.print(nums + " ");
        }
    }
}
