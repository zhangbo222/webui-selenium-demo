package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest extends WebDriverManger {
    private static final Logger log = LoggerFactory.getLogger(BaseTest.class);

    public BaseTest() {
    }

    @BeforeTest
    public void setUp() {
        driver.get(Constants.URL);
        log.info("url: " + Constants.URL);
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(2);
        driver.quit();
    }

}
