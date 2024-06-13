package techproed.pages;

import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class P3_LoginPage {

    public P3_LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}