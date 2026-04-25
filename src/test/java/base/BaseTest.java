package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Base class for browser setup and tearDown
 */
public class BaseTest {

    // WebDriver instance
    public static WebDriver driver;

    /**
     * This method launches browser and opens Cricbuzz
     */
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/");
    }

    /**
     * This method closes browser after 30 minutes
     */
    public void tearDown() throws InterruptedException {
        Thread.sleep(1800000); // 30 minutes
        driver.quit();
    }
}