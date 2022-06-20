package Subtraction;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSubtraction {

    @Test
    private void test1(){
        int a = 50;
        int b = 20;
        int c = 10;
        int d = a - b - c;
        System.out.println(d);
        Assert.assertEquals(d, 20);

    }
    @Test
    private void test2(){
        double a = 45.45;
        double b = 20.00;
        double c = 10.45;
        double d = a - b- c;
        System.out.println(d);
        Assert.assertEquals(d, 15,4);

    }
}
