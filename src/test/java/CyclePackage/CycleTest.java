package CyclePackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CycleTest {
    @Test // не придумав Assert
    public void test1() {
        for (int i = 1; i <= 27; i++) {
            if (i % 3 == 0 && i < 21 || i == 20) {
                System.out.println("Super " + i);
            } else {
                System.out.println("ne goditcya " + i);
            }
        }
    }
}
