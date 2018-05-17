package com.eliya.harush.exam.biocatch;

import org.openqa.selenium.By;

public class SystemProperties {

    public static String chromeDriverPath = System.setProperty("webdriver.chrome.driver", "chromeDriver/chromedriver.exe");
    public static String urlUnderTestPath = System.getProperty("biocatch.api.url","https://www.ebay.com/");

    // Header Page
    public static By shopByCategoryButton = By.xpath("//*[@id=\"gh-shop-a\"]");
    public static By categoriesTable = By.xpath("//*[@id=\"gh\"]/table");
    public static By goToCart = By.id("gh-cart-1");
    public static By categoriesClassName = By.className("scnd");

    // Products Page
    public static By subCategories = By.xpath("//*[@id=\"mainContent\"]/section[2]/div[2]/a");
    public static By productsClassName = By.className("s-item__link");
    public static By buyItNowButton = By.className("btn");
    public static By filterButtons = By.id("w8");

    // Item Page
    public static By itemPrice = By.className("notranslate ");
    public static By addToCart = By.xpath("//*[@id=\"atcRedesignId_btn\"]");
    public static By quantityInput = By.xpath("//*[@id=\"qtyTextBox\"]");
    public static By quantityLimit = By.xpath("//*[@id=\"qtyErrMsg\"]");
    public static By itemOffScreen = By.className("vi_oly_clz_cntr");

    // Cart Page
    public static By continueShoppingButton = By.xpath("//*[@id=\"contShoppingBtn\"]");
    public static By proceedToCheckoutButton = By.xpath("//*[@id=\"ptcBtnBottom\"]");
    public static By proceedToCheckoutRightButton = By.xpath("//*[@id=\"ptcBtnRight\"]");
    public static By totalPrice = By.xpath("//*[@id=\"asyncTotal\"]");
    public static By addToCartSuccessIcon = By.xpath("//*[@id=\"pageLevelMessaing\"]/div/div/i");
    public static By addToCartSuccessMessage = By.xpath("//*[@id=\"pageLevelMessaing\"]/div/div/p/span[1]");


    // SignIn Page
    public static By continueAsGuestButton = By.xpath("//*[@id=\"gtChk\"]");
    public static By signInButton = By.xpath("//*[@id=\"sgnBt\"]");
    public static By userInput = By.xpath("//*[@id=\"userid\"]");
    public static By passwordInput = By.xpath("//*[@id=\"pass\"]");

    // Payment Page
    public static By regionOrCountrySelect = By.xpath("//*[@id=\"af-country\"]");
    public static By firstnameInput = By.xpath("//*[@id=\"af-first-name\"]");
    public static By lastnameInput = By.xpath( "//*[@id=\"af-last-name\"]");
    public static By streetAddressInput = By.xpath("//*[@id=\"af-address1\"]");
    public static By streetAddress2Input = By.xpath("//*[@id=\"af-address2\"]");
    public static By cityInput = By.xpath("//*[@id=\"af-city\"]");
    public static By stateInput = By.xpath("//*[@id=\"af-state\"]");
    public static By zipCodeInput = By.xpath("//*[@id=\"af-zip\"]");
    public static By emailInput = By.xpath("//*[@id=\"af-email\"]");
    public static By emailConfirmationInput = By.xpath("//*[@id=\"af-email-confirm\"]");
    public static By phoneNumberInput = By.xpath("//*[@id=\"address-fields\"]/div[7]/span/input");
    public static By doneButton = By.xpath("//*[@id=\"address-fields-ctr\"]/div[2]/div/button");

}