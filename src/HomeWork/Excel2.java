package HomeWork;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlgraphics.image.codec.util.SeekableOutputStream;
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

public class Excel2
{
    static String filepath = "C:\\Users\\sarit_2\\Desktop\\Automation\\Selenium\\Excel\\excel_test.xlsx";

    public static void main(String[] args) throws IOException
    {
        WebDriver driver = new ChromeDriver();

        //CASE-1
        driver.get("http://danielauto.net/practice/loginPage/loginpageTest.html");

        FileInputStream fis = new FileInputStream (filepath);
        XSSFWorkbook wb = new XSSFWorkbook (fis);
        XSSFSheet sheet = wb.getSheet("tar2");

        String USER = "admin",PASSWORD = "12345";
        driver.findElement(By.id("uaertName")).sendKeys(USER);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        driver.findElement(By.id("send")).click();
        String ACTUAL_RESULT = "";
        try
        {
            String EXPECTED_RESULT = driver.findElement(By.id("err")).getText();
            if(EXPECTED_RESULT.equals("You have entered incorrect details"))
            {
                ACTUAL_RESULT = "TEST_PASS";
                excelPrint(filepath,ACTUAL_RESULT,1,2);
            }
        }
        catch (Exception e)
        {
            System.out.println("CASE-1 Exception-FAIL");
            ACTUAL_RESULT = "TEST_FAIL";
            excelPrint(filepath,ACTUAL_RESULT,1,2);
        }
        //CASE-2
        driver.get("http://danielauto.net/practice/loginPage/loginpageTest.html");

        fis = new FileInputStream (filepath);
        wb = new XSSFWorkbook (fis);
        sheet = wb.getSheet("tar2");

        USER = "admin";
        PASSWORD = "pass";
        driver.findElement(By.id("uaertName")).sendKeys(USER);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        driver.findElement(By.id("send")).click();
        ACTUAL_RESULT = "";

        try
        {
            String EXPECTED_RESULT = driver.findElement(By.id("err")).getText();
            if(EXPECTED_RESULT.equals("You have entered incorrect details"))
            {
                ACTUAL_RESULT = "TEST_PASS";
                excelPrint(filepath,ACTUAL_RESULT,2,2);
            }
        }
        catch (Exception e)
        {
            System.out.println("CASE-2 Exception-FAIL");
            ACTUAL_RESULT = "TEST_FAIL";
            excelPrint(filepath,ACTUAL_RESULT,2,2);
        }
        //CASE-3
        driver.get("http://danielauto.net/practice/loginPage/loginpageTest.html");

        fis = new FileInputStream (filepath);
        wb = new XSSFWorkbook (fis);
        sheet = wb.getSheet("tar2");

        USER = "admin";
        PASSWORD = "";
        driver.findElement(By.id("uaertName")).sendKeys(USER);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        driver.findElement(By.id("send")).click();
        ACTUAL_RESULT = "";

        try
        {
            String EXPECTED_RESULT = driver.findElement(By.id("err")).getText();
            if(EXPECTED_RESULT.equals("You have entered incorrect details"))
            {
                ACTUAL_RESULT = "TEST_PASS";
                excelPrint(filepath,ACTUAL_RESULT,3,2);
            }
        }
        catch (Exception e)
        {
            System.out.println("CASE-4 Exception-FAIL");
            ACTUAL_RESULT = "TEST_FAIL";
            excelPrint(filepath,ACTUAL_RESULT,3,2);
        }
        //CASE-4
        driver.get("http://danielauto.net/practice/loginPage/loginpageTest.html");

        fis = new FileInputStream (filepath);
        wb = new XSSFWorkbook (fis);
        sheet = wb.getSheet("tar2");

        USER = "admin";
        PASSWORD = "admin";
        driver.findElement(By.id("uaertName")).sendKeys(USER);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        driver.findElement(By.id("send")).click();
        ACTUAL_RESULT = "";

        try
        {
            String EXPECTED_RESULT = driver.findElement(By.tagName("h1")).getText();
            if(EXPECTED_RESULT.equals("You've logged in successfully"))
            {
                ACTUAL_RESULT = "TEST_PASS";
                excelPrint(filepath,ACTUAL_RESULT,4,2);
            }
        }
        catch (Exception e)
        {
            System.out.println("CASE-4 Exception-FAIL");
            ACTUAL_RESULT = "TEST_FAIL";
            excelPrint(filepath,ACTUAL_RESULT,4,2);
        }
        driver.close();


    }

    public static void excelPrint(String filepath, String value, int rowNumber, int cellNumber) throws IOException
    {
        FileInputStream inputStream = new FileInputStream(new File(filepath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(1);
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
