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

//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }
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
        return driver.findElement(By.xpath("//a[@aria-label='Open Menu']//i"));
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


}
