package LearnRetryTestCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class LearingRetryFailedTest implements IRetryAnalyzer {
   private int retryCount = 0;
   private int maxRetryCount = 3;

    public boolean retry(ITestResult iTestResult) {
        if (retryCount<maxRetryCount) {
            retryCount++;
            return true; // Why we return true
        }
        return false;
    }
}
