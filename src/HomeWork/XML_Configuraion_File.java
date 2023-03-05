package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class XML_Configuraion_File
{
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException
    {
        WebDriver driver = null;
        int NumOfBrowser =1;
        while (NumOfBrowser<=2)
        {
            driver = browser(driver, GetDataFromXML("browser"+NumOfBrowser));
            driver.manage().window().maximize();

            driver.get("https://www.d.co.il/");
            for (int i = 1; i <= 3; i++)
            {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                WebElement search = driver.findElement(By.id("query"));
                WebElement button = driver.findElement(By.xpath("//*[@id=\"homepage-search-input\"]/span/input[2]"));
                search.clear();
                search.sendKeys(GetDataFromXML("category"+i));
                button.click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                try {
                    driver.findElement(By.className("skip")).click();
                } catch (Exception e) {
                    // TODO: handle exception
                }
                System.out.println(driver.getTitle() + " : "+ GetDataFromXML("browser"+NumOfBrowser));
                driver.navigate().back();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            }
            driver.close();
            NumOfBrowser++;
        }
    }

    public static String GetDataFromXML(String nodeName) throws ParserConfigurationException, SAXException, IOException
    {
        File fXmlFile = new File("C:\\Users\\sarit_2\\Downloads\\configurtion.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(nodeName).item(0).getTextContent();
    }

    public static WebDriver browser(WebDriver driver, String browser_name)
    {
        if(browser_name.equals("chrome"))
            driver = new ChromeDriver();
        if(browser_name.equals("firefox"))
            driver = new FirefoxDriver();
        return  driver;
    }
}