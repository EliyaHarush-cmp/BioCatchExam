package com.eliya.harush.exam.biocatch.pages;

import com.eliya.harush.exam.biocatch.SystemProperties;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Random;

public class ProductsPage extends Page {

    private static final Logger logger = LoggerFactory.getLogger(CartPage.class);

    public final static String BUY_IT_NOW = "Buy It Now";

    public ProductsPage() {
        super();
    }

    public List<WebElement> getProductsList() {
        return getDriver().findElements(SystemProperties.productsClassName);
    }

    public void clickBuyItNow() {
        WebElement sec = getDriver().findElement(SystemProperties.filterButtons);
        List<WebElement> filterButtons = sec.findElements(SystemProperties.buyItNowButton);
        for (WebElement btn : filterButtons) {
            if (btn.getText().equals(BUY_IT_NOW)) {
                logger.info("Click on '" + BUY_IT_NOW + "' filter button");
                btn.click();
                break;
            }
        }
    }

    public boolean selectRandomProduct() {
        List<WebElement> products = getProductsList();
        if (products.size() > 0) {
            logger.info("Select random product");
            products.get(new Random().nextInt(products.size() - 1)).click();
            return true;
        }
        return false;
    }
}