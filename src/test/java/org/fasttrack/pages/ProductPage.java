package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {

    @FindBy(id = "option21")
    private WebElementFacade colorPink;

    public void selectColorPink() {
        clickOn(colorPink);
    }

    @FindBy(id = "option80")
    private WebElementFacade sizeS;

    public void selectSizeS() {
        clickOn(sizeS);
    }

    @FindBy (css = ".add-to-cart-buttons [title='Add to Cart']")
    private WebElementFacade addToCartButton;

    public void addToCart(){
        clickOn(addToCartButton);
    }

}
