package HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class robot
{
    public static void main(String[] args) throws AWTException
    {
        WebDriver driver = new ChromeDriver();
        Robot robot = new Robot();
        driver.manage().window().maximize();
        String text = "hackerU";
        driver.get("https://www.google.com/");

        for (int i = 0 ; i < text.length (); i ++)
        {
            char c = text.charAt(i);
            if (Character.isUpperCase(c))
                robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(Character.toUpperCase(c));
            robot.keyRelease(Character.toUpperCase(c));
            if (Character.isUpperCase(c))
                robot.keyRelease(KeyEvent.VK_SHIFT);
        }
        //לוחץ על חיפוש
        robot.delay(2000);
        robot.mouseMove(1000,900);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //לוחץ על תמונות
        robot.delay(2000);
        robot.mouseMove(1600,220);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //קליק ימני על תמונה
        robot.delay(6000);
        robot.mouseMove(1600,400);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        //בוחר העתקה מהרשימה נפתחת
        for (int i = 0; i < 5; i++)
        {
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_UP);
            robot.keyRelease(KeyEvent.VK_UP);
            robot.delay(200);

        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        //שמירת קובץ בשם
        robot.delay(4000);
        String file_name = "Robottest";
        for (int i = 0 ; i < file_name.length (); i ++) {
            char c = file_name.charAt(i);
//            if (c == '_')
//            {
//                robot.keyPress(KeyEvent.VK_UNDERSCORE);
//                robot.keyRelease(KeyEvent.VK_UNDERSCORE);
//                continue;
//            }
            if (Character.isUpperCase(c))
                robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(Character.toUpperCase(c));
            robot.keyRelease(Character.toUpperCase(c));
            if (Character.isUpperCase(c))
                robot.keyRelease(KeyEvent.VK_SHIFT);
        }
        robot.delay(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }
}
