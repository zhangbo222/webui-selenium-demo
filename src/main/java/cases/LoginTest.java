package cases;

import org.testng.annotations.Test;
import utils.BusinessException;

/**
 * Define your test cases here
 */
public interface LoginTest {
    @Test
    default void test_login_success() {
        throw new BusinessException();
    }

    @Test
    default void test_login_with_invalid_uid() {
        throw new BusinessException();
    }
}
