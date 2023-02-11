package org.example;

import PageObjects.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StepDefinitions {

    private final WebDriver driver = new ChromeDriver();
    private MainPage mainPage;

    public StepDefinitions() {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
    }

    @Given("I am on the main page")
    public void iAmOnTheMainPage() {
        driver.get("file:///Users/andraghici/Documents/Azimut_Vision/Testing-Env/index.html");
    }

    @When("I write the email address of {string}")
    public void i_write_the_email_address_of(String string) {
        mainPage.writeEmailToEmailField(string);
    }
    @When("I click the submit button")
    public void i_click_the_submit_button() {
        mainPage.clickOnSubmitButton();
    }

    @After
    public void cleanUp() {
        driver.quit();
    }





}
