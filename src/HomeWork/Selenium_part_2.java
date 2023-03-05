package HomeWork;

import com.paulhammant.ngwebdriver.ByAngular;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.xml.stream.Location;
import java.awt.*;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Selenium_part_2
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
/*
        //Action advanced
        //test1
        System.out.println("_________________TEST_1_________________");
        String B_color = "rgba(233, 233, 233, 1)"; // grey color
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
//        B_color = droppable.getCssValue("background-color");
//        System.out.println("droppable color: " + B_color);
        action.dragAndDrop(draggable,droppable).perform();
        B_color = droppable.getCssValue("background-color");
//        System.out.println("droppable color: " + B_color);
        if (!B_color.equals("rgba(233, 233, 233, 1)"))
            System.out.println("color changed - PASS OK");
        else
            System.out.println(" color is the same - FAIL");
        driver.switchTo().defaultContent();
       //test2
        System.out.println("_________________TEST_2_________________");
//        driver.get("https://jqueryui.com/sortable/");
        driver.findElement(By.partialLinkText("Sortable")).click();
        Thread.sleep(1000);
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        List<WebElement> pick = driver.findElements(By.xpath("//*[@id='sortable']//li[@class]"));

        action.clickAndHold(pick.get(6)).moveToElement(pick.get(0)).release(pick.get(0)).perform();
        action.clickAndHold(pick.get(1)).moveToElement(pick.get(0)).release(pick.get(0)).perform();
        action.clickAndHold(pick.get(2)).moveToElement(pick.get(0)).release(pick.get(0)).perform();
        action.clickAndHold(pick.get(3)).moveToElement(pick.get(0)).release(pick.get(0)).perform();
        action.clickAndHold(pick.get(4)).moveToElement(pick.get(0)).release(pick.get(0)).perform();
        action.clickAndHold(pick.get(5)).moveToElement(pick.get(0)).release(pick.get(0)).perform();
        action.clickAndHold(pick.get(4)).moveToElement(pick.get(3)).release(pick.get(3)).perform();
        action.clickAndHold(pick.get(4)).moveToElement(pick.get(2)).release(pick.get(2)).perform();

        List<WebElement> New_pick = driver.findElements(By.xpath("//*[@id='sortable']//li[@class]"));
        for (int i = 0; i < New_pick.size(); i++)
        {
            System.out.print("["+i+"]= "+New_pick.get(i).getText());
            if(New_pick.get(i).getText().equals("Item 7"))
                System.out.print(" - pass OK");
            else if(New_pick.get(i).getText().equals("Item 2"))
                System.out.print(" - pass OK");
            else if(New_pick.get(i).getText().equals("Item 5"))
                System.out.print(" - pass OK");
            else if(New_pick.get(i).getText().equals("Item 3"))
                System.out.print(" - pass OK");
            else if(New_pick.get(i).getText().equals("Item 4"))
                System.out.print(" - pass OK");
            else if(New_pick.get(i).getText().equals("Item 6"))
                System.out.print(" - pass OK");
            else if(New_pick.get(i).getText().equals("Item 1"))
                System.out.print(" - pass OK");
            else
                System.out.print(" - FAIL");
            System.out.println();
        }
        driver.switchTo().defaultContent();
/*
        //test3
        System.out.println("_________________TEST_3_________________");
//        driver.get("https://jqueryui.com/selectable/");
        String not_selected_color = "rgba(255, 255, 255, 1)";
        driver.findElement(By.partialLinkText("Selectable")).click();
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        List<WebElement> select = driver.findElements(By.xpath("//ol[1]/li"));
//        System.out.println("B color: "+select.get(0).getCssValue("background-color"));
        action.keyDown(Keys.CONTROL).click(select.get(1)).click(select.get(3)).click(select.get(4)).click(select.get(5)).perform();
        Thread.sleep(1000);
        action.keyDown(Keys.CONTROL).click(select.get(1)).click(select.get(4)).perform();
        Thread.sleep(1000);
        select = driver.findElements(By.xpath("//ol[1]/li"));
//        System.out.println(select.get(6).getCssValue(""));

//        System.out.println("B color: "+select.get(5).getCssValue("background-color"));
        for (int i = 0; i < select.size(); i++)
        {
            System.out.print("["+i+"]= "+select.get(i).getText());
            if (i <=2 || i==4 || i==6)
                if(select.get(i).getCssValue("background-color").equals(not_selected_color))
                    System.out.print(" - pass OK");
                else
                    System.out.print(" - FAIL");

            else if (i==3 || i==5)
                if((!select.get(3).getCssValue("background-color").equals(not_selected_color)) && (!select.get(5).getCssValue("background-color").equals(not_selected_color)))
                    System.out.print(" - pass OK");
                else
                    System.out.print(" - FAIL");
            System.out.println();
        }
        driver.switchTo().defaultContent();

        //test4
        System.out.println("_________________TEST_4_________________");
        Scanner input = new Scanner(System.in);
        System.out.print("enter parameter to size x: ");
        //x should be 190 and y 150 for the test to pass
        int x = input.nextInt();
        System.out.print("enter parameter to size y: ");
        int y = input.nextInt();
        driver.get("https://jqueryui.com/resizable/");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement size = driver.findElement(By.xpath("//div[3]"));
        action.clickAndHold(size).moveByOffset(x,y).release(size).perform();//for every 1 offset its 150px so: xOffset = 190 = 340px and yOffset = 150 = 300px
        String parameters = driver.findElement(By.id("resizable")).getAttribute("style");
        parameters = parameters.replace("width:","");
        parameters = parameters.replace("height:","");
        parameters = parameters.replace("px;","");
        parameters = parameters.replace("  ",",");
        String[] parametersS = parameters.trim().split(",");
        System.out.println("the size is: "+parameters);
        if(parametersS[0].equals("340") && parametersS[1].equals("300"))
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        driver.quit();

        //test5
        System.out.println("_________________TEST_5_________________");
        driver.get("https://jqueryui.com/accordion/#custom-icons");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        driver.findElement(By.id("ui-id-5")).click();
        String tab_status = driver.findElement(By.id("ui-id-5")).getAttribute("class");
        if(tab_status.contains("ui-accordion-header-collapsed ui-corner-all"))
            System.out.println("tab is closed - FAIL");
        else if (tab_status.contains("ui-accordion-header-active ui-state-active"))
            System.out.println("tab is opened - PASS");
        else
            System.out.println("tab status - ERROR ");
        List<WebElement> list = driver.findElements(By.xpath("//ul/li"));
        System.out.println("bullet count is:" + list.size());
        driver.switchTo().defaultContent();

        //test6
        System.out.println("_________________TEST_6_________________");
        driver.get("https://jqueryui.com/autocomplete/");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        driver.findElement(By.id("tags")).sendKeys("ja");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> list = driver.findElements(By.xpath("//ul[@id]//div"));
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i).getText());
        }
        System.out.println("count of list is: "+list.size());
        driver.quit();

        //test7
        System.out.println("_________________TEST_7_________________");
        driver.get("https://jqueryui.com/autocomplete/#categories");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        driver.findElement(By.id("search")).sendKeys("a");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> list_products = driver.findElements(By.xpath("//ul[@id]//li[contains(@aria-label,'Products')]"));
        List<WebElement> list_people = driver.findElements(By.xpath("//ul[@id]//li[contains(@aria-label,'People')]"));
        for (int i = 0; i < list_products.size(); i++)
        {
            System.out.println(list_products.get(i).getText());
        }
        System.out.println("---count of products is: "+list_products.size()+"---");
        for (int i = 0; i < list_people.size(); i++)
        {
            System.out.println(list_people.get(i).getText());
        }
        System.out.println("---count of people is: "+list_people.size()+"---");

        //test8
        System.out.println("_________________TEST_8_________________");
        driver.get("https://jqueryui.com/autocomplete/#multiple-remote");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        driver.findElement(By.id("birds")).sendKeys("fa");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-1']//div"));
        System.out.println("list contant:");
        for (int i = 0; i < list.size(); i++)
        {
            String name = list.get(i).getText();
            if(name.charAt(0) == 'F' && name.charAt(1) == 'a')
                System.out.println(name);
        }

        //test9
        System.out.println("_________________TEST_9_________________");
        driver.get("https://jqueryui.com/checkboxradio/#no-icons");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        List<WebElement> list = driver.findElements(By.xpath("//fieldset[2]/label"));
        String status;
        for (int i = 0; i < list.size(); i++)
        {
            String rank = list.get(i).getText();
            if(rank.equals("2 Star") || rank.equals("4 Star"))
            {
                status = list.get(i).getAttribute("class");
                if (!status.contains("ui-checkboxradio-checked ui-state-active"))
                {
                    System.out.println(rank+" already selected - FAIL");
                }
                else
                {
                    list.get(i).click();
                    System.out.println(rank+" selected - PASS");
                }
            }
        }
        driver.quit();





*/        //10
        driver.get("https://jqueryui.com/spinner/#default ");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        for (int i = 0; i < 30; i++)
            driver.findElement(By.xpath("//a[contains(@class,'i-spinner-button ui-spinner-up')]")).click();
        driver.findElement(By.id("disable")).click();
        try
        {
            driver.findElement(By.xpath("//a[contains(@class,'i-spinner-button ui-spinner-up')]")).click();
            System.out.println("button up still active - FAil");
        }
        catch (Exception e)
        {
            System.out.println("button up is disabled - PASS");
        }
        driver.findElement(By.id("getvalue")).click();
        //driver.switchTo().defaultContent();
        System.out.println("alert text is: "+driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        driver.quit();
        System.out.println("---TEST PASS---");








    }
}
