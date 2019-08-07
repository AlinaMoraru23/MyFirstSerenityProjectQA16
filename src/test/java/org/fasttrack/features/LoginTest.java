package org.fasttrack.features;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.LoginSteps;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    private   WebDriver driver;

    @Before
    public  void maximiseWindow(){
        driver.manage().window().maximize();
    }


    @Steps
    private LoginSteps loginSteps;


    private String userEmail = "alina.moraru.qa@gmail.com";
    private String userPass = "Pass23";
    private String userName = "Alina Moraru";

    @Test
    public void validLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.performLogin(userEmail, userPass);
        loginSteps.checkLoggedIn(userName);
    }

    @Test
    public void invalidLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.performLogin(userEmail, "aaaaaaaaa");
        loginSteps.checkNotLoggedIn();
    }


}
