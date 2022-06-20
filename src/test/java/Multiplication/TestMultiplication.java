package Multiplication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMultiplication {

    @Test
    private void test1(){
        int a = 2;
        int b = 3;
        int c = 10;
        int d = a * b * c;
        System.out.println(d);
        Assert.assertEquals(d, 60);
    }
    @Test
    private void test2(){
        double a = 1.25;
        double b = 2.89;
        double c = 3.05;
        double d = a * b * c;
        System.out.println(d);
        Assert.assertEquals(d, 11, 1);

    }


}
