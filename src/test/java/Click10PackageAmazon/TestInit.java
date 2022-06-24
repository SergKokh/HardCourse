package Click10PackageAmazon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class TestInit {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
     public void sleep(int seconds) {
      try {
        Thread.sleep(seconds * 1000);
    }  catch (InterruptedException e) {
        e.printStackTrace();
    }
}


    public void navigateAmazon(){
        driver.get("https://www.amazon.com/");
    }
    public WebElement getHomeAudioMenu() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Home Audio')]"));
    }

    public WebElement getElectronicMenu() {
        return driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
    }

    public WebElement getAllMenu() {
        return driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']//span"));
    }

    public WebElement inputInSearchField() {
        return driver.findElement(By.xpath("//input[@id= \"twotabsearchtextbox\"]"));
    }

    public List<WebElement> selectProduct() {
        return driver.findElements(By.xpath("//span[@class= \"a-size-medium a-color-base a-text-normal\"]"));

    }

    public WebElement selectProduct1() {
        return driver.findElement(By.xpath("//div//div//div//div//div//div//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//h2[1]//a[1]//span[1]"));
    }

    public WebElement productInDisplayed() {
        return driver.findElement(By.xpath("//span[@class='a-size-large product-title-word-break']"));
    }

    private WebElement goToContinue() {
        return driver.findElement(By.xpath("//input[@id=  \"continue\"]"));
    }

    public WebElement reInputPassword() {
        return driver.findElement(By.xpath("//input[@name=  \"passwordCheck\"]"));
    }

    public WebElement inputPassword() {
        return driver.findElement(By.xpath("//input[@name=  \"password\"]"));
    }

    public WebElement inputEmail() {
        return driver.findElement(By.xpath("//input[@name=  \"email\"]"));
    }

    public WebElement inputName() {
        return driver.findElement(By.xpath("//input[@placeholder= \"First and last name\"]"));
    }

    private WebElement getToCreateNewAccount() {
        return driver.findElement(By.xpath("//a[@id= \"createAccountSubmit\"]"));
    }

    public WebElement closeModalWindow() {
        return driver.findElement(By.xpath("//input[@data-action-type= \"DISMISS\"]"));
    }

    public WebElement clickStartHere() {
        return driver.findElement(By.xpath("//a[@class='nav-a']"));
    }

    public WebElement toGoInSignUp() {
        return driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
    }

    public WebElement newRegion() {
        return driver.findElement(By.xpath("//a//span[contains(text(), 'Ukraine')]"));
    }

    public WebElement selectRegionDone() {
        return driver.findElement(By.xpath("//button[@class= \"a-button-text\"]"));
    }

    public WebElement selectRegionUkraine() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Ukraine')]"));
    }

    public WebElement goToСhoiceRegion() {
        return driver.findElement(By.xpath("//span[@data-action=  \"a-dropdown-button\"]"));
    }

    public WebElement deliveryRegionclickBtn() {
        return driver.findElement(By.xpath("//span[@id= \"glow-ingress-line1\"]"));
    }

    public WebElement checkLaptopVisibility() {
        return driver.findElement(By.xpath("//span[contains(text(),'Lenovo Flex 5 Laptop, 14.0\" FHD Touch Display, AMD')]"));
    }

    public WebElement chouseLaptop() {
        return driver.findElement(By.xpath("//span[contains(text(),'Laptops')]"));
    }

    public WebElement chouseComputerAndTablets() {
        return driver.findElement(By.xpath("//a[normalize-space()='Computers & Tablets']"));
    }

    public WebElement chouseComputersCategory() {
        return driver.findElement(By.xpath("//div[normalize-space()='Computers']"));
    }

    public WebElement selectRegionPoland() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Poland')]"));
    }

    public WebElement chouseCallPhone() {
        return driver.findElement(By.xpath("//span[normalize-space()='Apple iPhone 11, 64GB, Black - Unlocked (Renewed)']"));
    }

    public WebElement selectCallPhone() {
        return driver.findElement(By.xpath("//body//div[@id='a-page']//div[@id='search']//div//div//div//div//div[2]//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//h2[1]//a[1]//span[1]"));
    }

    public WebElement getCallPhone() {
        return driver.findElement(By.xpath("//a[@data-routing='off']//span[contains(text(),'Cell Phones')]"));
    }

    public WebElement getCallPhoneAndAcces() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Cell Phones & Accessories')]"));
    }

    public WebElement clickCartBtn() {
        return driver.findElement(By.xpath("//div[@id='nav-cart-text-container']//span[2]"));
    }

    public WebElement productInCard() {
        return driver.findElement(By.xpath("//span[@class= \"a-truncate-cut\"]"));
    }

    public WebElement addProductToCard() {
        return driver.findElement(By.xpath("//input[@id= \"add-to-cart-button\"]"));
    }

    public WebElement fieldSignIn() {
        return driver.findElement(By.xpath("//h1[@class= \"a-spacing-small\"]"));

    }

    public WebElement addToList() {
        return driver.findElement(By.xpath("//span//a[@class= \"a-button-text a-text-left\"]"));
    }

    public WebElement clickEnter() {
        return driver.findElement(By.xpath("//input[@value= \"Go\"]"));
    }

    public WebElement wordComputers() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Computers & Tablets')]"));
    }

    public WebElement valueCurrency() {
        return driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]/span[1]/span[2]/span[1]"));
    }

    public WebElement clickEtmyField() {
        return driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]"));
    }

    public WebElement clickSaveChange() {
        return driver.findElement(By.xpath("//input[@class= \"a-button-input\"]"));
    }

    public WebElement chouseCurrencyEuro() {
        return driver.findElement(By.xpath("//a[@id='icp-currency-dropdown_19']"));
    }

    public WebElement getMenuCurrency() {
        return driver.findElement(By.xpath("//span[@class= \"a-button-text a-declarative\"]"));
    }

    public WebElement clickIkonCuntry() {
        return driver.findElement(By.xpath("//span[@class= \"icp-nav-flag icp-nav-flag-us\"]"));
    }

    public void changeRegionPoland(){
        deliveryRegionclickBtn().click();
        sleep(2);
        goToСhoiceRegion().click();
        selectRegionPoland().click();
        selectRegionDone().click();
    }
    public void goToCallPhonePage(){
        getAllMenu().click();
        sleep(2);
        getElectronicMenu().click();
        sleep(2);
        getCallPhoneAndAcces().click();
        sleep(2);
        getCallPhone().click();
    }


}
