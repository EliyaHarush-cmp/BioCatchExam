package com.eliya.harush.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Optional;

public class ebayUiTests extends TestWrapper {


    @Test
    public void test1() {

        int cartMax = 500;
        double _totalPriceConditionCounter = 0;

        while (_totalPriceConditionCounter < cartMax) {
            boolean b = false;
            while (!b) {

                headerPage.clickOnRandomCategory();
                if (categoriesPage.selectRandomSubCategory()) {
                    productsPage.clickBuyItNow();
                    b = productsPage.selectRandomProduct();
                }
            }
            List<WebElement> options = itemPage.getSelectOptions();
            for (int i = 0; i < options.size(); i++) {
                itemPage.selectFirstAvailableOption(options.get(i));
            }
            int quantity = itemUtils.setAllowedItemQuantity();
            _totalPriceConditionCounter += baseUtils.getDoubleFromString(itemPage.getItemPrice()) * quantity;
            itemPage.clickAddToCart();
            if (!itemPage.isOffScreenDisplayed()) {
                cartPage.clickContinueShopping();
            }
        }
        headerPage.goToCartPage();

        if (baseUtils.getDoubleFromString(cartPage.getTotalPrice()) > cartMax) {
            cartPage.clickProceedToCheckoutButton();
            signinPage.clickContinueAsGuest();

            paymentUtils.fillPaymentData(Optional.of("Israel"),
                    Optional.of("Eliya"),
                    Optional.of("Harush"),
                    Optional.of("Alexander Hagadol 30"),
                    Optional.empty(),
                    Optional.of("Hod-Hasharon"),
                    Optional.of("Hasharon"),
                    Optional.of("000000"),
                    Optional.of("eliyaharush22@gmail.com"),
                    Optional.of("eliyaharush22@gmail.com"),
                    Optional.of("0543037344")
            );

            paymentPage.clickDoneButton();
        }
    }
}