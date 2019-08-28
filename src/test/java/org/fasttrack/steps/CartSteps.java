package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.CartPage;
import org.junit.Assert;

public class CartSteps {

    private CartPage cartPage;

    @Step

    public void calculateCartSubTotal(){
        cartPage.CartElementsSubTotal();

    }

    @Step

    public void getCartSubtotal(){
        cartPage.getCartSubtotal();
    }

    @Step
    public void checkCartSubtotal(){
        Assert.assertTrue("Cart Subtotal is not correct", cartPage.verifyCartSubtotal());
    }

}

