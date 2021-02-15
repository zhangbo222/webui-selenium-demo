package utils;

import org.openqa.selenium.WebDriver;

public class BaseDriver {
    public WebDriver driver;

    public BaseDriver(String browser) {
        WebDriverManger driverManger = new WebDriverManger();
        driver = driverManger.getDriver(browser);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
