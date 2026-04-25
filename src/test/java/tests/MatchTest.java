package tests;

import base.BaseTest;
import org.testng.annotations.*;
import pages.*;
import org.testng.annotations.AfterMethod;

public class MatchTest extends BaseTest {

    HomePage home;
    MatchesPage match;

    @BeforeMethod
    public void start() {
        setup();
        home = new HomePage(driver);
        match = new MatchesPage(driver);
    }

    @Test
    public void testMatch() {
        home.clickMatches();
        match.clickFirstMatch();
        System.out.println("Match Test Passed");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1800000);
        driver.quit();
    }
}