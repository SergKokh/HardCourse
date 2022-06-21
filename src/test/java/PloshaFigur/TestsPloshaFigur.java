package PloshaFigur;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsPloshaFigur {

    @Test
    public void test1(){
          MetodPloshaFigur pl = new MetodPloshaFigur();
        System.out.println(pl.ploshaKvadrata());
        Assert.assertEquals(pl.ploshaKvadrata(), 900);

    }
    @Test
    public void test2(){
        MetodPloshaFigur pl = new MetodPloshaFigur();
        System.out.println(pl.ploshaKruga());
        Assert.assertEquals(pl.ploshaKruga(), 706.5);
    }
    @Test
    public void test3(){
        MetodPloshaFigur pl = new MetodPloshaFigur();
        System.out.println(pl.ploshaPryamokutnyka());
        Assert.assertEquals(pl.ploshaPryamokutnyka(), 450);
    }
    @Test
    public void test4(){
        MetodPloshaFigur pl = new MetodPloshaFigur();
        System.out.println(pl.ploshaTrykutnyka());
        Assert.assertEquals(pl.ploshaTrykutnyka(), 75);
    }
}
