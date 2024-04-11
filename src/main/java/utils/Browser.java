package utils;

import lombok.Getter;

@Getter
public enum Browser {
    CHROME("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe"),
    FIREFOX("webdriver.firefox.driver","src\\main\\resources\\drivers\\chromedriver.exe"),
    SAFARI("webdriver.safari.driver",""),
    ;

    public String driverKey, driverPath;
    Browser(String driverKey, String driverPath) {
        this.driverKey = driverKey;
        this.driverPath = driverPath;
    }

}
