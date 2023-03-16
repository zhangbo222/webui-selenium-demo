package actions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.LoginPage;

/**
 * All actions in login page
 */
public class Login {
    private static final Logger log = LoggerFactory.getLogger(Login.class);

    public void inputUid(String uid) {
        log.info("enter uid =" + uid);
        LoginPage.txt_UID().sendKeys(uid);
    }

    public void inputPwd(String pwd) {
        log.info("enter pwd =" + pwd);
        LoginPage.txt_PWD().sendKeys(pwd);
    }

    public void clickLoginBtn() {
        log.info("click login btn");
        LoginPage.btn_Login().click();
    }

    public void checkLoginSuccess(){

    }

    public void checkLoginFail() {
        LoginPage.txt_error_invalidUID();
    }

    public void clickForgotUID() {
        log.info("click forgot UID link");
        LoginPage.link_forgotUID().click();
    }

    public void clickForgotPIN() {
        log.info("click forgot PIN link");
        LoginPage.link_forgotPIN().click();
    }
}
