package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.List;

public class MatchesPage {

    WebDriver driver;

    public MatchesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFirstMatch() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        List<WebElement> matches = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(
                        By.xpath("//a[contains(@href,'cricket')]")
                )
        );

        for (WebElement m : matches) {
            if (m.isDisplayed()) {
                m.click();
                break;
            }
        }
    }
}