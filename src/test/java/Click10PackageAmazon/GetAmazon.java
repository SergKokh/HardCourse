package Click10PackageAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetAmazon extends TestInit{

    @Test
    public void checkHomeAudioVisibility() {
        navigateAmazon();
        getAllMenu().click();
        getElectronicMenu().click();
    //    getHomeAudioMenu().isDisplayed();
        Assert.assertTrue(getHomeAudioMenu().isDisplayed());
    }
    @Test
    public void checkSelectedProduct(){
        navigateAmazon();
        inputInSearchField().sendKeys("Samsung\n");
        selectProduct1().click();
        productInDisplayed().isDisplayed();
        Assert.assertTrue(productInDisplayed().isDisplayed());

    }

//    @Test
//    public void signUpAmazon(){
//        navigateAmazon();
////        sleep(3);
////        closeModalWindow().click();
////        sleep(10);
//        toGoInSignUp().click();
//  //      clickStartHere().click();
//        getToCreateNewAccount().click();
//        inputName().sendKeys("Ivan Ivanov");
//        inputEmail().sendKeys("IvanTest147@gmail.com");
//        inputPassword().sendKeys("qw1234as");
//        reInputPassword().sendKeys("qw1234as");
//        goToContinue().click();
//    }

    @Test
    public void checkChangeDeliveryRegion(){
        navigateAmazon();
        deliveryRegionclickBtn().click();
        sleep(2);
        goToСhoiceRegion().click();
        selectRegionUkraine().click();
        selectRegionDone().click();
        Assert.assertTrue(newRegion().isDisplayed());
    }

    @Test
    public void checkComputerLink(){
        navigateAmazon();
        getAllMenu().click();
        sleep(2);
        chouseComputersCategory().click();
        chouseComputerAndTablets().click();
        sleep(2);
        chouseLaptop().click();
        Assert.assertTrue(checkLaptopVisibility().isDisplayed());

    }

    @Test
    public void checkPhoneForPoland(){
        navigateAmazon();
        deliveryRegionclickBtn().click();
        sleep(2);
        goToСhoiceRegion().click();
        selectRegionPoland().click();
        selectRegionDone().click();
        sleep(2);
        getAllMenu().click();
        sleep(2);
        getElectronicMenu().click();
        getCallPhoneAhdAcces().click();
        sleep(2);
        getCallPhone().click();
        selectCallPhone().click();
        Assert.assertTrue(chouseCallPhone().isDisplayed());

    }

    public WebElement chouseCallPhone() {
        return driver.findElement(By.xpath("//span[normalize-space()='Apple iPhone 11, 64GB, Black - Unlocked (Renewed)']"));
    }

    public WebElement selectCallPhone() {
        return driver.findElement(By.xpath("//span[normalize-space()='Apple iPhone 11, 64GB, Black - Unlocked (Renewed)']"));
    }

    public WebElement getCallPhone() {
        return driver.findElement(By.xpath("//a[@data-routing='off']//span[contains(text(),'Cell Phones')]"));
    }

    public WebElement getCallPhoneAhdAcces() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Cell Phones & Accessories')]"));
    }


}

