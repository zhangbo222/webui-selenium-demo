package cases;

import org.testng.annotations.Test;
import utils.BusinessException;

public interface LoginTest {
    @Test
    default void test_login_success() {
        throw new BusinessException();
    }

    @Test
    default void test_login_fail() {
        throw new BusinessException();
    }
}
