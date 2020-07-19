package utils;

import org.testng.Assert;

public class Assertions {
    public Assertions() {
    }

    public static void assertEquals(Object expected, Object actual) {
        Assert.assertEquals(actual, expected);
    }
}
