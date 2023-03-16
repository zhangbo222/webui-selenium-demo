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
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\zhang\\IdeaProjects\\web-demo\\src\\main\\resources\\drivers\\chromedriver.exe");
            //This options will allow silence run
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new");
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.firefox.driver", "C:\\Users\\zhang\\IdeaProjects\\web-demo\\src\\main\\resources\\drivers\\chromedriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            //todo
            driver = new SafariDriver();
        }
    }
}
