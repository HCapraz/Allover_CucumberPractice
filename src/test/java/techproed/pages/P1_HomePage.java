package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class P1_HomePage {

    public ReusableMethods singInButton;

    public P1_HomePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    //--------------for US_09, US_10, ------------------------------------
    @FindBy(partialLinkText = "Sign In")
    public WebElement signInButton;

    @FindBy(xpath = "//a[@href='signup']")
    public WebElement singUpButton;

    @FindBy(xpath = "//div[.='Sign Out']")
    public WebElement signOutButton;

    @FindBy(partialLinkText = "My Account")
    public WebElement myAccountButton;

    @FindBy(xpath = "//span[.='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//a[.='Become a Vendor']")
    public WebElement becomeAVendorButton;

    @FindBy(xpath = "//h2[.='Vendor Registration']")
    public WebElement VendorRegistrationText;

    @FindBy(xpath = "//h3[.='MY ACCOUNT']")
    public WebElement myAccountText;

    @FindBy(xpath = "//span[.='Sign Out']")
    public WebElement signOut;

}