package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultsPage extends PageObject {

    @FindBy(css = "[title='Sort By']")
    private WebElementFacade sortByDropdown;

    @FindBy(css = ".products-grid .item")
    private List<WebElementFacade> productsList;

    @FindBy(css = "[class^='sort-by'] a[title*='Ascending']")
    private WebElementFacade sortAscendingSwitcher;

    @FindBy(css = "[class^='sort-by'] a[title*='Descending']")
    private WebElementFacade sortDescendingSwitcher;

    @FindBy(css = ".products-grid .item:nth-child(1) .price")
    private WebElementFacade priceFirstProduct;

    @FindBy(css = ".products-grid .item:last-child .price")
    private WebElementFacade priceLastProduct;

    @FindBy(css = ".button[title='View Details']")
    private WebElementFacade viewDetailsButton;


    public boolean isProductOnPage(String productName) {
        for (WebElementFacade element : productsList) {

            if (element.findElement(By.cssSelector(".product-name a")).getText().equals(productName))
                return true;
        }
        return false;
    }

    public void clickSortBy() {
        clickOn(sortByDropdown);
    }

    public void sortByPrice() {
        sortByDropdown.selectByVisibleText("Price");
    }


    public void sortAscending() {
        try {
            clickOn(sortAscendingSwitcher);
        } catch (Exception e) {
        }

    }

    public void sortDescending() {
        try {
            clickOn(sortDescendingSwitcher);
        } catch (Exception e) {
        }
    }

    Integer priceFirstProductValue = new Integer(10);

    public void getPriceFirstProduct() {
        priceFirstProductValue = priceFirstProductValue.valueOf(priceFirstProduct.getText().replaceAll("[*a-zA-Z, ]", ""));

    }

    Integer priceLastProductValue = new Integer(10);

    public void getPriceLastProduct() {
        priceLastProductValue = priceLastProductValue.valueOf(priceLastProduct.getText().replaceAll("[*a-zA-Z, ]", ""));

    }

    public boolean checkFirstPriceSmallerThanLast() {

        if (priceFirstProductValue < priceLastProductValue) {
            return true;
        }
        return false;
    }

    public boolean checkLastPriceSmallerThanFirst() {
        if (priceLastProductValue < priceFirstProductValue) {
            return true;
        }
        return false;

    }

    public void clickViewDetailsButton() {
        clickOn(viewDetailsButton);
    }

}

