package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class SELENIUM_FINAL_TEST_DEKEL_FARM
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().minimize();

        driver.get("https://my.weekend.co.il/reviews.aspx?id=3094&lang=he");
        List<WebElement> reviews_page_list = driver.findElements(By.xpath("//div[@class]//td[@class='grades2']")); // ציונים 44 עבור כל דף
        //WebElement next_page = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_DataPagerMadorsRepeater']/a[13]"));
        List<WebElement> temp_list;
        temp_list = reviews_page_list;
        double sum = 0;
        int count_reviewee = 0;
        int paging =1;
        int sum_of_reviewee = 0;
        for (int i = 0; i < temp_list.size(); i++)
        {
            System.out.print((i+1)+". "+temp_list.get(i).getText()+" | ");
            sum = sum + Double.parseDouble(temp_list.get(i).getText());
            if (paging == 10 && (i+1)%4 == 0)
            {
                sum_of_reviewee++;
                System.out.println();
            }
            else if((i+1)%4 == 0)
            {
                count_reviewee++;
                System.out.println();
            }
            if((count_reviewee) == 11)
            {
                i=-1;
                sum_of_reviewee = sum_of_reviewee + count_reviewee;
                count_reviewee = 0;
                System.out.println("--- page "+paging+" ---");
                paging++;
                //next_page.click();
                driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_DataPagerMadorsRepeater']/a[13]")).click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                temp_list = driver.findElements(By.xpath("//div[@class]//td[@class='grades2']"));
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("sum_of_reviewee = " + sum_of_reviewee);
        System.out.println("review avg is: "+String.format("%.2f", (sum/sum_of_reviewee)/4));
    }
}
