package cases;

import actions.Login;
import utils.BaseTest;

public class LoginTestImpl extends BaseTest implements LoginTest {
    Login login = new Login();

    @Override
    public void test_login_with_invalid_uid() {
        login.inputUid("uid");
        login.inputPwd("111");
        login.clickLoginBtn();
        login.checkLoginFail();
    }
}
