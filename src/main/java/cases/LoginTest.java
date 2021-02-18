package cases;

import org.testng.annotations.Test;
import utils.BusinessException;
import utils.TestUtil;

public interface LoginTest {
    @Test
    default void test_login_success() throws Exception { throw new BusinessException(); }

    @Test
    default void test_login_fail() { throw new BusinessException(); }
}
