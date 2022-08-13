package testng;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class LearnAssertion {
    @Test
    public void testCase11() {
        System.setProperty("webdriver.chrome.driver", "D:/Rohit/Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(), "google");
        System.out.println("Hiiiii");
    }
    @Test
    public void testCase22() {
        System.setProperty("webdriver.chrome.driver", "D:/Rohit/Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(driver.findElement(By.xpath("(//p[@class='form-label'])[1]")).getText(),"username", "Test should be Username");
        softAssert.assertEquals(driver.findElement(By.xpath("(//p[@class='form-label'])[2]")).getText(),"Password", "Test should be Password");
        softAssert.assertAll();
    }

}
