package tests;

import base.BaseTest;
import org.testng.annotations.*;
import pages.NewsPage;
import org.testng.annotations.AfterMethod;

public class NewsTest extends BaseTest {

    NewsPage news;

    @BeforeMethod
    public void start() {
        setup();
        news = new NewsPage(driver);
    }

    @Test
    public void testNews() {
        news.clickNews();
        System.out.println("News Page Opened");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1800000);
        driver.quit();
    }
}