package TABLE;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Marks {
    WebDriver wd;
    @Test

    public void OpenBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get(" https://www.w3schools.com/sql/sql_count_avg_sum.asp");
        Thread.sleep(2000);
        wd.manage().window().maximize();
        Thread.sleep(2000);

        double sum = 0.00;
        double expectedSum = 91.35;

        List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[6]"));
        for (WebElement row : rows) {
            double no = Double.parseDouble(row.getText());
            sum = sum + no;
        }
        Thread.sleep(3000);
        Assert.assertEquals(sum, expectedSum, 2);
        wd.quit();


    }

//    @After
//
//    public void exit() {
//        wd.quit();
//
//}
}