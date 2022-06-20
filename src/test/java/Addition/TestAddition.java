package Addition;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddition {

    @Test
    private void test1(){
        int a = 10;
        int b = 15;
        int c = 20;
        int d = a + b +c;
        System.out.println(d);
        Assert.assertEquals(d, 45);

    }
    @Test
    private void test2(){
        double a = 5.45;
        double b = 13.56;
        double c = 25.25;
        double d = a + b + c;
        System.out.println(d);
        Assert.assertEquals(d, 46,26);
    }
}
