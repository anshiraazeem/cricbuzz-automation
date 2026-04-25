package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class NewsPage {

    WebDriver driver;

    public NewsPage(WebDriver driver) {
        this.driver = driver;
    }

    By news = By.xpath("//a[contains(text(),'News')]");

    public void clickNews() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(news)).click();
    }
}