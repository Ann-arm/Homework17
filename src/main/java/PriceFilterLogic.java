import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PriceFilterLogic {

    By firstAvailableProductWithPromotionClick = By.xpath("//span[contains(@class, 'promo-label_type_action')]/..");

    private WebDriver driver;
    private WebDriverWait wait;

    public PriceFilterLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public ProductWithPromotionPageLogic clickOnFirstAvailableProductWithPromotion() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstAvailableProductWithPromotionClick)).click();
        return new ProductWithPromotionPageLogic(driver, wait);
    }
}
