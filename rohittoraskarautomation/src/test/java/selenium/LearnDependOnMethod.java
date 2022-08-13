package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnDependOnMethod {

    @Test(groups = "smoke")
    public void MethodA() {
        System.out.println(" Method A ");
        Assert.assertFalse(true);
    }

    @Test (dependsOnMethods = "MethodA", alwaysRun = true)
    public void MethodB() {
        System.out.println(" Method B ");
    }

    @Test ( dependsOnGroups = "smoke")
    public void MethodC() {
        System.out.println(" Method C ");
    }

    @Test (enabled = false)
    public void Methodd() {
        System.out.println(" Method D ");
    }

    @Test (expectedExceptions = {ArithmeticException.class})
    public void MethodL() {
        System.out.println(" Method L");
        System.out.println(10/0);
        System.out.println("Exception");
    }

}
