package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class P2_RegisterPage {

    public P2_RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[.='Register']")
    public WebElement register;

    @FindBy(id = "reg_username")
    public WebElement userName;

    @FindBy(id = "reg_email")
    public WebElement emailAddress;

    @FindBy(id = "reg_password")
    public WebElement password;

    @FindBy(id = "register-policy")
    public WebElement privacyPolicy;

    @FindBy(xpath = "//button[@name='register']")
    public WebElement submitButton;

    @FindBy(xpath = "(//*[.='Sign Out'])[1]")
    public WebElement signOut;

    @FindBy(xpath = "//*[.='Please enter a valid account username.']")
    public WebElement resultMessage;

    @FindBy(linkText = "Become a Vendor")
    public WebElement becomeAVendorLink;

    @FindBy(xpath = "//a[text()='Log out']")
    public WebElement logout;

    @FindBy(xpath = "(//p[@class='submit-status'])[2]")
    public WebElement plsLogInMsg;

    @FindBy(xpath = "//p[.='An account is already registered with that username. Please choose another.']")
    public WebElement plsChooseAnotherMsg;

    @FindBy(xpath = "//a[@class='live-chat']")
    public WebElement mailOfSite;




}