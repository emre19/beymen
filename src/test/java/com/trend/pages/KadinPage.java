package com.trend.pages;

import com.trend.commonfunctions.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class KadinPage extends CommonMethods {

    WebDriver driver;

    public KadinPage(WebDriver driver){
        this.driver = driver;
    }

    public void urlControl(String url) throws InterruptedException {
        moveToElement(driver,kadin);
        clickButton(driver,"css selector",giyim);
        String CurrentUrl = driver.getCurrentUrl();
        Assert.assertTrue(CurrentUrl.contains(url));
    }
}
