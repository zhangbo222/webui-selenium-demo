package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.WebDriverManger;

/**
 * All elements on login page
 */
public class LoginPage extends WebDriverManger {
    public static WebElement txt_UID() {
        return driver.findElement(By.xpath("//input[@id='UID']"));
    }

    public static WebElement txt_PWD() {
        return driver.findElement(By.xpath("//input[@id='PIN']"));
    }

    public static WebElement btn_Login() {
        return driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
    }

    public static WebElement btn_getStarted() {
        return driver.findElement(By.xpath("//button[contains(text(),'Get Started')]"));
    }

    public static WebElement link_forgotUID() {
        return driver.findElement(By.xpath("//a[contains(text(),'User ID')]"));
    }

     public static WebElement link_forgotPIN() {
        return driver.findElement(By.xpath("//a[contains(text(),'PIN')]"));
     }

     public static WebElement txt_error_invalidUID() {
        return driver.findElement(By.xpath("//h4[@id='InvalidUserId']"));
     }
}
