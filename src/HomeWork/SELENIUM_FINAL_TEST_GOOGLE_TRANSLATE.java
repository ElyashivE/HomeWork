package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SELENIUM_FINAL_TEST_GOOGLE_TRANSLATE
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();

        driver.get("https://translate.google.com/");
        String my_name = "שלום ,אריאה יעל אדרעי את חמודה";
        driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[1]/span/span/div/textarea")).sendKeys(my_name);
        Thread.sleep(2000);
        //driver.findElement(By.id("i11")).click();
        WebElement button = driver.findElement(By.cssSelector("button[class='VfPpkd-Bz112c-LgbsSe VfPpkd-Bz112c-LgbsSe-OWXEXe-e5LLRc-SxQuSe fzRBVc tmJved mN1ivc SSgGrd Tw0Tv']"));
        Thread.sleep(2000);
        button.click();

        Thread.sleep(5000);
        driver.findElement(By.id("i12")).click();
        Thread.sleep(2000);
        button = driver.findElement(By.cssSelector("button[class='VfPpkd-Bz112c-LgbsSe VfPpkd-Bz112c-LgbsSe-OWXEXe-e5LLRc-SxQuSe fzRBVc tmJved mN1ivc SSgGrd Tw0Tv']"));
        Thread.sleep(2000);
        button.click();

        Thread.sleep(5000);
        driver.findElement(By.id("i13")).click();
        Thread.sleep(2000);
        button = driver.findElement(By.cssSelector("button[class='VfPpkd-Bz112c-LgbsSe VfPpkd-Bz112c-LgbsSe-OWXEXe-e5LLRc-SxQuSe fzRBVc tmJved mN1ivc SSgGrd Tw0Tv']"));
        Thread.sleep(2000);
        button.click();
        try
        {
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[@class='VfPpkd-Bz112c-LgbsSe VfPpkd-Bz112c-LgbsSe-OWXEXe-e5LLRc-SxQuSe yHy1rc eT1oJ mN1ivc qiN4Vb KY3GZb szLmtb' and @jsname='zumM6d']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[2]/c-wiz/div[2]/div/div[3]/div/div[2]/div[10]/div[2]")).click();
            Thread.sleep(2000);
            button.click();
        }
        catch (Exception e)
        {
            System.out.println("בשפה במבארה לא ניתן לבצע השמעה");
        }
    }
}
