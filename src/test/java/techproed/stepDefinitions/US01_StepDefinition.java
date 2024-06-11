package techproed.stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import techproed.pages.P2_RegisterPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import static techproed.utilities.ReusableMethods.*;

public class US01_StepDefinition {
    P2_RegisterPage registerPage = new P2_RegisterPage();

    @Given("go to Url")
    public void goToUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
    }

    @When("click on the Register link")
    public void clickOnTheRegisterLink() {
        registerPage.register.click();
    }

    @And("enter a data in the Username input")
    public void enterADataInTheUsernameInput() {
        registerPage.userName.sendKeys(ConfigReader.getProperty("privateUserName"));
    }

    @And("enter a data in the Your Email address input")
    public void enterADataInTheYourEmailAddressInput() {
        registerPage.emailAddress.sendKeys(ConfigReader.getProperty("registeredEmail"));
    }

    @And("enter a data in the password input")
    public void enterADataInThePasswordInput() {
        registerPage.password.sendKeys(ConfigReader.getProperty("registeredPassword"));
    }

    @And("select {string} box")
    public void selectBox(String arg0) {
        registerPage.privacyPolicy.click();
    }

    @And("click to Sign Up box")
    public void clickToSignUpBox() {
        registerPage.submitButton.click();
    }

    @Then("verify that the homepage opens and the Sign Out link appears")
    public void verifyThatTheHomepageOpensAndTheSignOutLinkAppears() {
        Assert.assertTrue(registerPage.signOut.isDisplayed());
    }

    @But("wait {int} seconds")
    public void waitSeconds(int time) {
        visibleWait(registerPage.signOut, time);

    }
}
