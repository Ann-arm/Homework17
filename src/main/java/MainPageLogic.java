import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageLogic {

    By laptopAndCompSection = By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]");

    private WebDriver driver;
    private WebDriverWait wait;

    public MainPageLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public LaptopsAndCompLogic openLaptopAndCompPage() {
        driver.findElement(laptopAndCompSection).click();
        return new LaptopsAndCompLogic(driver, wait);
    }
}
