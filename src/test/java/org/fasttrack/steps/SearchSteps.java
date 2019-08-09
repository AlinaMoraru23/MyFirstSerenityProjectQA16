package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.HomePage;
import org.fasttrack.pages.SearchResultsPage;
import org.junit.Assert;
import org.yecht.Data;

public class SearchSteps {

    private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    @Step
    public void searchItem(String searchItem){
        homePage.setSearchItem(searchItem);
        homePage.clickSearchButton();
    }

    @Step
    public void checkProductInResults(String productName){
        Assert.assertTrue("Product not on the page.",searchResultsPage.isProductOnPage(productName));
    }

}
