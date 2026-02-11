package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Config;

public class Activity2_HeaderImageUrlTest extends BaseTest {

    @Test
    public void printHeaderImageUrl() {
        driver.get(Config.URL);

        WebElement headerImg = driver.findElement(By.cssSelector("img[alt='SuiteCRM']"));
        String imgUrl = headerImg.getAttribute("src");

        System.out.println("Header Image URL: " + imgUrl);
    }
}
