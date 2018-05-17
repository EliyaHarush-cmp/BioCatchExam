package com.eliya.harush.exam.biocatch.utilities;

import com.eliya.harush.exam.biocatch.pages.ItemPage;

public class ItemUtils extends BaseUtils {

    private ItemPage itemPage = new ItemPage();

    public int setAllowedItemQuantity() {
        int quantityToSet = 1; // Min 1.
        double currentItemPrice = getDoubleFromString(itemPage.getItemPrice());
        if (currentItemPrice < 100 && itemPage.isQuantityVisible()) {
            quantityToSet = (int) (100 / currentItemPrice);
            itemPage.setQuantity(quantityToSet);
            if (itemPage.isQuantityLimitVisible()) {
                quantityToSet = getIntegerFromString(itemPage.getQuantityLimitMessage());
                itemPage.setQuantity(quantityToSet);
            }
        }
        return quantityToSet;
    }
}