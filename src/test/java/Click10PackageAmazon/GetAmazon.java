package Click10PackageAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GetAmazon extends TestInit{

    @Test
    public void checkHomeAudioVisibility() {
        navigateAmazon();
        sleep(2);
        getAllMenu().click();
        getElectronicMenu().click();
    //    getHomeAudioMenu().isDisplayed();
        Assert.assertTrue(getHomeAudioMenu().isDisplayed());
    }
    @Test
    public void checkSelectedProduct(){
        navigateAmazon();
        inputInSearchField().sendKeys("Samsung\n");
        sleep(2);
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
        getCallPhoneAndAcces().click();
        sleep(2);
        getCallPhone().click();
        sleep(2);
        selectCallPhone().click();
        sleep(2);
        Assert.assertTrue(chouseCallPhone().isDisplayed());

    }

    @Test
    public void addToCart(){
        navigateAmazon();
        changeRegionPoland();
        sleep(3);
        goToCallPhonePage();
        sleep(2);
        selectCallPhone().click();
        sleep(2);
        addProductToCard().click();
        sleep(3);
        clickCartBtn().click();
        Assert.assertTrue(productInCard().isDisplayed());

    }
    @Test
    public void checkCleanCart(){
        navigateAmazon();
        changeRegionPoland();
        sleep(3);
        goToCallPhonePage();
        sleep(2);
        selectCallPhone().click();
        sleep(2);
        addProductToCard().click();
        sleep(3);
        clickCartBtn().click();
        deleteProductFromCart().click();
        sleep(2);
        Assert.assertEquals(cartIsEmpty().getText(), "Your Amazon Cart is empty.");
    }

    public WebElement cartIsEmpty() {
        return driver.findElement(By.xpath("//h1[@class= \"a-spacing-mini a-spacing-top-base\"]"));
    }

    public WebElement deleteProductFromCart() {
        return driver.findElement(By.xpath("//input[@value= \"Delete\"]"));
    }

    @Test
    public void checkAddList(){
        navigateAmazon();
        changeRegionPoland();
        sleep(2);
        goToCallPhonePage();
        sleep(2);
        selectCallPhone().click();
        sleep(2);
        addToList().click();
        Assert.assertEquals(fieldSignIn().getText(), "Sign-In");

    }

    @Test
    public void checkSearchField(){
        navigateAmazon();
        changeRegionPoland();
        sleep(2);
        inputInSearchField().sendKeys("computers");
        clickEnter().click();
        sleep(3);
        Assert.assertEquals(wordComputers().getText(), "Computers & Tablets");

    }

    @Test
    public void changePaymentCurrency(){
        navigateAmazon();changeRegionPoland();
        sleep(2);
        goToCallPhonePage();
        sleep(3);
        clickIkonCuntry().click();
        sleep(2);
        getMenuCurrency().click();
        sleep(2);
        chouseCurrencyEuro().click();
        sleep(2);
        clickSaveChange().click();
        sleep(2);
        Assert.assertEquals(valueCurrency().getText(), "EUR");
    }

}

