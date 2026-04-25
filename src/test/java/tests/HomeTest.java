package tests;

import base.BaseTest;
import org.testng.annotations.*;
import pages.HomePage;
import org.testng.annotations.AfterMethod;

public class HomeTest extends BaseTest {

    HomePage home;

    @BeforeMethod
    public void start() {
        setup();
        home = new HomePage(driver);
    }

    @Test
    public void testHome() {
        System.out.println("Home Page Loaded");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1800000);
        driver.quit();
    }
}