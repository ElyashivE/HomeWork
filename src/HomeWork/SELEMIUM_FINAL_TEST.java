package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class SELEMIUM_FINAL_TEST
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        //test1 - א
        System.out.println("---------------test1 - א -------------------");
        driver.get("https://www.supermarker.themarker.com/");
        driver.findElement(By.id("txtSearch")).sendKeys("מחשבון");
        Thread.sleep(2000);
        WebElement calc_list = driver.findElement(By.cssSelector(".ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content"));
        List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-1']//li"));
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).getText().equals("מחשבון משכנתא"))
            {
                System.out.println(list.get(i).getText());
                list.get(i).click();
                break;
            }
        }
        System.out.println("--------------------------------------------");
        //test1 - ב
        System.out.println("---------------test1 - ב -------------------");
        List<WebElement> month_return = driver.findElements(By.xpath("//span[@id='rblSelectCalcType']//label"));
        for (int i = 0; i < month_return.size(); i++) {
            String S_month_return = month_return.get(i).getAttribute("class");
            if (S_month_return.contains("ui-state-active"))
                System.out.println("החזר חודשי הוא ברירת מחדל");
        }
        System.out.println("-------------------------------------------");
        //test1 - ג
        System.out.println("---------------test1 - ג -------------------");
        System.out.println(driver.findElement(By.xpath("//td//img[@class='titleImg']")).getAttribute("alt"));
        System.out.println("-------------------------------------------");
        //test1 - ד
        System.out.println("---------------test1 - ד ------------------");
        driver.findElement(By.xpath("//span[@id='rblSelectKeren']//label[2]")).click();
        String keren_shava = driver.findElement(By.xpath("//span[@id='rblSelectKeren']//label[2]")).getAttribute("class");
        if (keren_shava.contains("ui-state-active"))
            System.out.println("קרן שווה נבחרה - בדיקה עברה");
        else
            System.out.println("קרן שווה לא נבחרה - בדיקה נכשלה");
        System.out.println("-------------------------------------------");
        //test1 - ה
        System.out.println("---------------test1 - ה ------------------");
        String madad = driver.findElement(By.xpath("//span[@id='rblMadad']//label[1]")).getAttribute("class");
        if (madad.contains("ui-state-active"))
            System.out.println("ללא הצמדה היא ברירת המחדל - בדיקה עברה");
        else
            System.out.println("ללא הצמדה היא אינה ברירת המחדל - בדיקה נכשלה");
        System.out.println("-------------------------------------------");
        //test1 - ו
        System.out.println("---------------test1 - ו ------------------");
        driver.findElement(By.id("txtLoanAmount")).clear();
        driver.findElement(By.id("txtLoanAmount")).sendKeys("500000");
        String overall_mortgage = driver.findElement(By.id("txtLoanAmount")).getAttribute("value");
        if (overall_mortgage.equals("500000"))
            System.out.println("הסכום נקלט 500000 - הבדיקה עברה");
        else
            System.out.println("הסכום שגוי - בדיקה נכשלה");
        System.out.println("-------------------------------------------");
        //test1 - ז
        System.out.println("---------------test1 - ז ------------------");
        WebElement size = driver.findElement(By.xpath("//td[@id='tkufa2']//span[@class='ui-slider-handle ui-state-default ui-corner-all']"));

        int count = -1;
        System.out.print("years: ");
        while (count != 0) {
            String mortgage_years = driver.findElement(By.id("txtTerm")).getAttribute("value");
            int years = Integer.parseInt(mortgage_years);
            if (years < 20) {
                System.out.print(years + " | ");
                action.clickAndHold(size).moveByOffset(5, 0).release(size).perform();
                continue;
            }
            if (years > 20) {
                System.out.print(years + " | ");
                action.clickAndHold(size).moveByOffset(-5, 0).release(size).perform();
                continue;
            } else // (years == 20)
            {
                System.out.print(years);
                break;
            }
        }
        System.out.println();
        System.out.println("-------------------------------------------");
        //test1 - ח
        System.out.println("---------------test1 - ח ------------------");
        driver.findElement(By.id("txtInterest")).clear();
        driver.findElement(By.id("txtInterest")).sendKeys("3.75");
        if (driver.findElement(By.id("txtInterest")).getAttribute("value").equals("3.74"))
            System.out.println("הסכום נקלט 3.75 - הבדיקה עברה");
        else
            System.out.println("הסכום שגוי - הבדיקה נכשלה");
        System.out.println("-------------------------------------------");
        //test1 - ט
        System.out.println("---------------test1 - ט ------------------");
        String default_result = driver.findElement(By.id("txtResult")).getText();
        driver.findElement(By.id("ibCalc")).click();
        String new_result = driver.findElement(By.id("txtResult")).getText();
        if (new_result.equals(default_result))
            System.out.println("החישוב זהה או שהבדיקה נכשלה");
        else
            System.out.println("נקלט סכום חדש - הבדיקה עברה");
        System.out.println("-------------------------------------------");
        //test1 - י
        System.out.println("---------------test1 - י ------------------");
        String overall_calc = driver.findElement(By.xpath("//*[@id='keren']")).getText();
        driver.findElement(By.id("txtEmail")).sendKeys(overall_calc);
        String verify_field = driver.findElement(By.id("txtEmail")).getAttribute("value");
        if (verify_field.equals(overall_calc))
            System.out.println("הסכום נקלט - הבדיקה עברה");
        else
            System.out.println("הסכום שגוי - הבדיקה נכשלה");
        System.out.println("-------------------------------------------");
        //test1 - יא
        String name = "אלישיב";
        System.out.println("---------------test1 - יא ------------------");
        driver.findElement(By.id("txtShemPrati")).sendKeys(name);
        System.out.println("-------------------------------------------");
        //test1 - יב
        System.out.println("---------------test1 - יב ------------------");
        boolean isSelect = driver.findElement(By.id("cbTnaim")).isSelected();
        if (isSelect == true)
            System.out.println("צק בוקס כבר לחוץ - בדיקה נכשלה");
        else {
            System.out.println("צק בוקס לא לחוץ - בדיקה עברה");
            driver.findElement(By.id("cbTnaim")).click();
            isSelect = driver.findElement(By.id("cbTnaim")).isSelected();
            if (isSelect == true)
                System.out.println("צק בוקס נלחץ - בדיקה עברה");
        }
        driver.findElement(By.id("cbTnaim")).click();
        driver.findElement(By.id("btnSendLid")).click();
        System.out.println("-------------------------------------------");
        //test1 - יג
        System.out.println("---------------test1 - יג ------------------");
        try
        {
            String email = driver.findElement(By.xpath("//label[@for='txtEmail' and @class='error']")).getText();
            if (email.equals("יש להזין כתובת מייל"))
                System.out.println("קיימת הודעת שגיאה מייל - בדיקה עברה");
        }
        catch (Exception e)
        {
            System.out.println("הודעה שגיאה מייל לא קיימת - בדיקה נכשלה");
        }
        try
        {
            String phone = driver.findElement(By.xpath("//label[@for='txtTelephone' and @class='error']")).getText();
            if (phone.equals("יש להזין מספר טלפון"))
                System.out.println("קיימת הודעת שגיאה טלפון - בדיקה עברה");
        }
        catch (Exception e)
        {
            System.out.println("הודעה שגיאה טלפון לא קיימת - בדיקה נכשלה");
        }
        try
        {
            String tnaim = driver.findElement(By.xpath("//label[@for='ctl00$ContentPlaceHolder1$MortgageLead$cbTnaim' and @class='error']")).getText();
            if (tnaim.equals("יש לאשר את תנאי השימוש"))
                System.out.println("קיימת הודעת שגיאה תנאי שימוש - בדיקה עברה");
        }
        catch (Exception e)
        {
            System.out.println("הודעה שגיאה תנאי שימוש לא קיימת - בדיקה נכשלה");
        }



        System.out.println("-------------------------------------------");
    }
}
