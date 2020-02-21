package code._1OpenBrowser;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class OpenBrowser {
//    @Test
//    public void openChromeBrowser() throws InterruptedException {
//        //set Chrome Browser Driver
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        WebDriver wd = new ChromeDriver();
//        wd.get(" http://www.gmail.com");
//        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//
//        wd.manage().window().maximize();
//
//        wd.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("yogendrakarki2005@gmail.com");
//        wd.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
//        wd.findElement(By.name("password")).sendKeys("pokhara2044");
//        wd.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
//        Thread.sleep(5000);
//        wd.quit();



//
//    //@ Test
//
//        public void openFirefoxBrowser () throws InterruptedException {
//
//            System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
//
//            WebDriver wd = new FirefoxDriver();
//
//            wd.get (" http://www.gmail.com");
//            // Send email address
//
//
//            // Maximize Browser
//            wd.manage().window().maximize();
//            //wait for 5 sec
//            Thread.sleep (5000);
//            //close Browser
//            wd.quit();
//
//        }



//   @Test
//    public void openChromeBrowser() throws InterruptedException {
//        //set Chrome Browser Driver
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        WebDriver wd = new ChromeDriver();
//        wd.get(" http://www.gmail.com");
//        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//
//        wd.manage().window().maximize();
//
//        wd.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("qatesting00567@gmail.com");
//        wd.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
//        Thread.sleep(3000);
//        wd.findElement(By.name("password")).sendKeys("Test@123");
//        wd.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
//        Thread.sleep(5000);
//        wd.quit();
//    }
//}

@Test
public void InvalidPassword() throws InterruptedException {
        //set Chrome Browser Driver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get(" http://www.gmail.com");
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        wd.manage().window().maximize();

        wd.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("qatesting00567@gmail.com");
        wd.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
        Thread.sleep(3000);
        wd.findElement(By.name("password")).sendKeys("Test@12");
        Thread.sleep(3000);

        wd.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
        Thread.sleep(5000);
        WebElement text= wd.findElement(By.xpath("//*[text()='Wrong password. Try again or click Forgot password to reset it.']"));
        String expectedtext= "Wrong password. Try again or click Forgot password to reset it.";

    Assert.assertEquals(expectedtext,text.getText());
        wd.quit();
    }
}


