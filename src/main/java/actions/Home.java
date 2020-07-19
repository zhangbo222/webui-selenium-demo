package actions;

import org.openqa.selenium.WebElement;
import pages.HomePage;

public class Home {
    HomePage homePage = new HomePage();

    public void inputUid(String type) {
        WebElement element = homePage.txt_UID();
        if (type.equalsIgnoreCase("valid")) {
            element.sendKeys("zhangbo890222");
        } else {
            element.sendKeys("test");
        }
    }

    public void inputPwd(String type) {
        WebElement element = homePage.txt_PWD();
        if (type.equalsIgnoreCase("valid")) {
            element.sendKeys("19900925");
        } else {
            element.sendKeys("test");
        }
    }

    public void clickLoginBtn() {
        homePage.btn_Login().click();
    }

    public void clickForgotUid() {
        homePage.link_forgotUid().click();
    }
}
