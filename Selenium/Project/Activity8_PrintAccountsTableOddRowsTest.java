package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Config;

import java.util.List;

public class Activity8_PrintAccountsTableOddRowsTest extends BaseTest {

    @Test
    public void printOddRowsAccounts() {

        driver.get(Config.URL);

        driver.findElement(By.id("user_name")).sendKeys(Config.USERNAME);
        driver.findElement(By.id("username_password")).sendKeys(Config.PASSWORD);
        driver.findElement(By.id("bigbutton")).click();

        driver.findElement(By.xpath("//a[contains(text(),'SALES')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();

        List<WebElement> rows = driver.findElements(By.cssSelector("table.list.view.table-responsive tbody tr"));

        System.out.println("First 5 Odd-numbered Account Names:");

        int printed = 0;
        for (int i = 0; i < rows.size(); i++) {

            if ((i + 1) % 2 != 0) {
                WebElement nameCell = rows.get(i).findElement(By.cssSelector("td:nth-child(3) a"));
                System.out.println(nameCell.getText());
                printed++;

                if (printed == 5) break;
            }
        }
    }
}
