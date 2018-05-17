package com.eliya.harush.exam.biocatch.pages;

import com.eliya.harush.exam.biocatch.SystemProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignInPage extends Page {

    private static final Logger logger = LoggerFactory.getLogger(CartPage.class);

    public SignInPage() {
        super();
    }

    public void insertUserId(String userId){
        getDriver().findElement(SystemProperties.userInput).sendKeys(userId);
    }

    public void insertPassword(String password){
        getDriver().findElement(SystemProperties.passwordInput).sendKeys(password);
    }

    public void clickSigninButton() {
        logger.info("Click on 'Sign In' button");
        getDriver().findElement(SystemProperties.signInButton).click();
    }

    public void clickContinueAsGuest(){
        logger.info("Click on 'Continue as Guest' button");
        getDriver().findElement(SystemProperties.continueAsGuestButton).click();
    }
}
