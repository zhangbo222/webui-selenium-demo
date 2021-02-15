package cases;

import actions.Login;
import utils.BaseUtil;

public class LoginTestImpl extends BaseUtil implements LoginTest {
    Login login = new Login();
    @Override
    public void test_login_success() throws Exception {
        login.inputUid("valid");
        login.inputPwd("valid");
        login.clickLoginBtn();
    }
}
