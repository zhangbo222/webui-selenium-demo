package actions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.LoginPage;

public class Login {
    private static final Logger logger = LoggerFactory.getLogger(Login.class);

    LoginPage loginPage = new LoginPage();

    public void inputUid(String type) {
        if (type.equalsIgnoreCase("valid")) {
            loginPage.txt_UID().sendKeys("zhangbo890222");
        } else if (type.equalsIgnoreCase("invalid")) {
            loginPage.txt_UID().sendKeys("test");
        }
    }

    public void inputPwd(String type) {
        if (type.equalsIgnoreCase("valid")) {
            loginPage.txt_PWD().sendKeys("19900925");
        } else if (type.equalsIgnoreCase("invalid")) {
            loginPage.txt_PWD().sendKeys("23232");
        }
    }

    public void clickLoginBtn() {
        loginPage.btn_Login().click();
    }

    public void clickForgotUid() {
        loginPage.link_forgotUid().click();
    }
}
