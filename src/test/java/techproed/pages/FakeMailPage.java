package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class FakeMailPage {
    public FakeMailPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(xpath = "//a[@title='Refresh mailbox']")
    public WebElement refresh;


    @FindBy(xpath = "//*[contains(text(), 'Email Verification Code')]")
    public WebElement verificationCodeText;

}
