package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public WebElement txt_UID() {
        return driver.findElement(By.id("UID"));
    }

    public WebElement txt_PWD() {
        return driver.findElement(By.id("PIN"));
    }

    public WebElement btn_Login() {
        return driver.findElement(By.xpath("//button[@title=\"Login\"]"));
    }

    public WebElement link_forgotUid() {
        return driver.findElement(By.xpath("//*[@title=\"User ID\"]"));
    }
}
