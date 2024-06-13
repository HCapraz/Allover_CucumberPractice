package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pages.Pages;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;


public class US06_StepDefinition {

    Pages allPages = new Pages();

    @Given("login to site")
    public void loginToSite() {
        ReusableMethods.loginToSite();
    }

    @And("click to Searchbox")
    public void clickToSearchbox() {
        allPages.accountDetails().searchBox.click();
    }

    @And("enter a product name to Searchbox")
    public void enterAProductNameToSearchbox() {
        allPages.accountDetails().searchBox.sendKeys("Blue Ski Boots");
        allPages.accountDetails().searchBox.submit();
    }

    @Then("verify that the requested product is searched for")
    public void verifyThatTheRequestedProductIsSearchedFor() {
        assertTrue((allPages.accountDetails().searchResults.isDisplayed()));
    }


}
