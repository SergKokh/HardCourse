package Division;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDivision {

    @Test
    private void test1(){
        int a = 50;
        int b = 10;
        int c = a / b;
        System.out.println(c);
        Assert.assertEquals(c, 5);
    }
    @Test

    private void test2(){
        double a = 55;
        double b = 6;
        double c = a / b;
        System.out.println(c);
        Assert.assertEquals(c, 9,16);

    }
}
