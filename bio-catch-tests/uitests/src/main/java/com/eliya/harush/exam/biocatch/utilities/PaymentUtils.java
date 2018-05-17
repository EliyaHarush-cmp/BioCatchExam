package com.eliya.harush.exam.biocatch.utilities;

import com.eliya.harush.exam.biocatch.entities.PaymentDetailsEntity;
import com.eliya.harush.exam.biocatch.pages.PaymentPage;

import java.util.Optional;

public class PaymentUtils extends BaseUtils{

    private PaymentPage paymentPage = new PaymentPage();

    public void generatePaymentData(){
        PaymentDetailsEntity paymentDetails = new PaymentDetailsEntity();


    }

    public void fillPaymentData(Optional<String> countryOrRegion,
                                Optional<String> firstName,
                                Optional<String> lastName,
                                Optional<String> streetAddress,
                                Optional<String> streetAddress2,
                                Optional<String> city,
                                Optional<String> state,
                                Optional<String> zipCode,
                                Optional<String> email,
                                Optional<String> emailConfirmation,
                                Optional<String> phoneNumber){

        if (countryOrRegion.isPresent()){
            paymentPage.selectRegionOrCountry(countryOrRegion.get());
        }

        if (firstName.isPresent()){
            paymentPage.insertFirstName(firstName.get());
        }

        if (lastName.isPresent()){
            paymentPage.insertLastName(lastName.get());
        }

        if (streetAddress.isPresent()){
            paymentPage.insertStreetAddress(streetAddress.get());
        }

        if (streetAddress2.isPresent()){
            paymentPage.insertStreetAddress2(streetAddress2.get());
        }

        if (city.isPresent()){
            paymentPage.insertCity(city.get());
        }

        if (state.isPresent()){
            paymentPage.insertState(state.get());
        }

        if (zipCode.isPresent()){
            paymentPage.insertZipCode(zipCode.get());
        }

        if (email.isPresent()){
            paymentPage.insertEmail(email.get());
        }

        if (emailConfirmation.isPresent()){
            paymentPage.insertEmailConfirmation(emailConfirmation.get());
        }

        if (phoneNumber.isPresent()){
            paymentPage.insertPhoneNumber(phoneNumber.get());
        }
    }
}
