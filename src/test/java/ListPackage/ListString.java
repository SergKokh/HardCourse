package ListPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ListString {

    @Test
    public void test(){
        ArrayList<String> list = new ArrayList<>();
        list.add("zaq");
        list.add("xsw");
        list.add("cde");
        list.add("vfr");
        list.add(0, "bgt");
        for ( String j : list){
            System.out.print(j + " ");
        }
        System.out.println();
        for ( String i : list){
            if (i=="bgt"){
                System.out.println(i);
                Assert.assertEquals(i, "bgt");
            }
        }
    }
}
