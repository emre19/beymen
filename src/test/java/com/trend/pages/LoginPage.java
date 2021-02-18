package com.trend.pages;

import com.trend.commonfunctions.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends CommonMethods {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void HomePageControl(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Beymen.com – Lifestyle Destination");
    }
}
