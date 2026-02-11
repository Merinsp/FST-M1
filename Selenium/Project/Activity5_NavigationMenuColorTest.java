package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Config;

public class Activity5_NavigationMenuColorTest extends BaseTest {

    @Test
    public void getMenuColor() {

        driver.get(Config.URL);

        driver.findElement(By.id("user_name")).sendKeys(Config.USERNAME);
        driver.findElement(By.id("username_password")).sendKeys(Config.PASSWORD);
        driver.findElement(By.id("bigbutton")).click();

        WebElement navMenu = driver.findElement(By.id("toolbar"));
        String color = navMenu.getCssValue("background-color");

        System.out.println("Navigation Menu Background Color: " + color);
    }
}
