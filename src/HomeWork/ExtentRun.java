package HomeWork;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.IOException;

import static HomeWork.ExtentManager.driver;

public class ExtentRun
{

    static WebDriver driver;
    static ExtentReports extent;
    static ExtentTest ABOUT;
    static ExtentTest PLANS;
    static ExtentManager exm = new ExtentManager(driver);

    @BeforeClass
    public static void beforeClass()
    {
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        extent = exm.GetExtent();
        ABOUT = exm.createTest("ABOUT MENU", "ABOUT MENU TEST");
        PLANS = exm.createTest("PLANS MENU", "PLANS MENU TEST");

    }
    @AfterClass
    public static void afterClass()
    {
        extent.flush();
        driver.quit();
    }
    @Test
    public void test_01() throws IOException, AWTException {
        driver.get("https://www.google.com/");

        ABOUT.pass("test 1 pass");
        ABOUT.fail("test 1 fail");
        ABOUT.info("just to let u know");

        PLANS.pass("test 1 pass");
        //כאשר יש fail נוסיף תמונה לדוח
        PLANS.fail("test 1 fail", MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        PLANS.info("just to let u know");
    }
}
