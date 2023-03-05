package HomeWork;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestNG
{
    static WebDriver driver;

//----------------------------------------------------------

    @BeforeClass(alwaysRun = true)
    public static void BeforeClass()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass(alwaysRun = true)
    public static void AfterClass()
    {
        driver.quit();
    }

//----------------------------------------------------------

    @Test(groups = "List", priority = 1)
    public void test01()
    {
        TestNG_Functions.Browser_Name();
        TestNG_Functions.URL();
        TestNG_Functions.Create_Head_List();
    }
    @Test(groups = "List", priority = 2,dependsOnMethods = "test01")
    public void test02()
    {
        TestNG_Functions.Create_Buffer_list();
    }

//----------------------------------------------------------

    @Test(groups = "Average", priority = 3)
    public void test03()
    {
        TestNG_Functions.Browser_Name();
        TestNG_Functions.URL();
        TestNG_Functions.In_Subject_List(1);
    }
    @Test(groups = "Average", priority = 4,dependsOnMethods = "test03")
    public void test04()
    {
        TestNG_Functions.In_Subject_List(2);
    }
    @Test(groups = "Average", priority = 5,dependsOnMethods = "test03")
    public void test05()
    {
        TestNG_Functions.In_Subject_List(3);
    }
    @Test(groups = "Average", priority = 6,dependsOnMethods = "test03")
    public void test06()
    {
        TestNG_Functions.In_Subject_List(4);
    }
}
