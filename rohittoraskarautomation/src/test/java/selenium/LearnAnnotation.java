package selenium;

import org.testng.annotations.*;

public class LearnAnnotation {
        @BeforeSuite
        public void beforeSuit() {
            System.out.println("Before Suit");
        }
        @BeforeTest
        public void beforeTest() {
            System.out.println("Before Test");
        }
        @BeforeClass
        public void beforeClass() {
            System.out.println("Before Class");
        }
        @BeforeMethod
        public void beforeMethod() {
            System.out.println("Before Method");
        }
        @Test (groups = "smoke")
        public void testCase1() {
            System.out.println("This is Test 1");
        }
        @Test (groups = "block")
        public void testCase2() {
            System.out.println("This is Test 2");
        }
        @AfterMethod
        public void afterMethod() {
            System.out.println(" After Method");
        }
        @AfterClass
         public void afterClass() {
            System.out.println("After Class");
        }
        @AfterTest
        public void afterTest() {
            System.out.println("After Test");
        }
        @AfterSuite
        public void aftersuit() {
            System.out.println("After Suit");
        }
}

