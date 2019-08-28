package org.fasttrack.features;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.pages.ProductPage;
import org.fasttrack.steps.CartSteps;
import org.fasttrack.steps.LoginSteps;
import org.fasttrack.steps.ProductSteps;
import org.fasttrack.steps.SearchSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private SearchSteps searchSteps;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private ProductSteps productSteps;

    @Steps
    private CartSteps cartSteps;

    @Test
    public void searchItem() {
        loginSteps.navigateToHomePage();
        searchSteps.searchItem("Elizabeth");
        searchSteps.openProductPage();
        productSteps.selectPinkS();
        productSteps.addProductToCart();
        searchSteps.searchItem("Nolita");
        searchSteps.openProductPage();
        productSteps.selectPinkS();
        productSteps.addProductToCart();
        cartSteps.calculateCartSubTotal();
        cartSteps.getCartSubtotal();
        cartSteps.checkCartSubtotal();


    }
}