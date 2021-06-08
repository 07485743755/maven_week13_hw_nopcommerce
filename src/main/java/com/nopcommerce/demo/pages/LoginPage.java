package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText=By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkOutAsGuestButton=By.xpath("//button[@class='button-1 checkout-as-guest-button']");

    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void clickOnCheckOutAsGuestButton(){
        clickOnElement(waitUntilVisibilityOfElementLocated(checkOutAsGuestButton,20));
    }

}
