package com.eliya.harush.exam.biocatch;

import com.eliya.harush.exam.biocatch.pages.*;
import com.eliya.harush.exam.biocatch.utilities.BaseUtils;
import com.eliya.harush.exam.biocatch.utilities.CartUtils;
import com.eliya.harush.exam.biocatch.utilities.ItemUtils;
import com.eliya.harush.exam.biocatch.utilities.PaymentUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class AbstractTests {

    private static final Logger logger = LoggerFactory.getLogger(AbstractTests.class);

    protected WebDriver chromeDriver;

    private Page page;
    protected HeaderPage headerPage;
    protected CategoriesPage categoriesPage;
    protected CartPage cartPage;
    protected ItemPage itemPage;
    protected PaymentPage paymentPage;
    protected ProductsPage productsPage;
    protected SignInPage signinPage;

    protected BaseUtils baseUtils;
    protected PaymentUtils paymentUtils;
    protected ItemUtils itemUtils;
    protected CartUtils cartUtils;

    public void initAutomationFramework() {
        String url = SystemProperties.urlUnderTestPath;
        logger.info("Url under test: " + url);
        chromeDriver = new ChromeDriver();
        page = new Page((ChromeDriver) chromeDriver);
        logger.info("Setting browser configuration");
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeDriver.manage().window().maximize();
        chromeDriver.navigate().to(url);

        headerPage = new HeaderPage();
        categoriesPage = new CategoriesPage();
        cartPage = new CartPage();
        itemPage = new ItemPage();
        paymentPage = new PaymentPage();
        productsPage = new ProductsPage();
        signinPage = new SignInPage();

        baseUtils = new BaseUtils();
        paymentUtils = new PaymentUtils();
        itemUtils = new ItemUtils();
        cartUtils = new CartUtils();
    }
}