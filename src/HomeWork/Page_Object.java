package HomeWork;

import org.apache.poi.ss.formula.functions.T;
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

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Page_Object
{
    static WebDriver driver;
    static WebElement input;
    static WebElement search;
    static WebElement add;
    static WebElement quantity;
    static List<WebElement> add_to_bag_name_item;
    static List<WebElement> remove_from_bag;
    static WebElement sum_calories;
    static WebElement sum_fat;
    static List<WebElement> list_calo;
    static List<WebElement> list_fat;




    @BeforeClass
    public static void beforeClass()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" http://www.netogreen.co.il/Calculators/Nutrition-Calories.aspx ");
        input = driver.findElement(By.id("searchTxt"));
        search = driver.findElement(By.id("Button1"));
        add = driver.findElement(By.xpath("//td/input[@class='calculator_deleteTxt']"));
        quantity = driver.findElement(By.id("quantity"));

    }
    @AfterClass
    public static void afterClass()
    {
        driver.quit();
    }
    @Test
    public void test_A() throws InterruptedException
    {
        input_and_search("לחם");
        String Result = list(0);
        if(Result.contains("לחם"))
            System.out.println("test pass");
        else
            System.out.println("test fail");
    }
    @Test
    public void test_B()throws InterruptedException
    {
        input_and_search("123");
        String Result = list(0);
        if(Result.contains("לא נמצאו מזונות, נסה שנית."))
            System.out.println("test pass");
        else
            System.out.println("test fail");
    }
    @Test
    public void test_C() throws InterruptedException {
        input_and_search("לחם");
        String Result = list(3);
        if (Result.contains("לחם זיתים"))
        {
            click_in_list(3);
            add();
            String text = alert();
            close_alert();
            //System.out.println(text);
            if (text.equals("יש לבחור  יחידת מידה וכמות"))
                System.out.println("test pass");
            else
                System.out.println("test fail");
        }
        else
            System.out.println("test fail");
    }
    @Test
    public void test_D() throws InterruptedException
    {
        String Result = Quantity("qwe");
        //System.out.println(Result);
        if (Result.equals(""))
            System.out.println("test pass");
        else
            System.out.println("test fail");
    }

    @Test
    public void test_E() throws InterruptedException
    {

        input_and_search("לחם");
        click_in_list(3);
        String Result = Quantity("900000000");
        add();
        String text = alert();
        close_alert();
        //System.out.println(text);
        if (text.contains("קוד: 3001"))
            System.out.println("test pass");
        else
            System.out.println("test fail");
    }

    @Test
    public void test_F() throws InterruptedException
    {
        input_and_search("לחם");
        click_in_list(3);
        String Result = Quantity("5");
        add();
        Result = my_list_after_add(0);
        if(Result.equals("לחם זיתים"))
            System.out.println("test pass");
        else
            System.out.println("test fail");
    }

    @Test
    public void test_G() throws InterruptedException
    {
        input_and_search("לחם");
        click_in_list(0);
        String Result = Quantity("2");
        add();
        Result = my_list_after_add(1);
        if(Result.equals("לחם לבן"))
            System.out.println("test pass");
        else
            System.out.println("test fail");
    }

    @Test
    public void test_H() throws InterruptedException
    {
        remove_from_my_list(0);
        String Result = my_list_after_add(0);
        if(!Result.equals("לחם זיתים"))
            System.out.println("test pass");
        else
            System.out.println("test fail");
    }

    @Test
    public void test_I() throws InterruptedException
    {
        input_and_search("לחם");
        click_in_list(5);
        String Result = Quantity("2");
        add();
        Result = my_list_after_add(1);
        if(Result.equals("לחם חמניות מופחת מלח"))
            System.out.println("test pass");
        else
            System.out.println("test fail");
    }

    @Test
    public void test_J() throws InterruptedException
    {
        boolean Result = calc_calo();
        if(Result)
            System.out.println("test pass");
        else
            System.out.println("test fail");
    }

    @Test
    public void test_K() throws InterruptedException
    {
        boolean Result = calc_fat();
        if(Result)
            System.out.println("test pass");
        else
            System.out.println("test fail");
    }
//-----------------------------------------------------------------------------------------------------------------------
    public static void input_and_search(String INPUT) throws InterruptedException
    {
        input.clear();
        input.sendKeys(INPUT);
        search.click();
        Thread.sleep(4000);
    }

    public static void add() throws InterruptedException
    {
        add.click();
        Thread.sleep(3000);
    }

    public static String list(int num)
    {
        String Result = "";
        List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"serachResults\"]/option"));
        Result = list.get(num).getText();
        //System.out.println(Result);
        return Result;
    }

    public static String alert()
    {
        String Result = "";
        Result = driver.switchTo().alert().getText();
        return Result;
    }

    public static void close_alert()
    {
        driver.switchTo().alert().accept();
    }

    public static void click_in_list(int num)
    {
        List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"serachResults\"]/option"));
        list.get(num).click();
    }

    public static String Quantity(String INPUT) throws InterruptedException
    {
        quantity.clear();
        quantity.sendKeys(INPUT);
        Thread.sleep(2000);
        //System.out.println(quantity.getAttribute("value").trim());
        return quantity.getAttribute("value").trim();
    }

    public static String my_list_after_add(int num)
    {
        add_to_bag_name_item = driver.findElements(By.xpath("//table[@id]//*[@class='odd']/td[@class='first']"));
        return add_to_bag_name_item.get(num).getText();

    }

    public static void remove_from_my_list(int num)
    {
        remove_from_bag = driver.findElements(By.xpath("//*[@id=\"foodsTable\"]//a"));
        remove_from_bag.get(num).click();
    }
    public static boolean calc_calo()
    {
        list_calo = driver.findElements(By.xpath("//*[@id=\"foodsTable\"]//tr/td[7]"));
        int sum =0;
        for (int i = 0; i < list_calo.size(); i++)
        {
            sum = sum + Integer.parseInt(list_calo.get(i).getText());
        }
        sum_calories = driver.findElement(By.xpath("//*[@id=\"foodsSummery\"]//tr[3]/td[1]"));
        String sum_calo = sum_calories.getText();
        sum_calo = sum_calo.replace("קלוריות","").trim();
        int i_sum_calo = Integer.parseInt(sum_calo);

        if(i_sum_calo == sum)
            return true;
        else
            return false;
    }

    public static boolean calc_fat()
    {
        list_fat = driver.findElements(By.xpath("//*[@id=\"foodsTable\"]//tr/td[8]"));
        int sum =0;
        for (int i = 0; i < list_fat.size(); i++)
        {
            sum = sum + Integer.parseInt(list_fat.get(i).getText());
        }
        sum_fat = driver.findElement(By.xpath("//*[@id=\"foodsSummery\"]//tr[3]/td[2]"));
        String sum_fats = sum_fat.getText();
        sum_fats = sum_fats.replace("גרם","").trim();
        int i_sum_calo = Integer.parseInt(sum_fats);

        if(i_sum_calo == sum)
            return true;
        else
            return false;
    }
}
