package ArrayPackage;

import org.testng.annotations.Test;

public class ArrayString {

    @Test
    public void test1() {
        String[] array = {"zaq", "xsw", "cde", "vfr", "bgt" };
        for (int i = 0; i < array.length; i++) {
    //        System.out.print(array[i] + " ");
        }
        boolean a = false;
        int index = 0;
        String s = "xsw";
        for (int i = 0; i < array.length; i++) {
            if (s.equals(array[i])) {
                index = i;
                a = true;
                break;
            }
        }
        if (a)
            System.out.println(s + " found at index " + index);
        else
            System.out.println(s + " not found in the array");
    }
}
