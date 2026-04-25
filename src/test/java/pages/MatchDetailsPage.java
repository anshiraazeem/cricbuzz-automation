package pages;

import org.openqa.selenium.WebDriver;

public class MatchDetailsPage {

    WebDriver driver;

    public MatchDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyPage() {
        System.out.println("Match Details Page Opened");
    }
}