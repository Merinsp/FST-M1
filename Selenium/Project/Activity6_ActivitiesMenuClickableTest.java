package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Config;

public class Activity6_ActivitiesMenuClickableTest extends BaseTest {

    @Test
    public void checkActivitiesMenu() {

        driver.get(Config.URL);

        driver.findElement(By.id("user_name")).sendKeys(Config.USERNAME);
        driver.findElement(By.id("username_password")).sendKeys(Config.PASSWORD);
        driver.findElement(By.id("bigbutton")).click();

        WebElement activitiesMenu = driver.findElement(By.xpath("//a[contains(text(),'ACTIVITIES')]"));

        Assert.assertTrue(activitiesMenu.isDisplayed(), "Activities menu not displayed!");
        Assert.assertTrue(activitiesMenu.isEnabled(), "Activities menu not clickable!");

        System.out.println("Activities menu exists and is clickable.");
    }
}
