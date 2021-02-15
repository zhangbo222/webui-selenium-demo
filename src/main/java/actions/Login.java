package actions;

import pages.LoginPage;

public class Login {
    LoginPage loginPage = new LoginPage();

    public void inputUid(String type) throws Exception {
        if (type.equalsIgnoreCase("valid")) {
            loginPage.txt_UID().sendKeys("zhangbo890222");
        } else if (type.equalsIgnoreCase("invalid")) {
            loginPage.txt_UID().sendKeys("test");
        } else {
            throw new Exception("invalid type value: " + type);
        }
    }

    public void inputPwd(String type) throws Exception {
        if (type.equalsIgnoreCase("valid")) {
            loginPage.txt_PWD().sendKeys("19900925");
        } else if (type.equalsIgnoreCase("invalid")) {
            loginPage.txt_PWD().sendKeys("23232");
        } else {
            throw new Exception("invalid type value: " + type);
        }
    }

    public void clickLoginBtn() {
        loginPage.btn_Login().click();
    }

    public void clickForgotUid() {
        loginPage.link_forgotUid().click();
    }
}
