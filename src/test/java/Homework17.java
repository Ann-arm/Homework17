import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Homework17 {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    public void before() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rozetka.com.ua/");
    }

    @Test
    public void test() throws InterruptedException {
        new MainPageLogic(driver, wait).openLaptopAndCompPage();

        new LaptopsAndCompLogic(driver, wait).openLaptopPage();

        new LaptopPageLogic(driver, wait).selectRozetkaSeller();

        new RozetkaSellerLogic(driver, wait).enterMaxPrice().clickOnOkBtn();

        new PriceFilterLogic(driver, wait).clickOnFirstAvailableProductWithPromotion();

        WebElement promotionLabel = new ProductWithPromotionPageLogic(driver, wait).promotionElement();

        assertTrue(promotionLabel.isDisplayed(), "Promotion doesn't display");
    }

    @AfterMethod
    public void after() {
        driver.quit();
    }
}
