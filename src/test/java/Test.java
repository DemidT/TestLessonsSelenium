import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Test {

    private WebDriver driver;

    @BeforeTest
    public void profileSetup() {
        System.setProperty("webdriver.chrome.driver", "C:/dev/chromedriver.exe");
    }

    @BeforeMethod
    public void driverSetup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://avic.ua/");
    }

    @org.testng.annotations.Test
    public void test1() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
      //  homePage.wait();
        homePage.atPage();
        homePage.clickSignIn();
        driver.quit();
    }


    @org.testng.annotations.Test
    void test2() {
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class = 'page-title']")).getText(), "Популярні товари");
        driver.quit();
    }

    @org.testng.annotations.Test
    void test3() {
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/div/div/div[2]/div[3]/div[3]/div/div[5]")).isDisplayed());
        driver.quit();
    }
}

