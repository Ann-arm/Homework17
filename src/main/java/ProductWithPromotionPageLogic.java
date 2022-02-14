import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductWithPromotionPageLogic {

    By promotionDisplay = By.xpath("//app-label[contains(@class, 'main-slider__label')]");

    private WebDriver driver;
    private WebDriverWait wait;

    public ProductWithPromotionPageLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement promotionElement() {
        WebElement elementPromotion = wait.until(ExpectedConditions.visibilityOfElementLocated(promotionDisplay));
        return elementPromotion;

    }
}
