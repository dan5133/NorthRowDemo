import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;

import java.util.Properties;
import java.util.logging.Logger;

public class FunctionalityTest extends BaseClass {
    private Logger log = Logger.getLogger(Log.class.getName());
    private WebDriver driver;
    private Properties p;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        p = getObjRepo();

    }
    @Test

    public void usingRightCredentials() {
        driver.get(p.get("url").toString());
        driver.manage().window().maximize();
        WebElement uName = driver.findElement(By.xpath(p.get("username").toString()));
        uName.sendKeys(p.get("uname_val").toString());
        WebElement uPassWord = driver.findElement(By.xpath(p.get("password").toString()));
        uPassWord.sendKeys(p.get("upass_val").toString());
        WebElement logInButton = driver.findElement(By.xpath(p.get("login_btn").toString()));
        logInButton.click();
        driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"product_sort_container\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"product_sort_container\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-bike-light\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"remove-sauce-labs-backpack\"]")).click();
        driver.findElement(By.linkText("2")).click();
        driver.findElement(By.cssSelector(".cart_item:nth-child(3) > .cart_quantity")).click();
        driver.findElement(By.cssSelector(".cart_item:nth-child(3) > .cart_quantity")).click();
        driver.findElement(By.cssSelector("*[data-test=\"checkout\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"continue\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"cancel\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"remove-sauce-labs-bolt-t-shirt\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"continue-shopping\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
        driver.findElement(By.linkText("2")).click();
        driver.findElement(By.cssSelector("*[data-test=\"checkout\"]")).click();
        driver.quit();


}}
