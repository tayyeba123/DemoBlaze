package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
        static String product = "//a[text()='Samsung galaxy s6']";



        public static void clickonproduct(WebDriver driver) throws InterruptedException {

            driver.findElement(By.xpath(product)).click();
            Thread.sleep(2000);

        }


}
