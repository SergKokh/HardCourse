package Variables;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestsDouble {

    @Test
    public void testSumma(){
        VariablesDouble variablesDouble = new VariablesDouble();
       // System.out.println(variablesDouble.summa);
        Assert.assertEquals(variablesDouble.summa, 81,0);
    }
    @Test
    public void testDifference(){
        VariablesDouble variablesDouble = new VariablesDouble();
      //  System.out.println(variablesDouble.difference);
        Assert.assertEquals(variablesDouble.difference, 20,0);
    }
    @Test
    public void testMulti(){
        VariablesDouble variablesDouble = new VariablesDouble();
      //  System.out.println(variablesDouble.multi);
        Assert.assertEquals(variablesDouble.multi, 10507,03);
    }
    @Test
    public void testDivision(){
        VariablesDouble variablesDouble = new VariablesDouble();
      //  System.out.println(variablesDouble.division);
        Assert.assertEquals(variablesDouble.division, 2,5);
    }


}
