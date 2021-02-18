package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebDriverManger {
    private static final Logger logger = LoggerFactory.getLogger(WebDriverManger.class);
    public static WebDriver driver;

    public static WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/zhangbo/IdeaProjects/web-demo/src/main/resources/drivers/chromedriver");
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.firefox.driver", "/Users/zhangbo/IdeaProjects/web-demo/src/main/resources/drivers/firefoxdriver");
            driver = new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("safari")) {
            //todo
            driver = new SafariDriver();
        }
        logger.info(browserType + "driver initialed successfully");
        return driver;
    }
}
