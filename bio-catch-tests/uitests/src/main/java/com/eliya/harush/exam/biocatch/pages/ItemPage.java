package com.eliya.harush.exam.biocatch.pages;

import com.eliya.harush.exam.biocatch.SystemProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ItemPage extends Page {

    private static final Logger logger = LoggerFactory.getLogger(ItemPage.class);

    public final static String SELECT_CLASS_NAME = "msku-sel ";

    // Constructor.
    public ItemPage() {
        super();
    }

    public boolean isQuantityVisible() {
        return getDriver().findElement(SystemProperties.quantityInput).isDisplayed();
    }

    public void setQuantity(int quantity) {
        WebElement quantityInput = getDriver().findElement(SystemProperties.quantityInput);
        quantityInput.clear();
        quantityInput.sendKeys(String.valueOf(quantity));
    }

    public boolean isQuantityLimitVisible() {
        return getDriver().findElement(SystemProperties.quantityLimit).isDisplayed();
    }

    /**
     * @return the message with the allowed quantity of items as string
     * @see com.eliya.harush.exam.biocatch.utilities.BaseUtils#getDoubleFromString(String)
     */
    public String getQuantityLimitMessage() {
        return getDriver().findElement(SystemProperties.quantityLimit).getText();
    }

    public void clickAddToCart() {
        getDriver().findElement(SystemProperties.addToCart).click();
    }

    public String getItemPrice() {
        return getDriver().findElement(SystemProperties.itemPrice).getText();
    }

    /**
     * get all select buying options for the current item.
     *
     * @return
     */
    public List<WebElement> getSelectOptions() {
        return getDriver().findElementsByClassName(SELECT_CLASS_NAME);
    }

    /**
     * Select the first available option.
     * Skip the first option called "Select"
     *
     * @param options
     */
    public void selectFirstAvailableOption(WebElement options) {
        for (WebElement op : new Select(options).getOptions()) {
            if (!op.getAttribute("value").equals("-1") && op.getAttribute("disabled") == null) {
                op.click();
                break;
            }
        }
    }

    public boolean isOffScreenDisplayed() {
        WebDriverWait wait = new WebDriverWait(getDriver(),10);
        return getDriver().findElement(SystemProperties.itemOffScreen).isDisplayed();
    }
}