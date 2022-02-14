import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RozetkaSellerLogic {

    By inputPriceMax = By.xpath("//input[@formcontrolname='max']");
    By okBtn = By.xpath("//input[@formcontrolname='max']/../button");
    By grayBackground = By.xpath("//*[contains(@class,'preloader_type_element')]");

    private WebDriver driver;
    private WebDriverWait wait;

    public RozetkaSellerLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public RozetkaSellerLogic enterMaxPrice() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(grayBackground));
        driver.findElement(inputPriceMax).clear();
        driver.findElement(inputPriceMax).sendKeys("100000");
        return new RozetkaSellerLogic(driver, wait);
    }

    public PriceFilterLogic clickOnOkBtn() {
        driver.findElement(okBtn).click();
        return new PriceFilterLogic(driver, wait);
    }


}
