package com.demoblaze.pages;

import com.demoblaze.utilities.ExcelReader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class LoginPage {
    static String userName = "//input[@id='loginusername']";
    static String password = "//input[@id='loginpassword']";

    static String loginButton = "//button[@class='btn btn-primary' and text()='Log in']";

    static String loginlink=  "//a[@id='login2']";





    public static void login(WebDriver driver,int rownumber) throws InterruptedException, IOException, InvalidFormatException {

        ExcelReader reader = new ExcelReader();

        String Excelpath = "src/test/resources/TestData/Login.xlsx";
        String sheetname = "Sheet1";

        List<Map<String, String>> testdata = reader.getData(Excelpath, sheetname);

        String usernameInput = testdata.get(rownumber).get("username");

        String passwordInput = testdata.get(rownumber).get("password");







        driver.findElement(By.xpath(loginlink)).click();

        Thread.sleep(1000);

        WebElement element = driver.findElement(By.xpath(userName));

        String js = "arguments[0].setAttribute('value','"+usernameInput+"')";
        ((JavascriptExecutor) driver).executeScript(js, element);

        WebElement passwordEle = driver.findElement(By.xpath(password));


        String pass = "arguments[0].setAttribute('value','"+passwordInput+"')";
        ((JavascriptExecutor) driver).executeScript(pass, passwordEle);






        driver.findElement(By.xpath(loginButton)).click();

        Thread.sleep(2000);

    }

    public static void login(WebDriver driver,String usernameInput, String passwordInput) throws InterruptedException, IOException, InvalidFormatException {

        driver.findElement(By.xpath(loginlink)).click();

        Thread.sleep(1000);

        WebElement element = driver.findElement(By.xpath(userName));

        String js = "arguments[0].setAttribute('value','"+usernameInput+"')";
        ((JavascriptExecutor) driver).executeScript(js, element);

        WebElement passwordEle = driver.findElement(By.xpath(password));


        String pass = "arguments[0].setAttribute('value','"+passwordInput+"')";
        ((JavascriptExecutor) driver).executeScript(pass, passwordEle);






        driver.findElement(By.xpath(loginButton)).click();

        Thread.sleep(2000);

    }


}
