package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class tables
{
    public static void main(String[] args)
    {

        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        //tables
        //test1
        int countA=0,countB=0,countC=0;
        driver.get("http://danielauto.net/practice/tabls/tables.html");
/*        List<WebElement> column = driver.findElements(By.xpath("//td[2]"));
        System.out.println("column size: "+column.size());
        List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"tab\"]/thead/tr/th"));
        System.out.println("row size: "+row.size());
        for (int i = 0; i < column.size(); i++)
        {
            if(column.get(i).getText().equals("A"))
                countA++;
            else if (column.get(i).getText().equals("B"))
                countB++;
            else if (column.get(i).getText().equals("C"))
                countC++;
        }
        System.out.println("Count:");
        System.out.println("A = " +countA);
        System.out.println("B = " +countB);
        System.out.println("C = " +countC);
        List<WebElement> price = driver.findElements(By.xpath("//td[4]"));

        double num =0,highest=0;
        String S_num = "";
        for (int i = 0; i < price.size(); i++)
        {

            S_num = price.get(i).getText();
            String replae_S_num = S_num.replace(",","");
            num = Double.parseDouble(replae_S_num);
            if(num>highest)
                highest = num;
        }
        System.out.println("biggest num is: "+highest);

        List<WebElement> company_name = driver.findElements(By.xpath("//td[1]"));
        System.out.println("companies with the f_l = A  from group C only are: ");
        column = driver.findElements(By.xpath("//td[2]"));
        for (int i = 0; i < column.size(); i++)
        {
            String company = company_name.get(i).getText();
            char first_l = company.charAt(0);
            if (first_l == 'A' || first_l == 'a')
                if (column.get(i).getText().equals("C"))
                    System.out.println(company);
        }

        List<WebElement> change = driver.findElements(By.xpath("//td[5]"));
        double sum=0;
        for (int i = 0; i < change.size(); i++)
        {
            String S_change = change.get(i).getText();
            String replace_S_change = S_change.replace("+","");
            sum = sum + Double.parseDouble(replace_S_change);
        }
        System.out.println("sum of change is: " + String.format("%.2f", sum));
*/
        //test7
        driver.findElement(By.partialLinkText("טבלה עם מספר תאים לא זהה")).click();
        List<WebElement> rows = driver.findElements(By.xpath("//tr//td[1]"));
        for (int i = 1; i <= rows.size(); i++)
        {
            driver.findElements(By.xpath("//tr//td["+(i)+"]"));
            List<WebElement> col = driver.findElements(By.xpath("//tr["+(i)+"]//td"));
            for (int j = 0; j < col.size(); j++)
            {
                if(j == col.size()-1)
                    System.out.print("the last num of row "+(i)+" is: "+col.get(j).getText());
            }
            System.out.println();
        }

        //test8
        rows = driver.findElements(By.xpath("//tr//td[1]"));
        for (int i = 1; i <= rows.size(); i++)
        {
            rows =  driver.findElements(By.xpath("//tr//td["+(i)+"]"));
            List<WebElement> col = driver.findElements(By.xpath("//tr["+(i)+"]//td"));
            for (int j = 0; j < col.size(); j++)
            {
                    System.out.println("in the row: "+i+" column: "+(j+1)+" have number: "+col.get(j).getText());
            }
        }
    }
}
