package Variables;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestsInt {

    @Test
    public void testSumma(){
        VariablesInt variablesInt = new VariablesInt();
        //  System.out.println(variablesInt.summa);
        Assert.assertEquals(variablesInt.summa, 80);
    }
    @Test
    public void testDifference(){
        VariablesInt variablesInt = new VariablesInt();
       // System.out.println(variablesInt.difference);
        Assert.assertEquals(variablesInt.difference, 20);
    }
    @Test
    public void testMulti(){
        VariablesInt variablesInt = new VariablesInt();
      //  System.out.println(variablesInt.multi);
        Assert.assertEquals(variablesInt.multi, 10000);
    }
    @Test
    public void testDivision(){
        VariablesInt variablesInt = new VariablesInt();
       // System.out.println(variablesInt.division);
        Assert.assertEquals(variablesInt.division, 2);
    }
}
