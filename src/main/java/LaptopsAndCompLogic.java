import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaptopsAndCompLogic {

    By categoryLaptops = By.xpath("//div[@class='tile-cats']");

    private WebDriver driver;
    private WebDriverWait wait;

    public LaptopsAndCompLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public LaptopPageLogic openLaptopPage() {
        driver.findElement(categoryLaptops).click();
        return new LaptopPageLogic(driver, wait);
    }


}
