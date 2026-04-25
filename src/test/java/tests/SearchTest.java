package tests;

import base.BaseTest;
import org.testng.annotations.*;

/**
 * Search test class
 */
public class SearchTest extends BaseTest {

    /**
     * This method runs before each test
     */
    @BeforeMethod
    public void start() {
        setup();
    }

    /**
     * This is search test method
     */
    @Test
    public void testSearch() {
        System.out.println("Search Test Executed");
    }

    /**
     * This method runs after each test
     */
    @AfterMethod
    public void end() throws InterruptedException {
        tearDown();   // calling BaseTest method
    }
}