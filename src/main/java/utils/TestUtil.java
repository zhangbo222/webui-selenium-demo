package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestUtil extends WebDriverManger {
    private static final Logger logger = LoggerFactory.getLogger(TestUtil.class);

    public TestUtil() {
    }

    @BeforeTest
    public void setUp() {
        driver.get(Constants.URL);
        logger.info("url: " + Constants.URL);
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(2);
        driver.quit();
    }

}
