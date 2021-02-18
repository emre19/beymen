package com.trend.testcases;

import com.trend.pages.BaseClass;
import com.trend.pages.KadinPage;
import com.trend.pages.LoginPage;
import com.trend.pages.ProductPage;
import org.testng.annotations.Test;


public class LoginTest extends BaseClass {

    @Test
    public void loginApp() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        logger.info("HomePage succes control");
        loginPage.HomePageControl();

        KadinPage kadinPage = new KadinPage(driver);
        logger.info("KadinPage kadin-giyim click");
        kadinPage.urlControl("kadin-giyim");

        ProductPage productPage = new ProductPage(driver);
        logger.info("ProductPage price compare");
        productPage.priceCompare();
        logger.info("ProductPage price write text");
        productPage.writeProductText();

    }
}
