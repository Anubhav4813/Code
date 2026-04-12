import java.util.ArrayList;

public class Test {
    static void change(int x) {
        x = 50;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        for (Integer i : list) {
            list.add(3); // ❌ modifying while iterating
        }
    }
}