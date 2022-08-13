package testng;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGExample {
@Test
public void testCase1() {
    System.setProperty("webdriver.chrome.driver", "D:/Rohit/Selenium/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.close();
    System.out.println("Hello Rohit");
}
    @Test
    public void testCase2() {
        System.setProperty("webdriver.chrome.driver", "D:/Rohit/Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.close();
    }
    @Test
    public void testCase3() {
        System.setProperty("webdriver.chrome.driver", "D:/Rohit/Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        driver.close();
    }
    System.out.println("Hello World");
  System.out.println(" Hello Mahesh, How are you ");
    System.out.println(" I'm fine ");
}
