package com.demoblaze.definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.demoblaze.pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class demoBlazeDefinitions {

    private static WebDriver driver;
    public final static int TIMEOUT = 10;

    @Before
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();

        ops.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(ops);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
    }

    @When("launch the demoblaze website")
    public void launchTheDemoblazeWebsite() {

        driver.get("https://www.demoblaze.com/");

    }

//    @Test
//    @When("User enters username as {string} and password as {string} and signup")
//    public void userEntersUsernameAsAndPasswordAsAndSignup(String arg0, String arg1) throws InterruptedException {
//
//        signuppage.signUp(driver, arg0, arg1);
//
//    }


    @After
    public void tearDown() {
        driver.quit();
    }

    @When("User enters username as {string} and password as {string} and login")
    public void userEntersUsernameAsAndPasswordAsAndLogin(String arg0,String arg1) throws InterruptedException, IOException, InvalidFormatException {

        LoginPage.login(driver, arg0,arg1);

    }

    @Then("user click on the product")
    public void userClickOnTheProduct() throws InterruptedException {
        homepage.clickonproduct(driver);
    }

    @Then("click on the add to cart button")
    public void clickOnTheAddToCartButton() throws InterruptedException {
        productpage.clickonaddtocart(driver);
    }


    @Then("click on the purchase button")
    public void clickOnThePurchaseButton() throws InterruptedException {
        cartpage.clickonPurchase(driver);
    }

    @Then("click on cart link")
    public void clickOnCartLink() throws InterruptedException {

        productpage.clickonCartLink(driver);
    }



    @Then("enter credit card details as a {string} and month as a {string} and year as a {string}")
    public void enterCreditCardDetailsAsAAndMonthAsAAndYearAsA(String arg0, String arg1, String arg2) throws InterruptedException {
        placeorder.enterCardDetails(driver,arg0,arg1,arg2);
    }

    @Then("click on purchase button")
    public void clickOnPurchaseButton() {

    }



    @Then("verify order placed successfully")
    public void verifyOrderPlacedSuccessfully() {


    }

    @Then("enter name as a {string} and country as a {string} and city as {string}")
    public void enterNameAsAAndCountryAsAAndCityAs(String arg0, String arg1, String arg2) throws InterruptedException {
        placeorder.enterpurchasedetails(driver,arg0,arg1,arg2);
    }

    @Then("verify order placed successfully with the message {string}")
    public void verifyOrderPlacedSuccessfullyWithTheMessage(String arg0) {
        placeorder.verifyconfirmationmessage(driver,arg0);
    }

    @When("User enters username and password from excel row number {int}")
    public void userEntersUsernameAndPasswordFromExcelRowNumber(int arg0) throws IOException, InterruptedException, InvalidFormatException {
        LoginPage.login(driver,arg0);
    }

    @When("User signup with username and password from excel row number {int}")
    public void userSignupWithUsernameAndPasswordFromExcelRowNumber(int arg0) throws InterruptedException, IOException, InvalidFormatException {
        signuppage.signUp(driver,arg0);
    }
}