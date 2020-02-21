package TABLE;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;

public class HomeWork {

    WebDriver wd;

@Before
    public void settings() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    wd = new ChromeDriver();
    wd.get("https://www.toolsqa.com/automation-practice-form");
    wd.manage().window().maximize();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
//@Test
//    public void PartialLinkTest()throws InterruptedException{
//        String expectedPartialText = " Partial Link Test";
//        String actualText = wd.findElement(By.partialLinkText("Partial")).getText();
//        Thread.sleep(2000);
//        System.out.println(actualText);
//        Assert.assertEquals(expectedPartialText, actualText);
//
//    }
//    @Test
//    public void LinkTest () throws InterruptedException{
//    String expectedPartialText = "Link Test";
//    String actualTest = wd.findElement(By.linkText("Link Test")).getText();
//    Thread.sleep(2000);
//        System.out.println(actualTest);
//        Assert.assertEquals(expectedPartialText,actualTest);
//    }
//    @Test
//    public void FirstName () throws InterruptedException {
//        wd.findElement(By.name("firstname")).sendKeys("yogendra");
//        Thread.sleep(2000);
//
//        wd.findElement(By.id("lastname")).sendKeys("karki");
//        Thread.sleep(2000);
//
//        wd.findElement(By.xpath("//*[@id=\"sex-0\"]")).click();
//        Thread.sleep(2000);
//
//    }


//    @Test
//      public void YearsOfExperience() throws InterruptedException{
//       JavascriptExecutor js = (JavascriptExecutor) wd;
//        WebElement radio = wd.findElement(By.xpath("//*[@id=\"exp-4\"]"));
//        js.executeScript("window.scrollBy (0,1000)");
//        Actions actions = new Actions(wd);
//        actions.moveToElement(radio).click().build().perform();
//        Thread.sleep(2000);
//     }

@Test
public void Profession() throws InterruptedException {
    List<WebElement> elements = wd.findElements(By.xpath("//*[@name='profession']"));

}

    }



