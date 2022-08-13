package testng;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LearnParamerterizedTestNg {


   public static WebDriver driver;

   @DataProvider(name = "test-data")
    public Object[][] learnDataProvider() throws IOException {
//       return new Object[][] {{"Selenium Cource", "Pune"}, {"TestNG Cource", "Karad"}}; // This is used when we send Data manually

       Object[][] arrayObject = getExcelSheetData("D:\\Rohit\\Selenium\\LearnDataProviderTestNG.xlsx", "TestData1");
        return arrayObject;
    }


    public String[][] getExcelSheetData( String fileName, String SheetName) throws IOException {
        String[][] data = null;
        FileInputStream fileInputStream = new FileInputStream(fileName);
        XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
        XSSFSheet sh = wb.getSheet(SheetName);
        XSSFRow row = sh.getRow(0);
        int noOfRow = sh.getPhysicalNumberOfRows();
        int noOfColumn = row.getLastCellNum();
        Cell cell;
        data = new String[noOfRow-1][noOfColumn];

        for (int i =1; i< noOfRow; i++) {
            for (int j = 0; i < noOfColumn; i++) {
                row = sh.getRow(i);
                cell = row.getCell(j);
                data[i-1][j]=cell.getStringCellValue();
            }
        }
        return data;
    }

    @BeforeMethod
    @Parameters ({"browserName"})
    public void beforeMethod( String browserName ) {
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:/Rohit/Selenium/chromedriver.exe");
            driver = new ChromeDriver();
        }else
        if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "D:/Rohit/Selenium/geckodriver.exe");
            driver = new FirefoxDriver();
        }else
        if (browserName.equals("edge")) {
            System.setProperty("webdriver.edge.driver", "D:\\Rohit\\Selenium\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else
        {
            System.out.println("Choose Browser Name ");
        }
       driver.get("https://www.google.com/");
    }

    @Test (dataProvider = "test-data")
    //@Parameters ({"name", "city"})
    public void parameterization( String name, String city ) {
     //   String name = "Rohit Toraskar";
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(name + " " + city);
        element.sendKeys(Keys.ENTER);
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
