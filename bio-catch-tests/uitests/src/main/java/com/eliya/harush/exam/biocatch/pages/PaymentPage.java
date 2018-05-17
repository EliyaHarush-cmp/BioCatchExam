package com.eliya.harush.exam.biocatch.pages;

import com.eliya.harush.exam.biocatch.SystemProperties;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage extends Page {
    public PaymentPage() {
        super();
    }

    public void insertFirstName(String firstName){
        getDriver().findElement(SystemProperties.firstnameInput).sendKeys(firstName);
    }

    public void insertLastName(String lastName){
        getDriver().findElement(SystemProperties.lastnameInput).sendKeys(lastName);
    }

    public void insertStreetAddress(String streetAddress1){
        getDriver().findElement(SystemProperties.streetAddressInput).sendKeys(streetAddress1);
    }

    public void insertStreetAddress2(String streetAddress2){
        getDriver().findElement(SystemProperties.streetAddress2Input).sendKeys(streetAddress2);
    }

    public void insertCity(String city){
        getDriver().findElement(SystemProperties.cityInput).sendKeys(city);
    }

    public void insertState(String state){
        getDriver().findElement(SystemProperties.stateInput).sendKeys(state);
    }

    public void insertZipCode(String zipcode){
        getDriver().findElement(SystemProperties.zipCodeInput).sendKeys(zipcode);
    }

    public void insertEmail(String email){
        getDriver().findElement(SystemProperties.emailInput).sendKeys(email);
    }

    public void insertEmailConfirmation(String emailConfirmation){
        getDriver().findElement(SystemProperties.emailConfirmationInput).sendKeys(emailConfirmation);
    }

    public void insertPhoneNumber(String phoneNumber){
        getDriver().findElement(SystemProperties.phoneNumberInput).sendKeys(phoneNumber);
    }

    public void clickDoneButton(){
        getDriver().findElement(SystemProperties.doneButton).click();
    }

    public void selectRegionOrCountry(String value) {
        Select options = new Select(getDriver().findElement(SystemProperties.regionOrCountrySelect));
        options.selectByVisibleText(value);
    }
}
