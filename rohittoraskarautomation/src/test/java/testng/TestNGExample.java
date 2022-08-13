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
}
    @Test
    public void testCase2() {
        System.setProperty("webdriver.chrome.driver", "D:/Rohit/Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.close();
    }
    @Test
    public void testCase3() {
        System.setProperty("webdriver.chrome.driver", "D:/Rohit/Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        driver.close();
    }
}
