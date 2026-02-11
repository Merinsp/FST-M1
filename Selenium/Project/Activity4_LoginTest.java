package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Config;

public class Activity4_LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        driver.get(Config.URL);

        driver.findElement(By.id("user_name")).sendKeys(Config.USERNAME);
        driver.findElement(By.id("username_password")).sendKeys(Config.PASSWORD);
        driver.findElement(By.id("bigbutton")).click();

        String title = driver.getTitle();
        System.out.println("Home Page Title After Login: " + title);

        Assert.assertTrue(title.contains("SuiteCRM"), "Login failed or homepage not loaded!");
    }
}
