package pages;

import org.openqa.selenium.WebDriver;

public class PlayerPage {

    WebDriver driver;

    public PlayerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPlayer() {
        System.out.println("Player Page Opened");
    }
}