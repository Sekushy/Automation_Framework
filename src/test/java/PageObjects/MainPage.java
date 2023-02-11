package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnSubmitButton() {
        this.submitButton.click();
    }

    public void writeEmailToEmailField(String email){
        this.emailField.sendKeys(email);
    }
}
