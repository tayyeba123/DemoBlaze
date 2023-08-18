package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productpage {
    static String addtocart = "//a[text()='Add to cart']";

    static String cartButton  = "//a[text()='Cart']";

    public static void clickonaddtocart(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath(addtocart)).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

    }

    public static void clickonCartLink(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath(cartButton)).click();
        Thread.sleep(2000);


    }


}
