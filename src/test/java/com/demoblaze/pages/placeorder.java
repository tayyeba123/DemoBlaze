package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class placeorder {

    static String name = "//input[@id='name']";
    static String country= "//input[@id='country']";
    static String city = "//input[@id='city']";
    static String creditcard = "//input[@id='card']";
    static String month = "//input[@id='month']";
    static String year = "//input[@id='year']";
    static String purchaseButton = "//button[@class='btn btn-primary' and text()='Purchase']";

    static String thankyouMessage = "//h2[text()='Thank you for your purchase!']";




    public static void enterpurchasedetails(WebDriver driver,String nameinput, String CountryInput, String cityInput) throws InterruptedException {


        driver.findElement(By.xpath(name)).sendKeys(nameinput);
        driver.findElement(By.xpath(country)).sendKeys(CountryInput);
        driver.findElement(By.xpath(city)).sendKeys(cityInput);
        Thread.sleep(2000);

    }

    public static void enterCardDetails(WebDriver driver,String cardInput, String monthInput, String yearInput) throws InterruptedException {


        driver.findElement(By.xpath(creditcard)).sendKeys(cardInput);
        driver.findElement(By.xpath(month)).sendKeys(monthInput);
        driver.findElement(By.xpath(year)).sendKeys(yearInput);
        driver.findElement(By.xpath(purchaseButton)).click();
        Thread.sleep(2000);

    }

    public static void verifyconfirmationmessage(WebDriver driver,String confirmationMessage){
        String text = driver.findElement(By.xpath(thankyouMessage)).getText();
        Assert.assertEquals(text.toUpperCase().trim(),confirmationMessage.toUpperCase().trim(),"Confirmation message is displayed correctly");

    }



}
