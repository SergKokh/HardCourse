package ArrayPackage;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayInt {
    @Test
    public void array1() {
        int[] array = {12, 6, 25, 8, 14, 7, -10, 27};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);{
            for (int i=0; i<array.length; i++){
                System.out.print(array[i] + " ");
            }
        }
    }
}
