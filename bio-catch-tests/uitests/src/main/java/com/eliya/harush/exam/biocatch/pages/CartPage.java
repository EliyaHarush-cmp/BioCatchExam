package com.eliya.harush.exam.biocatch.pages;

import com.eliya.harush.exam.biocatch.SystemProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CartPage extends Page {

    private static final Logger logger = LoggerFactory.getLogger(CartPage.class);

    public final static String ICON_CLASS_NAME = "gspr icsu";
    public final static String ADDED_ITEM_MESSAGE_CONTENT = "was just added to your cart.";
    public final static String PROCEED_TO_CHECKOUT = "Proceed To Checkout";

    public CartPage() {
        super();
    }

    public void clickContinueShopping() {
        getDriver().findElement(SystemProperties.continueShoppingButton).click();
    }

    public void clickProceedToCheckoutButton() {
        logger.info("Click on '" + PROCEED_TO_CHECKOUT + "' button");
        getDriver().findElement(SystemProperties.proceedToCheckoutButton).click();
    }

    public void clickProceedToCheckoutRightButton() {
        logger.info("Click on '" + PROCEED_TO_CHECKOUT + "' button (right side)");
        getDriver().findElement(SystemProperties.proceedToCheckoutRightButton).click();
    }

    public String getTotalPrice() {
        return getDriver().findElement(SystemProperties.totalPrice).getText();
    }

    public boolean validateAddedItemIcon() {
        return getDriver().findElement(SystemProperties.addToCartSuccessIcon).getAttribute("class").contains(ICON_CLASS_NAME);
    }

    public boolean validateAddedItemMessage() {
        return getDriver().findElement(SystemProperties.addToCartSuccessMessage).getText().contains(ADDED_ITEM_MESSAGE_CONTENT);
    }
}