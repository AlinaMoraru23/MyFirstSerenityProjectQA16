package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://fasttrackit.org/selenium-test/customer/account/create/")
public class RegisterPage extends PageObject {

    @FindBy(id = "firstname")
    private WebElementFacade firstNameField;

    @FindBy(id = "lastname")
    private WebElementFacade lastNameFiels;

    @FindBy(id = "email_address")
    private WebElementFacade emailAddressField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmPasswordField;

    @FindBy(css = ".button[title='Register']")
    private WebElementFacade registerButton;

    @FindBy(css = ".error-msg span")
    private WebElementFacade errorMessageSpan;



    public void setFirstNameField(String fistName) {
        typeInto(firstNameField, fistName);
    }

    public void setLastNameField(String lastName){
        typeInto(lastNameFiels, lastName);
    }

    public void setEmailAddressField(String email){
        typeInto(emailAddressField, email);
    }

    public void setPasswordField(String password){
        typeInto(passwordField, password);
    }

    public void setConfirmPasswordField(String confirmPassword){
        typeInto(confirmPasswordField,confirmPassword);
    }

    public void clickRegisterButton(){
        clickOn(registerButton);
    }

    public void verifyUserAlreadyTaken() {
        errorMessageSpan.shouldContainText("There is already an account with this email address");
    }

}








