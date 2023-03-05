/*package HomeWork;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
    public class Nestle_Page_Object
    {
        static WebDriver driver;
        static List<WebElement> job_offer;
        static WebElement next_page_button;
        static List<WebElement> page_count;
        static WebElement privecy;


        @BeforeClass
        public static void beforeClass()
        {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.nestle.com/jobs/search-jobs?keyword=&country=IL&location=&career_area=All&company=All&sort_bef_combine=search_api_relevance_DESC&sort_by=search_api_relevance&sort_order=DESC&page=%2C0");
            driver.findElement(By.id("_evidon-banner-acceptbutton")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            //job_offer = driver.findElements(By.className("jobs-card"));
            //next_page_button = driver.findElement(By.xpath("//*[@id=\"main-content\"]//a[@title='Go to next page']"));
            //page_count = driver.findElements(By.xpath("//*[@id=\"main-content\"]//nav/ul/li/a"));

        }
        @AfterClass
        public static void afterClass()

        {
            driver.quit();
        }

        @Test
        public void test_A() throws InterruptedException
        {
            int count = job_offer_count();
            System.out.println("the sum of job offer from nestle is: "+count);
        }
        public static int job_offer_count() throws InterruptedException {
            page_count(driver).size();
            int job_offer_sum = 0;
            for (int i = 0; i < page_count(driver).size(); i++)
            {
                job_offer_sum = job_offer_sum + job_offer().size();
                next_page_button(driver);
                Thread.sleep(7000);
            }
            return job_offer_sum;
        }

        public static WebElement next_page_button(WebDriver driver)
        {
            WebElement next_page_button = driver.findElement(By.xpath("//*[@id=\"main-content\"]//a[@title='Go to next page']"));
            return next_page_button;
        }

        public static List<WebElement> page_count(WebDriver driver)
        {
            List<WebElement> page_count = driver.findElements(By.xpath("//*[@id=\"main-content\"]//nav/ul/li/a"));
            return page_count;
        }

        public static List<WebElement> job_offer(WebElement driver)
        {
            List<WebElement> job_offer = driver.findElements(By.className("jobs-card"));
            return job_offer;
        }
    }

*/
