package TABLE;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.*;


public class ProductName {

    WebDriver wd;
    @Before

    public void openChromeBrowser () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        wd = new ChromeDriver();
        wd.get(" https://www.w3schools.com/sql/sql_count_avg_sum.asp");
        wd.manage().window().maximize();
        Thread.sleep(3000);


    }
    @Test
    public void ProductNameList() throws InterruptedException {
        String[] expectedPdtName = {"Chais", "Chang", "Aniseed Syrup", "Chef Anton's Cajun Seasoning", "Chef Anton's Gumbo Mix"};
        List<WebElement> Rows = wd.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[2]"));
        ArrayList<String> name = new ArrayList<>();
        for (int i= 0; i< Rows.size(); i++) {
            String listText = Rows.get(i).getText();
            name.add(listText);
            System.out.println(listText);
        }
        Assert.assertArrayEquals(expectedPdtName, name.toArray());

    }
    @After
    public void exit() {
        wd.quit();
    }


}
