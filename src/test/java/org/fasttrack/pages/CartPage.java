package org.fasttrack.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



import java.util.List;

public class CartPage extends PageObject {


    @FindBy(css = "#shopping-cart-totals-table > tbody > tr:nth-child(1) > td:nth-child(2) > span")
    private WebElementFacade cartSubtotal;

    @FindBy(css = ".product-cart-total .price")
    private List<WebElementFacade> cartElementsSubtotal;

    Integer productPrice = new Integer(0);
    Integer total = new Integer(0);

//decimal point excluded from the calculation - no impact in test
    public void CartElementsSubTotal() {
       for (WebElementFacade price:cartElementsSubtotal){
            productPrice = productPrice.valueOf(price.getText().replaceAll("[*a-zA-Z, ]", ""));
            total = total+productPrice;
        }
    }

    Integer valueCartSubtotal = new Integer(0);

    public void getCartSubtotal() {

        valueCartSubtotal = valueCartSubtotal.valueOf(cartSubtotal.getText().replaceAll("[*a-zA-Z, ]", ""));
    }

    public boolean verifyCartSubtotal() {
        if (total.equals(valueCartSubtotal)) {
            return true;
        }
        return false;
    }
}
