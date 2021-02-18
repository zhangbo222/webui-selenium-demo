package cases;

import actions.Login;
import utils.TestUtil;

public class LoginTestImpl extends TestUtil implements LoginTest {
    Login login = new Login();

    @Override
    public void test_login_success() {
        login.inputUid("valid1");
        login.inputPwd("valid1");
        login.clickLoginBtn();
    }
}
