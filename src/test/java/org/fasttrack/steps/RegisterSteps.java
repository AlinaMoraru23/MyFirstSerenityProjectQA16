package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.HomePage;
import org.fasttrack.pages.RegisterPage;

public class RegisterSteps {


    private HomePage homePage;
    private RegisterPage registerPage;

    @Step
    public void navigateToRegisterPage() {
        homePage.open();
        homePage.clickAccount();
        homePage.clickRegisterLink();

    }

    @Step
    public void performRegister(String firstName, String lastName, String email, String password, String confirmPassword){
        registerPage.setFirstNameField(firstName);
        registerPage.setLastNameField(lastName);
        registerPage.setEmailAddressField(email);
        registerPage.setPasswordField(password);
        registerPage.setConfirmPasswordField(confirmPassword);
        registerPage.clickRegisterButton();
    }

    @Step
    public void checkUserAlreadyTaken(){
        registerPage.verifyUserAlreadyTaken();
    }


}
