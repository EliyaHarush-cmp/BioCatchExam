package com.eliya.harush.exam.biocatch.pages;

import com.eliya.harush.exam.biocatch.SystemProperties;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Random;

public class CategoriesPage extends Page{

    private static final Logger logger = LoggerFactory.getLogger(CategoriesPage.class);

    public CategoriesPage() {
        super();
    }

    public boolean selectRandomSubCategory() {
        List<WebElement> subCategories =  getDriver().findElements(SystemProperties.subCategories);
        if (subCategories.size() > 1) {
            subCategories.get(new Random().nextInt(subCategories.size() - 1)).click();
            return true;
        }
        return false;
    }

}
