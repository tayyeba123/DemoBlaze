package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartpage {
    static String purchasebutton = "//button[text()='Place Order']";


    public static void clickonPurchase(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath(purchasebutton)).click();
        Thread.sleep(2000);

    }


}

