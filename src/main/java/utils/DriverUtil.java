package utils;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverUtil {
    private static final Logger logger = LoggerFactory.getLogger(DriverUtil.class);
    public static WebDriver driver;

    public DriverUtil() {
        String browser = System.getProperty("browser");
        driver = WebDriverManger.getDriver(browser);
    }
}
