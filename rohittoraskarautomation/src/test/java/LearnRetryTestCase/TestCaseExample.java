package LearnRetryTestCase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

//@Listeners(LearnDemoExample.class)

@Listeners(LearnITest.class)

public class TestCaseExample {
    public static WebDriver driver;

    ExtentReports reports = new ExtentReports(); // Timing the log of the Test Case
    ExtentSparkReporter sparkReporter = new ExtentSparkReporter("TestExecutionReport.html");
    ExtentTest test;

    @BeforeTest
    public void beforeTest(){
        reports.attachReporter(sparkReporter);
    }
   // @Test(retryAnalyzer = LearingRetryFailedTest.class)
    @Test
    public void testCase1() {
        test = reports.createTest(" This is First Test Case").assignDevice("Chrome").assignAuthor("Rohit");
        System.out.println("Test Case 1 ");
        test.pass("Test Pass");
        Assert.assertTrue(true);

    }

    //@Test(retryAnalyzer = LearingRetryFailedTest.class)
    @Test
    public void testCase2() {
        test = reports.createTest(" This is Second Test Case ").assignDevice("Chrome").assignAuthor("Mahi");
        System.out.println("Test Case 2 ");
        test.fail("Test Fail");
        Assert.assertTrue(false);
    }

    //@Test(retryAnalyzer = LearingRetryFailedTest.class)
    @Test
    public void testCase3() {
        test = reports.createTest(" This is Third Test Case ").assignDevice("Chrome").assignAuthor("Sonali");
        System.out.println("Test Case 3 ");
        test.fail("Test Fail");
        Assert.assertTrue(false);
    }

    //@Test(retryAnalyzer = LearingRetryFailedTest.class)
    @Test(dependsOnMethods = "testCase2")
    public void testCase4() {
        test = reports.createTest(" This is Fourth Test Case ").assignDevice("Chrome").assignAuthor("Toraskar");
        System.out.println("Test Case 4 ");
        test.skip("Test Skip");
        Assert.assertTrue(false);

    }

    @AfterTest
    public void reportingClosed(){
        reports.flush();
    }
}
