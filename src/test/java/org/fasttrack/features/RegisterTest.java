package org.fasttrack.features;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.RegisterSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.yecht.Data;

@RunWith(SerenityRunner.class)
public class RegisterTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;


    @Steps
    private RegisterSteps registerSteps;

    private String fisrtName = "Alina";
    private String lastName = "Moraru";
    private String email = "alina.moraru.qa@gmail.com";
    private String password = "Pass123";
    private String confirmPassword = "Pass123";


    @Test

    public void invalidRegisterTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.performRegister(fisrtName,lastName,email,password,confirmPassword);
        registerSteps.checkUserAlreadyTaken();
    }
}
