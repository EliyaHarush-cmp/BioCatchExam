package com.eliya.harush.exam.biocatch.pages;

import com.eliya.harush.exam.biocatch.SystemProperties;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Random;

public class HeaderPage extends Page {

    private static final Logger logger = LoggerFactory.getLogger(HeaderPage.class);

    public final static String ARIA_EXPANDED_ATTRIBUTE = "aria-expanded";

    public HeaderPage() {
        super();
    }

    public void clickShopByCategoryButton() {
        logger.info("Click on 'Shop By Category' button");
        getDriver().findElement(SystemProperties.shopByCategoryButton).click();
    }

    public boolean isAreaExpended() {
        return Boolean.parseBoolean(getDriver().findElement(SystemProperties.shopByCategoryButton).getAttribute(ARIA_EXPANDED_ATTRIBUTE));
    }

    public List<WebElement> getAllCategories() {
        logger.info("Get all categories");
        return getDriver().findElement(SystemProperties.categoriesTable).findElements(SystemProperties.categoriesClassName);
    }

    public void clickOnRandomCategory() {
        if (!isAreaExpended()) {
            clickShopByCategoryButton();
        }
        List<WebElement> categories = getAllCategories();
        categories.get(new Random().nextInt(categories.size() - 1)).click();
    }

    public void goToCartPage() {
        logger.info("Click on 'Cart' button");
        getDriver().findElement(SystemProperties.goToCart).click();
    }
}