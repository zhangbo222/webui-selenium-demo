package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebDriverManger {
    private static final Logger log = LoggerFactory.getLogger(WebDriverManger.class);
    public static WebDriver driver;
    String browser = System.getProperty("browser");

    public WebDriverManger() {
        switch (browser) {
            case "Chrome":
            default:
                System.setProperty(Browser.CHROME.getDriverKey(), Browser.CHROME.getDriverPath());
                //This options will allow silence run
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless=new");
                driver = new ChromeDriver(options);
                break;
            case "Firefox":
                System.setProperty(Browser.FIREFOX.getDriverKey(), Browser.FIREFOX.getDriverPath());
                driver = new FirefoxDriver();
                break;
            case "Safari":
                System.setProperty(Browser.SAFARI.getDriverKey(), Browser.SAFARI.getDriverPath());
                driver = new SafariDriver();
                break;
        }
    }
}
