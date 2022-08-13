package selenium;

import org.testng.annotations.Test;

public class LearnAnnotationPriority {

    @Test (priority = -5, groups = "smoke")
    public void MethodA() {
        System.out.println(" Method A ");
    }

    @Test (invocationCount = 500, invocationTimeOut = 1)  // By default priority is 0 so test are executed
    public void MethodE() {
        System.out.println(" Method E ");
    }

    @Test ( groups = "smoke" ) // By default priority is 0
    public void MethodB() {
        System.out.println(" Method B ");
    }

    @Test (priority = -2)
    public void MethodZ() {
        System.out.println(" Method Z ");
    }

    @Test (priority = 1)
    public void MethodN() {
        System.out.println(" Method N ");
    }

}
