package com.trend.pages;

import com.trend.commonfunctions.CommonMethods;
import org.openqa.selenium.WebDriver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ProductPage extends CommonMethods {

    WebDriver driver;
    double fark;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public void priceCompare() throws InterruptedException {
        scroll(driver,"css selector",product);
        clickButton(driver,"css selector",product);

        String eskiFiyat = getText(driver,"id",eski);
        String yeniFiyat = getText(driver,"id",yeni);

        System.out.println("Eski fiyat: "+ eskiFiyat);
        System.out.println("Yeni fiyat: "+yeniFiyat);

        double yeni = convert(yeniFiyat);
        double eski = convert(eskiFiyat);

        fark = eski - yeni;
    }

    public void writeProductText(){
        File file = new File("./TestData/productText.txt");
        try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
            br.write("product fark: "+ fark);
        } catch (IOException e) {
            System.out.println("Unable to read file " +file.toString());
        }
    }
}
