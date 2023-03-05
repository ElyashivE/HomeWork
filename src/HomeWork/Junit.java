package HomeWork;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Junit
{
    static WebDriver driver;
    static double supersal = 0;
    static  double rami_levi = 0;
    static double quik = 0;

    @BeforeClass
    public static void beforeClass()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void afterClass()
    {
        driver.quit();
    }
    @Test
    public void test_A_supersal()
    {
        System.out.print("supersal price is: ");
        driver.get("https://www.shufersal.co.il/online/he/");
        driver.findElement(By.id("js-site-search-input")).sendKeys("שניצל תירס טיבעול");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String price = driver.findElement(By.xpath("//*[@id='mCSB_6_container']/div[2]/div[2]/div/div[2]/div[1]/span[1]/span[1]")).getText();
        price = price.trim();
        supersal = Double.parseDouble(price);
        System.out.println(supersal);
    }
    @Test
    public void test_B_rami()
    {
        System.out.print("rami levi price is: ");
        driver.get("https://www.rami-levy.co.il/he/online/market");
        driver.findElement(By.id("destination")).sendKeys("שניצל תירס טיבעול");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String price = driver.findElement(By.xpath("//*[@id='item-srch-0']/div/div[4]/span/span")).getText();
        price = price.replace("₪","");
        price = price.trim();
        rami_levi = Double.parseDouble(price);
        System.out.println(rami_levi);
    }
    @Test
    public void test_C_quik()
    {
        System.out.print("quik price is: ");
        driver.get("https://quik.co.il/");
        driver.findElement(By.className("searchInput_KC6")).sendKeys("שניצל תירס טיבעול");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String price_shekel = driver.findElement(By.xpath("//*[@id='product-7290111566752']/div[5]/div/strong")).getText();
        String price_agura = driver.findElement(By.xpath("//*[@id='product-7290111566752']/div[5]/div/small[2]")).getText();
        String price = price_shekel+"."+price_agura;
        quik = Double.parseDouble(price);
        System.out.println(quik);
    }
    @Test
    public void test_D_compare()
    {
        System.out.println("_______________________________");
        if(supersal < rami_levi && supersal < quik)
            System.out.println("---supersal is the cheapest---");
        else if(rami_levi < supersal && rami_levi < quik)
            System.out.println("---rami_levi is the cheapest---");
        else if(quik < supersal && quik < rami_levi)
            System.out.println("---quick is the cheapest---");

    }

}
