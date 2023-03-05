package HomeWork;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Excel
{
    static String filepath = "C:\\Users\\sarit_2\\Desktop\\Automation\\Selenium\\Excel\\excel_test.xlsx";

    public static void main(String[] args) throws IOException
    {
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.google.com/search?q=google&sxsrf=AJOqlzWre4WrnuohQTli4qUEFkqNU0YhaA%3A1676223898647&source=hp&ei=miXpY_jSJbCdkdUPvvW_-AI&iflsig=AK50M_UAAAAAY-kzqmqljMchyCM1Q-qEfXWX5yutEgQM&ved=0ahUKEwj4h6rQxJD9AhWwTqQEHb76Dy8Q4dUDCBA&oq=&gs_lcp=Cgdnd3Mtd2l6EAMYADIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCC4Q6gIQJzoECC4QJzoKCC4QxwEQ0QMQJzoECCMQJzoRCC4QgAQQsQMQgwEQxwEQ0QM6BQgAEIAEOg4ILhCABBCxAxDHARDRAzoLCAAQgAQQsQMQgwE6CAgAEIAEELEDULkMWPYUYOogaAJwAHgAgAGTAYgBkwGSAQMwLjGYAQCgAQGwAQo&sclient=gws-wiz");

        FileInputStream fis = new FileInputStream (filepath);
        XSSFWorkbook wb = new XSSFWorkbook (fis);
        XSSFSheet sheet = wb.getSheet("test");

        int FirstRow= sheet.getFirstRowNum();
        int LastRow= sheet.getLastRowNum();
        for (int i = FirstRow+1; i <= LastRow; i++)
        {
            XSSFRow row_r = sheet.getRow(i);
            XSSFCell cell_r = row_r.getCell(0);
            String value = cell_r.getStringCellValue().trim();
            System.out.println(value);

            driver.findElement(By.xpath("//input[@class='gLFyf']")).clear();
            driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys(value);
            driver.findElement(By.xpath("//button[@jsname='Tg7LZd']")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            List<WebElement> list = driver.findElements(By.xpath("//a[1]/h3[1]\n"));
            String firstgoogleheader = list.get(0).getText();
            excelPrint(filepath,firstgoogleheader,i,1);



        }



    }

    public static void excelPrint(String filepath, String value, int rowNumber, int cellNumber) throws IOException
    {
        FileInputStream inputStream = new FileInputStream(new File(filepath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(rowNumber);
        if (row == null)
            row = sheet.createRow(rowNumber);
        Cell cell = row.getCell(cellNumber);
        if (cell == null)
            cell = row.createCell(cellNumber);
        cell.setCellValue(value);

        FileOutputStream outputStream = new FileOutputStream(filepath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }

}
