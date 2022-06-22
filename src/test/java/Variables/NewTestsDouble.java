package Variables;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestsDouble {

    @Test
    public void testSumma(){
        VariablesDouble variablesDouble = new VariablesDouble();
       // System.out.println(variablesDouble.summa);
        Assert.assertEquals(variablesDouble.summa(50.50, 20.20, 10.30), 81,0);
    }
    @Test
    public void testDifference(){
        VariablesDouble variablesDouble = new VariablesDouble();
      //  System.out.println(variablesDouble.difference);
        Assert.assertEquals(variablesDouble.difference(50.50, 20.20, 10.30), 20,0);
    }
    @Test
    public void testMulti(){
        VariablesDouble variablesDouble = new VariablesDouble();
        System.out.println(variablesDouble.multi(50.50, 20.20, 10.30));
        Assert.assertEquals(variablesDouble.multi(50.50, 20.20, 10.30), 10507,03);
    }
    @Test
    public void testDivision(){
        VariablesDouble variablesDouble = new VariablesDouble();
      //  System.out.println(variablesDouble.division);
        Assert.assertEquals(variablesDouble.division(50.50, 20.20), 2,5);
    }


}
