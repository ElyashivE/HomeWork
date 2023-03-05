package HomeWork;

import com.paulhammant.ngwebdriver.ByAngular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Angular
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://myhealth.stanfordhealthcare.org/#/");
        driver.findElement(ByAngular.model("id")).sendKeys("elya");
        driver.findElement(ByAngular.model("password")).sendKeys("12345678");
        driver.findElement(ByAngular.buttonText("Sign In")).click();
    }
}
