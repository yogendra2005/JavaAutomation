package OpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class RunBrowser {
    public static void main (String [] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver ();
        driver .get ("https://login.yahoo.com/");
        driver.findElement(By.xpath(" //*[@id=\"login-username\"]")).sendKeys("yogendrakarki2005@yahoo.com");
        Thread.sleep (1000);
        driver.findElement(By.xpath("//[@id='login-signin']")).click();



    }
}
