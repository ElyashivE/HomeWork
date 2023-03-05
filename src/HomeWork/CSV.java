package HomeWork;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CSV
{
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();

        String actualresult = "";
        String header1 = "", header2 = "", header3 = "";
        List <String> line = readCsv();
        for (int i = 0; i < 1; i++)
        {
            String [] splitline = line.get(i).split(",");
            header1 = splitline[0];
            header2 = splitline[1];
            header3 = splitline[2];
        }
        for (int i = 1; i < line.size(); i++)
        {
            driver.get("https://danielauto.net/practice/loginPage/loginpageTest.html");
            String [] splitline = line.get(i).split(",");
            System.out.println("cell "+header1+" line "+i+" : "+splitline[0]);
            System.out.println("cell "+header2+" line "+i+" : "+splitline[1]);
            System.out.println("cell "+header3+" line "+i+" : "+splitline[2]);

            driver.findElement(By.id("uaertName")).clear();
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("uaertName")).sendKeys(splitline[0]);
            driver.findElement(By.id("password")).sendKeys(splitline[1]);
            driver.findElement(By.id("send")).click();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            if (splitline[2].equals("fail"))
                try
                {
                    actualresult = driver.findElement(By.id("err")).getText();
                    System.out.println("TEST-PASS");
                }
                catch (Exception e)
                {
                    System.out.println("TEST-FAIL");
                }
            else if (splitline[2].equals("pass"))
            {
                try
                {
                    actualresult = driver.findElement(By.tagName("h1")).getText();
                    System.out.println("TEST-PASS");
                }
                catch (Exception e)
                {
                    System.out.println("TEST-FAIL");
                }
            }
            System.out.println("______________________");
        }
    }

    public static List <String> readCsv() throws IOException
    {
        List lines = new ArrayList();
        File file = new File("C:\\Users\\sarit_2\\Desktop\\Automation\\Selenium\\\\Excel\\CSV_Test.CSV");
        lines = FileUtils.readLines(file, "windows-1255");
        return lines;
    }
}
