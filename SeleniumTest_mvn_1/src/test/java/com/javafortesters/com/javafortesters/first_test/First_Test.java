package com.javafortesters.com.javafortesters.first_test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by alexandru.brad on 4/26/2016.
 */
public class First_Test {

    @Test
    public void startWebDriver(){
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://seleniumsimplified.com/");
        Assert.assertTrue("title should start with Selenium Simplified",
                driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
        driver.quit();
    }
}
