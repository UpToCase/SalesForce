package tests.base;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Retry implements IRetryAnalyzer {

    private static final int MAX_RETRY = 3;
    private int attempt = 1;

    @Override
    public boolean retry(ITestResult testResult) {
        if(!testResult.isSuccess()) {
            if (attempt < MAX_RETRY) {
                attempt++;
                testResult.setStatus(ITestResult.FAILURE);
                System.out.println("Retry once again");
                return true;
            } else {
                testResult.setStatus(ITestResult.FAILURE);
            }
        }else{
          testResult.setStatus(ITestResult.SUCCESS);
        }
        return false;
    }

    @Test(retryAnalyzer = Retry.class)
    public void dependsOn() {
        throw new NullPointerException();
    }
}
