//package com.javafortesters.GoodBadNonFunctional;
//
//import org.junit.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
///**
// * Created by alexandru.brad on 4/27/2016.
// */
//public class GoodBad {
//
//    @Test
//    public void checkTitleCorrectOnApp(){
//        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("http://192.123.0.3:67");
//        assertEquals("Title should match",
//                "Test App", driver.getTitle());
//    }
//
//    @Test
//    public void checkTitleCorrectOnAppWithDomainObject(){
//        FirefoxDriver driver = new FirefoxDriver();
//        driver.get(TestAppEnv.getUrl());
//        assertEquals("Title should match",
//                "Test App", driver.getTitle());
//    }
//}
