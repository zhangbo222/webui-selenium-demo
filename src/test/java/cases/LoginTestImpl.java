package cases;

import actions.Login;
import utils.Base;

public class LoginTestImpl extends Base implements LoginTest {
    Login login = new Login();

    @Override
    public void test_login_with_invalid_uid() {
        login.inputUid("uid");
        login.inputPwd("111");
        login.clickLoginBtn();
        login.checkLoginFail();
    }
}
