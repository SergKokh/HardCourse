package ListPackage;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class ListInteger {

    @Test
    public void test() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(0, 10);
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        list.set(0, 33);
        list.set(1, 55);
        list.set(2, 44);
        for (Integer j : list) {
            System.out.print(j + " ");
        }
    }
}
