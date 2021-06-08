package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CompletedPage extends Utility {

    By thankYouText=By.xpath("//h1[text()='Thank you']");
    By orderConfirmationText=By.xpath("//strong[text()='Your order has been successfully processed!']");
    By continueButton=By.xpath("//button[contains(text(),'Continue')]");

    public String getTextFromThankYou(){
        return getTextFromElement(waitUntilVisibilityOfElementLocated(thankYouText,20));
    }

    public String getTextOfOrderConfirmation(){
        return getTextFromElement(waitUntilVisibilityOfElementLocated(orderConfirmationText,20));
    }

    public void clickOnContinueButton(){

        clickOnElement(waitUntilVisibilityOfElementLocated(continueButton,20));
    }
}
