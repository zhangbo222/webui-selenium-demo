package cases;

import actions.Login;
import utils.TestUtil;

public class LoginTestImpl extends TestUtil implements LoginTest {
    Login login = new Login();

    @Override
    public void test_login_success() {
        login.inputUid("valid");
        login.inputPwd("valid");
        login.clickLoginBtn();
    }
}
