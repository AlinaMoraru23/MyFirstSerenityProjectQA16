package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.pages.HomePage;
import org.fasttrack.pages.SearchResultsPage;
import org.junit.Assert;


public class SearchSteps {

    private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    @Step
    public void searchItem(String searchItem) {
        homePage.setSearchItem(searchItem);
        homePage.clickSearchButton();
    }

    @Step
    public void checkProductInResults(String productName) {
        Assert.assertTrue("Product not on the page.", searchResultsPage.isProductOnPage(productName));
    }

    @Step
    public void sortResultsByPrice() {
        searchResultsPage.clickSortBy();
        searchResultsPage.sortByPrice();
    }

    @Step
    public void sortAscending() {
        searchResultsPage.sortAscending();
    }

    @Step
    public void sortDescending() {
        searchResultsPage.sortDescending();
    }

    @Step
    public void getPriceOfFirstAndLastProduct() {
        searchResultsPage.getPriceFirstProduct();
        searchResultsPage.getPriceLastProduct();
    }

    @Step
    public void checkResultsSortedByPriceAscending() {
        Assert.assertTrue("Results not sorted ascending by price", searchResultsPage.checkFirstPriceSmallerThanLast());
    }

    @Step
    public void checkResulteSortedByPriceDescending() {
        Assert.assertTrue("Results not sorted descending by price", searchResultsPage.checkLastPriceSmallerThanFirst());
    }

    @Step
    public void openProductPage() {
        searchResultsPage.clickViewDetailsButton();
    }

}
