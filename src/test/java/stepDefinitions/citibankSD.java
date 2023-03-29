package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import pages.citibankPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class citibankSD {
    citibankPages elements = new citibankPages();
    Faker faker = new Faker();

    @Given("user goes to Citibank homepage")
    public void user_goes_to_citibank_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("Citibank_Url"));
    }
    @Given("verify that Citibank homepage has been opened")
    public void verify_that_citibank_homepage_has_been_opened() {
        ReusableMethods.bekle(3);
        assertEquals(ConfigReader.getProperty("Citibank_homepage_title"),Driver.getDriver().getTitle());

    }
    @Given("user goes to login page by clicking CitiFX Pulse from Online Services")
    public void user_goes_to_login_page_by_clicking_citi_direct_from_online_services() {
        ReusableMethods.hover(elements.buttonOnlineHizmetler);
        ReusableMethods.bekle(2);
        elements.buttonCitiFX.click();
    }

    @Given("verify that CitiFX Pulse login page has been opened")
    public void verify_that_citi_direct_login_page_has_been_opened() {
        ReusableMethods.switchToWindow("CitiFX Pulse");
        ReusableMethods.bekle(2);
       // assertTrue(Driver.getDriver().getTitle().contains("CitiDirect ® Login"));
    }
    @Given("user enter user id")
    public void user_enter_user_id() {
        ReusableMethods.bekle(2);
        elements.userIdTxtBx.click();
        elements.userIdTxtBx.sendKeys(faker.name().username());
    }
    @Given("user clicks Continue button")
    public void user_clicks_log_in_button() {
        elements.buttonContinue.click();
    }
    @Given("user enter password")
    public void user_enter_password() {
        ReusableMethods.bekle(2);
        elements.passwordTxtBx.click();
        elements.passwordTxtBx.sendKeys(faker.internet().password());
    }

    @And("user click login button")
    public void userClickLoginButton() {
        elements.buttonContinue.click();
    }
    @Then("user verify that the {string} warning is displayed")
    public void user_verify_that_the_warning_is_displayed(String warning) {

        assertEquals(warning,elements.textError.getText());

    }

}
