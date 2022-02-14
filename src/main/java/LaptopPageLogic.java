import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaptopPageLogic {

    By sellerRozetkaCheckbox = By.xpath("//a[@data-id='Rozetka']");

    private WebDriver driver;
    private WebDriverWait wait;

    public LaptopPageLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public RozetkaSellerLogic selectRozetkaSeller() {
        driver.findElement(sellerRozetkaCheckbox).click();
        return new RozetkaSellerLogic(driver, wait);
    }

}
