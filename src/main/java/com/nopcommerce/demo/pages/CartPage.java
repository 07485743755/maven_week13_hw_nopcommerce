package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CartPage extends Utility {


    By welcomeText=By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantityLink=By.xpath("//input[contains(@id,'itemquantity')]");
    By updateShoppingCartLink=By.xpath("//button[contains(text(),'Update shopping cart')]");
    By totalPriceLink=By.xpath("//td[@class='subtotal']/child::span");
    By termsOfServiceCheckBox=By.id("termsofservice");
    By checkOutButton=By.id("checkout");

    public String getWelcomeText(){
        return getTextFromElement(waitUntilVisibilityOfElementLocated(welcomeText,20));
    }

    public void changeQuantityOfSelectedProduct(){
        changeTheQuantityOnElement(quantityLink,"2");
    }

    public void clickOnUpdateShoppingCart(){
        clickOnElement(waitUntilVisibilityOfElementLocated(updateShoppingCartLink,20));
    }

    public String getTextFromTotalPrice(){
      return   getTextFromElement(waitUntilVisibilityOfElementLocated(totalPriceLink,20));
    }

    public void clickOnTermsOfService(){
        clickOnElement(waitUntilVisibilityOfElementLocated(termsOfServiceCheckBox,20));
    }

    public void clickOnCheckOutButton(){
        clickOnElement(waitUntilVisibilityOfElementLocated(checkOutButton,20));
    }

}
