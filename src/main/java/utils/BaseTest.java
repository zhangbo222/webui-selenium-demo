package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public static WebDriver driver;

    public BaseTest() {
    }

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/zhangbo/IdeaProjects/web-demo/src/main/resources/drivers/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://internet-banking.dbs.com.sg/IB/Welcome");
        driver = chromeDriver;
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(2);
        driver.quit();
    }
}
