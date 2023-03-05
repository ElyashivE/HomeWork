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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Excel3
{
    static String filepath = "C:\\Users\\sarit_2\\Desktop\\Automation\\Selenium\\Excel\\excel_test.xlsx";

    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.b144.co.il/indexes/clients/%d7%90/");

        FileInputStream fis = new FileInputStream (filepath);
        XSSFWorkbook wb = new XSSFWorkbook (fis);
        XSSFSheet sheet = wb.getSheet("tar3");


        List<WebElement> LETTER_LIST = driver.findElements(By.xpath("//a[contains(@id,'_LnkLetter')]"));
        for (int j = 0; j < LETTER_LIST.size(); j++)
        {
            //System.out.println(LETTER_LIST.get(j).getText());
            excelPrint(filepath,LETTER_LIST.get(j).getText(),0,j);
        }
        for (int j = 0; j < LETTER_LIST.size(); j++)
        {
            LETTER_LIST.get(j).click();
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            //Thread.sleep(5000);

            List<WebElement> BUSINESS_OF_LETTER_LIST = driver.findElements(By.xpath("//div[@class='fields-index-con cat-items']//li"));
            for (int i = 0; i < 10; i++)
            {
                //System.out.println(BUSINESS_OF_LETTER_LIST.get(i).getText());
                excelPrint(filepath,BUSINESS_OF_LETTER_LIST.get(i).getText(),(i+1),j);
            }
        }







        driver.close();
    }

    public static void excelPrint(String filepath, String value, int rowNumber, int cellNumber) throws IOException
    {
        FileInputStream inputStream = new FileInputStream(new File(filepath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(2);
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
