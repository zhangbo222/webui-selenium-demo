package cases;

import actions.Home;
import org.testng.annotations.Test;
import utils.Assertions;
import utils.BaseTest;

public class TestLogin extends BaseTest {
    Home home = new Home();

    @Test
    public void loginSuccess() {
        home.inputUid("valid");
        home.inputPwd("valid");
//        home.clickLoginBtn();
        Assertions.assertEquals("", "");
    }

//    @Test
//    public void loginWithWrongUID() {

//    }

//    @Test
//    public void loginWithWrongPWD() {

//    }
}
