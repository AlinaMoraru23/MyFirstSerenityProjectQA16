package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.ProductPage;

public class ProductSteps {

    private ProductPage productPage;

    @Step
    public void selectPinkS(){
        productPage.selectColorPink();
        productPage.selectSizeS();
    }

    @Step
    public void addProductToCart(){
        productPage.addToCart();
    }
}
