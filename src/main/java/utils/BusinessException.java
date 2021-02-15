package utils;

import org.testng.SkipException;

public class BusinessException extends RuntimeException {
    public BusinessException() {
        throw new SkipException("Not implemented yet!");
    }
}
