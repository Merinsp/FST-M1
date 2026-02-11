package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Config;

public class Activity3_CopyrightTextTest extends BaseTest {

    @Test
    public void printCopyright() {
        driver.get(Config.URL);

        WebElement footerText = driver.findElement(By.cssSelector("div#footer"));
        System.out.println("Footer Text: " + footerText.getText());
    }
}
