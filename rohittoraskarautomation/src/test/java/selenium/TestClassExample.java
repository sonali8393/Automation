package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/Rohit/Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
