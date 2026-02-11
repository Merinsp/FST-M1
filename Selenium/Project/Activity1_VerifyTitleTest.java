package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Config;

public class Activity1_VerifyTitleTest extends BaseTest {

    @Test
    public void verifyTitle() {
        driver.get(Config.URL);

        String actualTitle = driver.getTitle();
        System.out.println("Website Title: " + actualTitle);

        Assert.assertEquals(actualTitle, "SuiteCRM", "Title does not match!");
    }
}
