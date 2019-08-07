package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://fasttrackit.org/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = "a[href*='customer/account'] .label")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;


    @FindBy(css = "a[title='Register']")
    private WebElementFacade registerLink;



    public void clickAccount(){
        clickOn(accountLink);
    }

    public void clickLoginLink(){
        clickOn(loginLink);
    }

    public void clickRegisterLink(){
        clickOn(registerLink);
    }

}
