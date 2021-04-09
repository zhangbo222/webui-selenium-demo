package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.WebDriverManger;

public class LoginPage extends WebDriverManger {
    public static WebElement txt_UID() {
        return driver.findElement(By.id("UID"));
    }

    public static WebElement txt_PWD() {
        return driver.findElement(By.id("PIN"));
    }

    public static WebElement btn_Login() {
        return driver.findElement(By.xpath("//button[@title=\"Login\"]"));
    }

    public static WebElement link_forgotUid() {
        return driver.findElement(By.xpath("//*[@title=\"User ID\"]"));
    }
}
