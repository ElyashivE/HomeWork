package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class SELENIUM_FINAL_TEST_VILA_4_U
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("https://www.vila4u.com/");
        //test 2 א
        driver.findElement(By.id("siteSearch")).sendKeys("וילות בצפון");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //select[@name='category']//option[1]
        driver.findElement(By.xpath("//select[@name='category']//option[7]")).click();
        //driver.findElement(By.xpath("//div[@class='selectB open']")).click();
        driver.findElement(By.xpath("//div[@class='selectB']//span")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//label[@for='acc_81']")).click();
        driver.findElement(By.xpath("//label[@for='acc_85']")).click();
        driver.findElement(By.className("ok")).click();
        //driver.findElement(By.id("selRooms")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//select[@id]/option[10]")).click();
        driver.findElement(By.className("submitSearch")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> list_of_vila = driver.findElements(By.xpath("//div[@class='recBox']//img[@class='lazy']"));
        System.out.println("list of vila 4 U:");
        for (int i = 0; i < list_of_vila.size(); i++)
        {
            System.out.println((i+1)+". "+list_of_vila.get(i).getAttribute("alt"));
        }


    }
}
