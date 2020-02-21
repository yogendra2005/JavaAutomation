package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class facebooklogin {
    public static void main (String[] args){
        WebDriver driver  = new ChromeDriver ();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("yourUsername");
        driver.findElement(By.id("pass")).sendKeys("yourPassword");
        driver.findElement(By.id("u_0_b")).click();


    }

}
