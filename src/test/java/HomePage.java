import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private WebDriver driver;

    @FindBy(xpath = "(//i[@class='icon icon-user-big'])[2]")
    private WebElement signInBtn;

    @FindBy(xpath = "input_search")
    private WebElement inputSearch;

//    @FindBy(xpath = "(//i[@class='icon icon-user-big'])[2]")
//    private WebElement signInBtn;
//
//    @FindBy(xpath = "(//i[@class='icon icon-user-big'])[2]")
//    private WebElement signInBtn;

    HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignIn() {
        signInBtn.click();
    }

    void open() {
        driver.get("https://avic.ua/");
    }

    boolean atPage() {
        if (driver.getTitle().equals("AVIC ™ - зручний інтернет-магазин побутової техніки та електроніки в Україні. | Avic")) {
            return true;
        } else {
            return false;
        }
    }
}


