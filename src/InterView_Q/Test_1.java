package InterView_Q;

import HomeWork.TestNG_Functions;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Test_1
{
    static WebDriver driver;

//----------------------------------------------------------

    @BeforeClass(alwaysRun = true)
    public static void BeforeClass()
    {
        driver = new ChromeDriver();
        driver.get("https://zengo.com/");
        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public static void AfterClass()
    {
        driver.quit();
    }

//----------------------------------------------------------

    @Test
    public void test01()
    {
        Verify_URL("https://zengo.com/");
        Verify_Text_In_Page("Upgrade to the most secure crypto wallet");
    }
    @Test
    public void test02()
    {
        Select_From_menu();
    }
    @Test
    public void test03()
    {
        Verify_URL("https://zengo.com/assets/ethereum-wallet/");
    }
    @Test
    public void test04()
    {
        Verify_ZenGo_Logo_In_Page();
        Verify_Ethereum_Logo_In_Page();
    }
    public static void Verify_URL(String EXP_URL_ADD)
    {
        String CORR_URL_ADD = driver.getCurrentUrl();
        if (CORR_URL_ADD.equals(EXP_URL_ADD))

            System.out.println("test pass - able to get url");
        else
            System.out.println("test fail - unable to get url");
    }
    public static void Verify_Text_In_Page(String ACTUAL_TEXT)
    {
        String EXP_TEXT = "Upgrade to the most secure crypto wallet";
        ACTUAL_TEXT = driver.findElement(By.tagName("h1")).getText();
        if (ACTUAL_TEXT.equals(EXP_TEXT))
            System.out.println("test pass - text shown in page as h1");
        else
            System.out.println("test fail - text not shown in page or as h1");
    }
    public static void Select_From_menu()
    {
        try
        {
            WebElement Menu = driver.findElement(By.linkText("Assets"));
            Actions actions = new Actions(driver);
            actions.moveToElement(Menu).perform();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            WebElement Sub_Menu = driver.findElement(By.linkText("Ethereum (ETH)"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            actions.click(Sub_Menu).perform();
            System.out.println("test pass");
        }
        catch (Exception e)
        {
            System.out.println("test fail");
        }
    }
    public static void Verify_ZenGo_Logo_In_Page()
    {
        boolean ZENGO = driver.findElement(By.xpath("//a/img")).isDisplayed();
        if(ZENGO == true)
            System.out.println("test pass - zengo logo found in page");
        else
            System.out.println("test fail - zengo logo not found in page");
    }
    public static void Verify_Ethereum_Logo_In_Page()
    {
        boolean ETHEREUM = driver.findElement(By.xpath("//img[@class='attachment-medium size-medium wp-image-13961 lazyloaded']")).isDisplayed();
        if(ETHEREUM == true)
            System.out.println("test pass - ethereum logo found in page");
        else
            System.out.println("test fail - ethereum logo not found in page");
    }
}
