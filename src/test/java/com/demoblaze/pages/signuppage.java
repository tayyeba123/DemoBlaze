package com.demoblaze.pages;

import com.demoblaze.utilities.ExcelReader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class signuppage {
    static String userName = "//input[@id='sign-username']";
    static String password = "//input[@id='sign-password']";

    static String singupButton = "//button[@class='btn btn-primary' and text()='Sign up']";

    static String signuplink=  "//a[@id='signin2']";





    public static void signUp(WebDriver driver,int rowno) throws InterruptedException, IOException, InvalidFormatException {

        ExcelReader reader = new ExcelReader();

        String Excelpath = "src/test/resources/TestData/Login.xlsx";
        String sheetname = "Sheet1";

        List<Map<String, String>> testdata = reader.getData(Excelpath, sheetname);

        String usernameInput = testdata.get(rowno).get("username");

        String passwordInput = testdata.get(rowno).get("password");

        driver.findElement(By.xpath(signuplink)).click();

        Thread.sleep(1000);

        WebElement element = driver.findElement(By.xpath(userName));

//        Actions act= new Actions(driver);
////        JavascriptExecutor executor = (JavascriptExecutor)driver;
////        executor.executeScript("arguments[0].click();", element);
//        Action action  = act.click().build();
//
//                action.perform();

        String inputText = "tayyeba";
        String js = "arguments[0].setAttribute('value','"+usernameInput+"')";
        ((JavascriptExecutor) driver).executeScript(js, element);

         WebElement passwordEle = driver.findElement(By.xpath(password));


        String pass = "arguments[0].setAttribute('value','"+passwordInput+"')";
        ((JavascriptExecutor) driver).executeScript(pass, passwordEle);






        driver.findElement(By.xpath(singupButton)).click();

        Thread.sleep(5000);

    }
}

