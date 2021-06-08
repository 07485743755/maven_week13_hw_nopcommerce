package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class CheckOutPage extends Utility {


    By firstNameField = By.id("BillingNewAddress_FirstName");
    By lastNameField = By.id("BillingNewAddress_LastName");
    By emailIdField = By.id("BillingNewAddress_Email");
    By country = By.id("BillingNewAddress_CountryId");
    By cityField = By.id("BillingNewAddress_City");
    By addressField = By.id("BillingNewAddress_Address1");
    By postalCodeField = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberField = By.id("BillingNewAddress_PhoneNumber");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    By nextDayAirRadioButton=By.xpath("(//input[contains(@id,'shippingoption')])[2]");
    By shippingContinueButton=By.xpath("//button[@onclick='ShippingMethod.save()']");
    By creditCardRadioButton=By.xpath("(//input[contains(@id,'paymentmethod')])[2]");
    By paymentMethodContinueButton=By.xpath("//button[@onclick='PaymentMethod.save()']");
    By selectCreditCard=By.id("CreditCardType");
    By cardHolderNameField =By.id("CardholderName");
    By cardNumberField=By.id("CardNumber");
    By expireMonthField=By.id("ExpireMonth");
    By expireYearField=By.id("ExpireYear");
    By cardCodeField=By.id("CardCode");
    By paymentConfirmationButton=By.xpath("//button[@onclick='PaymentInfo.save()']");
    By paymentMethodConformationText=By.xpath("//li[@class='payment-method']");
    By shippingMethodConformationText=By.xpath("//li[@class='shipping-method']");
    By totalPriceText=By.xpath("//span[@class='value-summary']/child::strong");
    By confirmOrderButton=By.xpath("//button[@onclick='ConfirmOrder.save()']");




    public void enterFirstName(String firstname){

        sendTextToElement(waitUntilVisibilityOfElementLocated(firstNameField,20),firstname);
    }
    public void enterLastName(String lastName){

        sendTextToElement(waitUntilVisibilityOfElementLocated(lastNameField,20),lastName);
    }
    public void enterEmailID(String emailID){

        WebElement emailText=driver.findElement(emailIdField);
        emailText.click();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        emailText.sendKeys(emailID+ randomInt +"@gmail.com");
        //sendTextToElement(waitUntilVisibilityOfElementLocated(emailIdField,20),emailID);
    }
    public void selectCountryFromDropDown(String visibleText ){

        selectByVisibleText(waitUntilVisibilityOfElementLocated(country,20),visibleText);
    }
    public void enterCityName(String cityName){

        sendTextToElement(waitUntilVisibilityOfElementLocated(cityField,20),cityName);
    }
    public void enterAddress(String address){

        sendTextToElement(waitUntilVisibilityOfElementLocated(addressField,20),address);
    }
    public void enterPostCode(String postalCode){

        sendTextToElement(waitUntilVisibilityOfElementLocated(postalCodeField,20), postalCode);
    }
    public void enterPhoneNumber(String phoneNumber){

        sendTextToElement(waitUntilVisibilityOfElementLocated(phoneNumberField,20),phoneNumber);
    }

    public void clickOnContinueButton(){

        clickOnElement(waitUntilVisibilityOfElementLocated(continueButton,20));
    }

    public void selectNextDayAirRadioButton(){

        clickOnElement(waitUntilVisibilityOfElementLocated(nextDayAirRadioButton,20));
    }

    public void clickOnShippingContinueButton(){

        clickOnElement(waitUntilVisibilityOfElementLocated(shippingContinueButton,20));
    }

    public void selectCreditCardRadioButton(){

        clickOnElement(waitUntilVisibilityOfElementLocated(creditCardRadioButton,20));
    }

    public void clickOnPaymentContinueButton(){

        clickOnElement(waitUntilVisibilityOfElementLocated(paymentMethodContinueButton,20));
    }

    public void selectMasterCardFromDropDown(){

        selectByValueDropDown(waitUntilVisibilityOfElementLocated(selectCreditCard,20),"MasterCard");
    }

    public void enterCardHolderName(String cardHolderName){

        sendTextToElement(waitUntilVisibilityOfElementLocated(cardHolderNameField,20),cardHolderName);
    }

    public void enterCardNumber(String cardNumber){
        sendTextToElement(waitUntilVisibilityOfElementLocated(cardNumberField,20),cardNumber);
    }

    public void enterExpireMonth(String expireMonth){
        sendTextToElement(waitUntilVisibilityOfElementLocated(expireMonthField,20),expireMonth);
    }

    public void enterExpireYear(String expireYear){
        sendTextToElement(waitUntilVisibilityOfElementLocated(expireYearField,20),expireYear);
    }

    public void enterCardCode(String cardCode){
        sendTextToElement(waitUntilVisibilityOfElementLocated(cardCodeField,20),cardCode);
    }

    public void clickOnPaymentConfirmationButton(){

        clickOnElement(waitUntilVisibilityOfElementLocated(paymentConfirmationButton,20));
    }

    public String getTextFromPaymentMethod(){
        return getTextFromElement(waitUntilVisibilityOfElementLocated(paymentMethodConformationText,20));
    }

    public String getTextFromShippingMethod(){
        return getTextFromElement(waitUntilVisibilityOfElementLocated(shippingMethodConformationText,20));
    }

    public String getTextFromTotalPrice(){
        return getTextFromElement(waitUntilVisibilityOfElementLocated(totalPriceText,20));
    }

    public void clickOnConfirmOrderButton(){

        clickOnElement(waitUntilVisibilityOfElementLocated(confirmOrderButton,20));
    }
}
