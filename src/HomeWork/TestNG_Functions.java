package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

import static HomeWork.TestNG.driver;

public class TestNG_Functions
{
    public static void URL()
    {
        driver.get("https://www.nisha.co.il/%D7%98%D7%91%D7%9C%D7%90%D7%95%D7%AA-%D7%A9%D7%9B%D7%A8");
    }

    public static void Create_Head_List()
    {
        List<WebElement> LIST = driver.findElements(By.xpath("//div/div//h3"));
        System.out.println("List of Header Subjects:");
        for (int i = 0; i < LIST.size()-1; i++)
        {
            System.out.print(LIST.get(i).getText() +" | ");
        }
    }
    public static void Create_Buffer_list()
    {
        System.out.println("List of Buffer Subject:");
        List<WebElement> LIST = driver.findElements(By.xpath("//td/span"));
        for (int i = 0; i < LIST.size(); i++)
        {
            System.out.print(LIST.get(i).getText()  +" | ");
        }
    }
    public static void In_Subject_List(int table_num)
    {
        int SUM = 0;
        Double DSUM = 0.0;
        List<WebElement> LIST = driver.findElements(By.xpath("//*[@id='salary-table-"+table_num+"']//tr/td[2]"));
        for (int i = 1; i < LIST.size(); i++)
        {
            //System.out.println(LIST.get(i).getText());
            String SUM_STRING = LIST.get(i).getText();
            String SUM_STRING_ARRAY [] = SUM_STRING.split("-");
            SUM = SUM + Integer.parseInt(SUM_STRING_ARRAY[0]);
            System.out.print(SUM_STRING_ARRAY[0] + " | ");
            DSUM = Double.valueOf(SUM);
        }
        if (SUM == 0)
            System.out.println("Test fail - unable to make list and calc avg");
        else
            System.out.println("the AVG is: "+ DSUM/(LIST.size()-1));
    }
    public static void Browser_Name()
    {
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = cap.getBrowserName().toLowerCase();
        System.out.println("we using browser: "+ browserName);
    }
}
