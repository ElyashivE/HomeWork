package HomeWork;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.io.IOException;
import java.time.Duration;

public class Edu_gov_il
{
    static WebDriver driver;
    static ExtentReports extent;
    static ExtentTest Head_of_Office;
    static ExtentTest About_Office;
    static ExtentManager exm = new ExtentManager(driver);

    @BeforeClass
    public static void beforeClass()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        extent = exm.GetExtent();
        driver.get("http://edu.gov.il/owlHeb/Pages/default.aspx/");
        Head_of_Office = exm.createTest("Head of Office Menu", "Links check - up to 3 links in the tab");
        About_Office = exm.createTest("About Office Menu", "Links check - up to 3 links in the tab");

    }
    @AfterClass
    public static void afterClass()
    {
        extent.flush();
        driver.quit();
    }
    @Test
    public void A_Head_of_Office_Test() throws IOException, AWTException, InterruptedException {
        Select("הנהלת המשרד","שר החינוך");
        if(URL().equals("https://edu.gov.il/heb/managment/minister/Pages/yoav-kish.aspx"))
           Head_of_Office.pass("Test 1/3 PASS");
        else
        {
            Head_of_Office.fail("Test 1/3 FAIL",MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
            Head_of_Office.info("דף שר החינוך אינו מוצג");
        }
        Back_page();
        Select("הנהלת המשרד","שר במשרד החינוך");
        if(URL().equals("https://edu.gov.il/heb/managment/2nd-minister/Pages/biton.aspx"))
            Head_of_Office.pass("Test 2/3 PASS");
        else
        {
            Head_of_Office.fail("Test 2/3 FAIL",MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
            Head_of_Office.info("דף שר במשרד החינוך אינו מוצג");
        }
        Back_page();
        Select("הנהלת המשרד","מנכ\"ל משרד החינוך");
        if(URL().equals("https://edu.gov.il/heb/managment/ceo/Pages/general-manager-tzalal.aspx"))
            Head_of_Office.pass("Test 3/3 PASS");
        else
        {
            Head_of_Office.fail("Test 3/3 FAIL",MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
            Head_of_Office.info("דף מנכ\"ל משרד החינוך אינו מוצג");
        }
        Back_page();
    }

    @Test
    public void B_About_Office_Test() throws IOException, AWTException, InterruptedException
    {
        Select("אודות המשרד","יחידות המשרד");
        if(URL().equals("https://edu.gov.il/heb/about/units/Pages/officemanagement.aspx"))
            About_Office.pass("Test 1/3 PASS");
        else
        {
            About_Office.fail("Test 1/3 FAIL",MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
            About_Office.info("דף יחידות המשרד אינו מוצג");
        }
        Back_page();
        Select("אודות המשרד","תולדות משרד החינוך");
        if(URL().equals("https://edu.gov.il/heb/about/history/Pages/office-history.aspx"))
            About_Office.pass("Test 2/3 PASS");
        else
        {
            About_Office.fail("Test 2/3 FAIL",MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
            About_Office.info("דף תולדות משרד החינוך אינו מוצג");
        }
        Back_page();
        Select("אודות המשרד","סגן שר החינוך לשעבר");
        if(URL().equals("https://edu.gov.il/heb/about/past-ministers/Pages/past-ministers.aspx"))
            About_Office.pass("Test 3/3 PASS");
        else
        {
            About_Office.fail("Test 3/3 FAIL",MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
            About_Office.info("דף שרים לשעבר אינו מוצג");
        }
        Back_page();
    }
    static public void Select(String HEAD_MENU, String SUB_MENU) throws InterruptedException
    {
        WebElement menu = driver.findElement(By.linkText(HEAD_MENU));
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        DELAY();
        WebElement submenu = driver.findElement(By.linkText(SUB_MENU));
        DELAY();
        actions.click(submenu).perform();
        DELAY();
    }
    static public void Back_page() throws InterruptedException
    {
        driver.navigate().back();
        DELAY();
    }

    static public String URL()
    {
        String URL = driver.getCurrentUrl();
        return URL;
    }
    static public void DELAY()

    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
