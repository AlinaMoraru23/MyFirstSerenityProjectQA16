package org.fasttrack.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.LoginSteps;
import org.fasttrack.steps.SearchSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private SearchSteps searchSteps;

    @Steps
    private LoginSteps loginSteps;


    @Test
    public void searchItem(){
        loginSteps.navigateToHomePage();
        searchSteps.searchItem("necklace");
        searchSteps.checkProductInResults("SILVER DESERT NECKLACE");
    }



}
