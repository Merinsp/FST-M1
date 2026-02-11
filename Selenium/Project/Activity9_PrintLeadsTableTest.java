package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Config;

import java.util.List;

public class Activity9_PrintLeadsTableTest extends BaseTest {

    @Test
    public void printLeadsTable() {

        driver.get(Config.URL);

        driver.findElement(By.id("user_name")).sendKeys(Config.USERNAME);
        driver.findElement(By.id("username_password")).sendKeys(Config.PASSWORD);
        driver.findElement(By.id("bigbutton")).click();

        driver.findElement(By.xpath("//a[contains(text(),'SALES')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();

        List<WebElement> rows = driver.findElements(By.cssSelector("table.list.view.table-responsive tbody tr"));

        System.out.println("First 10 Lead Names and Users:");

        for (int i = 0; i < 10 && i < rows.size(); i++) {

            WebElement name = rows.get(i).findElement(By.cssSelector("td:nth-child(3) a"));
            WebElement user = rows.get(i).findElement(By.cssSelector("td:nth-child(8)"));

            System.out.println("Name: " + name.getText() + " | User: " + user.getText());
        }
    }
}
