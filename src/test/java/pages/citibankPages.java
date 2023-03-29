package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class citibankPages {
    public citibankPages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Online Hizmetler']")
    public WebElement buttonOnlineHizmetler;

    @FindBy(xpath = "//*[text()=' CitiFX Pulse ']")
    public WebElement buttonCitiFX;

    @FindBy(xpath = "//h2[@id='welcomeTo']")
    public WebElement textWelcometo;
    @FindBy(xpath="//input[@title='User ID']")
    public WebElement userIdTxtBx;

    @FindBy(xpath = "//button[@id='login-button']")
    public WebElement buttonContinue;

    @FindBy(xpath = "//input[@title='SSO Password']")
    public WebElement passwordTxtBx;
    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement buttonPasswordOturumAc;

    @FindBy(xpath = "//*[@id='validation-error']")
    public WebElement textError;
}
