package HomeWork;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;                                                                         // should create automatically
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Selenium_First_Run
{
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String RESET = "\033[0m";  // Text Reset

    public static void main(String[] args) throws InterruptedException, IOException {

        // TEST class
        WebDriver driver = new ChromeDriver();                                                                          // open Chrome webpage
        driver.manage().window().maximize();                                                                            // max Chrome window
        driver.get("http://www.d.co.il");
        Thread.sleep(5000);                                                                                             // add 5sec delay before next line
        driver.findElement(By.id("query")).sendKeys("חשמלאי");                                                          // add text  חשמלאי to search
        driver.findElement(By.className("search_submit")).click();                                                      // press search button
        Thread.sleep(5000);
        System.out.println("your URL is: " + driver.getCurrentUrl());
        System.out.println("your title is: " + driver.getTitle());
        if("חשמלאים - כ-3838 חשמלאים מוסמכים בכל הארץ - דפי זהב NoIndex NoFollow noidx".equals(driver.getTitle()))      // equals that the title of the page is as what shown
            System.out.println("its a match");
        else
            System.out.println("its not a match");
//        Thread.sleep(5000);                                                                                           // add 5sec delay before next line
//        driver.quit();                                                                                                // close process

/*
        // TEST Homework 1 - sout print represent the paragraph number
        String name = "ELYASHIV";
        WebDriver driver = new ChromeDriver();                                                                          // open Chrome webpage
        driver.get("https://danielauto.net/practice/newLocator/locator.html");                                          // go to address
        driver.findElement(By.id("myText")).sendKeys(name);                                                             // enter k.b input ELYASHIV
        Thread.sleep(2000);                                                                                             // add delay before enter new page after submit button
        driver.findElement(By.id("btn")).click();                                                                       // press submit button
        Thread.sleep(2000);
        System.out.println("1.the name is: " + driver.findElement(By.id("myText2")).getText());
        Thread.sleep(2000);
        driver.navigate().back();                                                                                       // back button return to previous page
        Thread.sleep(2000);
        driver.findElement(By.name("by_Name")).click();                                                                 // click on the flag element
        if (driver.findElement(By.name("by_Name")).getAttribute("onclick").equals("document.getElementById('aa').src='name_red.png'")) // check if flag element changed after click
            System.out.println(GREEN_BRIGHT+"2.element changed red - PASS"+RESET);
        else
            System.out.println(RED_BRIGHT+"2.element not changed - FAIL"+RESET);
        System.out.println("3.combined text: " + driver.findElement(By.tagName("h3")).getText() + " " + driver.findElement(By.className("c_name")).getText()); // print 2 texts
        System.out.println("4.your xpath text is: "+ driver.findElement(By.xpath("/html/body/p[5]")).getText()); // print text
        driver.findElement(By.linkText("Click me to check link text")).click();                                         // click link to new page
        System.out.println("5.1st link text is: " + driver.findElement(By.id("link_text")).getText());                  // print text inside the new link
        Thread.sleep(2000);
        driver.navigate().back();                                                                                       // back button return to previous page
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("partial link text")).click();                                            // click link by part of link to new page
        System.out.println("6.2nd link text is: " + driver.findElement(By.id("p_link_text")).getText());
        Thread.sleep(2000);
        driver.navigate().back();                                                                                       // back button return to previous page
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='button']")).click();                                             // click new button using css selector
        System.out.println("7.press me button: " + driver.findElement(By.id("btn")).getText() + " " + driver.findElement(By.tagName("h1")).getText()); // print text inside the new page
        System.out.println();
        System.out.println("<---TEST ENDED--->");
        Thread.sleep(2000);
        driver.quit();                                                                                                  // close the process and webpage

        // netflix play movie test
        String email = "xxx";
        String password = "xxxx";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.netflix.com/il-en/");
        System.out.println("open Webpage - OK");
        driver.findElement(By.partialLinkText("Sign In")).click();
        System.out.println("log-in page - OK");
        driver.findElement(By.cssSelector("input[type='text'")).sendKeys(email);
        System.out.println("email - OK");
        driver.findElement(By.cssSelector("input[type='password'")).sendKeys(password);
        System.out.println("password - OK");
        driver.findElement(By.className("btn")).click();
        System.out.println("submit - OK");
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("elyashiv & sarit")).click();
        System.out.println("choose profile - OK");
        Thread.sleep(3000);
        driver.findElement(By.className("rtl-j0gpa2")).click();
        System.out.println("play movie - OK");
        System.out.println("<---TEST ENDED--->");
        Thread.sleep(15000);
        driver.quit();
/*

       // test simania
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.simania.co.il");
        driver.manage().window().maximize();
        driver.findElement(By.id("query")).sendKeys("אין ילדים רעים");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='submit' and @class='clickable']")).click();
        Thread.sleep(3000);
        System.out.println("author name is: "+ driver.findElement(By.tagName("h3")).getText());
        driver.findElement(By.xpath("//div[@id ='comments']//div[@class='collapseBtnWrapper']")).click();
        Thread.sleep(3000);
        List<WebElement> reviews = driver.findElements(By.xpath("//div[@ng-if='review.userId > 1']//div[@class='imageOverlay']"));
        System.out.println("num of reviews is: "+ reviews.size());

        for (int i = 0; i < reviews.size(); i++)
        {
            System.out.println("name" + (i+1) +" is: " + reviews.get(i).getAttribute("innerHTML").trim());
        }

        // stackoverflow
        WebDriver driver = new ChromeDriver();
        driver.get("https://stackoverflow.com/tags");
        List<WebElement> tags = driver.findElements(By.xpath("//a[@class='post-tag']"));
        List<WebElement> count = driver.findElements(By.xpath("//div[@class='mt-auto d-flex jc-space-between fs-caption fc-black-400']//div[@class='flex--item']"));
        for (int i=0 ; i<count.size() ; i++)
        {
            System.out.println("tage name " + tags.get(i).getText() +" we got "+ count.get(i).getText());
        }

        //calauto
        int TEMP = 0, CountYears = 0, Count2014 = 0;
        String [] WtoS = new String[0];
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calauto.co.il/heb/wantbuy/searchresults/");
        driver.manage().window().maximize();
        List<WebElement> Num_of_cars = driver.findElements(By.xpath("//tr[@class='group']//td[@class='year ng-binding']"));
        for (int i = 0; i < Num_of_cars.size(); i++)
        {
            String WEBtoSTRING = Num_of_cars.get(i).getAttribute("innerHTML").trim();
            if(WEBtoSTRING.contains("-"))
            {
                WtoS = WEBtoSTRING.split("-");
                for (int j = 0; j < WtoS.length; j++)
                {
                    TEMP = Integer.parseInt(WtoS[j].trim());
                    if (TEMP < 2014)
                    {
                        Count2014++;
                //        System.out.println(TEMP);
                    }
                }
            }
            else
            {
                TEMP = Integer.parseInt(WEBtoSTRING);
                if (TEMP < 2014)
                {
                    Count2014++;
                //    System.out.println(TEMP);
                }
            }
            System.out.println(Num_of_cars.get(i).getAttribute("innerHTML").trim());
            CountYears++;
        }
        System.out.println("Num of cars checked is: "+ CountYears);
        System.out.println("Num of cars older then 2014 are: "+ Count2014);

        //test kita
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("NewTab")).click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(5000);
        driver.close();


        //test action 1
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://marcojakob.github.io/dart-dnd/basic/");
        List<WebElement> DOCUMENT = driver.findElements(By.xpath("//*[@class='document']"));
        WebElement TRASH = driver.findElement(By.xpath("//*[@class='trash']"));
        for (int i = 0; i < DOCUMENT.size(); i++)
        {
            new Actions(driver).dragAndDrop(DOCUMENT.get(i),TRASH).perform();
            Thread.sleep(1000);
        }

/*
        //test action 2-a
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        try
        {
            System.out.println("<----test 2 init---->");
            driver.manage().window().maximize();
            driver.get("http://danielauto.net/practice/action/multipick.html");
            List<WebElement> CITIES = driver.findElements(By.tagName("option"));
            action.keyDown(Keys.SHIFT).click(CITIES.get(0)).click(CITIES.get(2)).keyUp(Keys.SHIFT).perform();
            Thread.sleep(2000);

            //test action 2-b
            action.keyDown(Keys.CONTROL).click(CITIES.get(0)).click(CITIES.get(1)).click(CITIES.get(2)).click(CITIES.get(4)).click(CITIES.get(0)).keyUp(Keys.CONTROL).perform();
            System.out.println("<----test 2 finished OK---->");
        }
        catch (Exception e)
        {
            System.out.println("<----test 2 fail---->");
        }

        //test action 3
        try
        {
            System.out.println("<----test 3 init---->");
            WebElement doubleClickElement = driver.findElement(By.id("dbl_click"));
            action.doubleClick(doubleClickElement).perform();
            WebElement Double_C_E_Text = driver.findElement(By.id("demo"));
            if (Double_C_E_Text.getText().equals("הלחיצה על התמונה עברה בהצלחה"))
                System.out.println("<----test 3 finished OK---->");
            else
                System.out.println("test 3 finished NOT-OK");
        }
        catch (Exception e)
        {
            System.out.println("<----test 3 fail---->");
        }

        //test action 4
        try
        {
            System.out.println("<----test 4 init---->");
            Thread.sleep(2000);
            WebElement Mouses_Over;
            for (int i = 0; i < 2; i++) {
                Mouses_Over = driver.findElement(By.id("demo2"));
                action.moveToElement(Mouses_Over).perform();
                Thread.sleep(2000);
                action.moveToElement(driver.findElement(By.id("dbl_click")));
                Thread.sleep(2000);
            }
            String Mouse_Over_Text = driver.findElement(By.id("demo2")).getText();

            if (Mouse_Over_Text.equals("2"))
                System.out.println("<----test 4 finished OK---->");
            else
                System.out.println("test 4 finished NOT-OK");
        }
        catch (Exception e)
        {
            System.out.println("<----test 4 fail---->");
        }

        //test action 5
        try
        {
            System.out.println("<----test 5 init---->");
            WebElement menu = driver.findElement(By.xpath("//button[@class='dropbtn']"));
            Actions actions = new Actions(driver);
            actions.moveToElement(menu).perform();
            Thread.sleep(2000);
            WebElement submenu = driver.findElement(By.xpath("//a[@id='ynet']"));
            Thread.sleep(2000);
            actions.click(submenu).perform();
            System.out.println("ynet title: " + driver.getTitle());
            driver.navigate().back();
            Thread.sleep(2000);
            System.out.println("<----test 5 finished OK---->");
        }
        catch(Exception e)
        {
            System.out.println("<----test 5 fail---->");
        }

        //test action 6
        try
        {
           System.out.println("<----test 6 init---->");
           WebElement baby_pic = driver.findElement(By.id("baby"));
           new Actions(driver).scrollToElement(baby_pic).perform();
           Thread.sleep(8000);
           Screenshot entirePageScreenShot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
           ImageIO.write(entirePageScreenShot.getImage(),"png",new File("C:\\Users\\sarit_2\\Desktop\\Automation\\Selenium\\Pictures\\nameFile.png"));
           System.out.println("<----test 6 finished OK---->");
        }
        catch (Exception e)
        {
            System.out.println("<----test 6 fail---->");
        }

        driver.get("https://jqueryui.com/accordion/#custom-icons");
        driver.switchTo().frame(0);
        Actions action4=new Actions(driver);
        driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/span")).click();
        Thread.sleep(5000);
        WebElement pic_open=driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]"));
        Thread.sleep(1000);
        if (pic_open.getAttribute("aria-expanded").contains("true"))
        {
            System.out.println("the section 3 is open");
        }
        else if (pic_open.getAttribute("aria-expanded").contains("false"))
        {
            System.out.println("the section 3 is closed");
        }
        Thread.sleep(1000);
        List<WebElement> list_item=driver.findElements(By.xpath("//*[@id='ui-id-6']/ul/li\n"));
        System.out.println("There are "+ " " + list_item.size()+ " " + "bullets in Section3");
        Thread.sleep(1000);

        int people=0, product =0;
        String temp="";
        driver.get("https://jqueryui.com/autocomplete/#categories");
        driver.switchTo().frame(0);
        Actions action6=new Actions(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("search")).sendKeys("a");
        Thread.sleep(1000);
        //List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-1']/li[@class='ui-menu-item']"));
        List<WebElement> list_products = driver.findElements(By.xpath("//li[contains(@aria-label,'Products')]"));
        List<WebElement> list_people = driver.findElements(By.xpath("//li[contains(@aria-label,'People')]"));

        for (int i = 0; i < list_people.size(); i++)
        {
            System.out.println(list_people.get(i).getText());

        }
        System.out.println(list_people.size());
*/

    }
}


