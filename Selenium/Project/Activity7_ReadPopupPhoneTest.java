package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Config;

public class Activity7_ReadPopupPhoneTest extends BaseTest {

    @Test
    public void readPopupPhoneNumber() throws InterruptedException {

        driver.get(Config.URL);

        driver.findElement(By.id("user_name")).sendKeys(Config.USERNAME);
        driver.findElement(By.id("username_password")).sendKeys(Config.PASSWORD);
        driver.findElement(By.id("bigbutton")).click();

        driver.findElement(By.xpath("//a[contains(text(),'SALES')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();

        WebElement infoIcon = driver.findElement(By.cssSelector("span.suitepicon-action-info"));
        infoIcon.click();

        Thread.sleep(2000);

        WebElement popup = driver.findElement(By.cssSelector("div.ui-dialog-content"));
        System.out.println("Popup Content:\n" + popup.getText());
    }
}
