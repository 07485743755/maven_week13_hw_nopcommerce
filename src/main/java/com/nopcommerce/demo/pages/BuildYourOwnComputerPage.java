package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BuildYourOwnComputerPage extends Utility {

    By welcomeText=By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processorAttribute=By.xpath("(//select[contains(@id,'product_attribute')])[1]");
    By ramAttribute=By.xpath("(//select[contains(@id,'product_attribute')])[2]");
    By hDD400GbRadioButton =By.xpath("(//input[contains(@id,'product_attribute')])[2]");
    By oSVistaPremiumRadioButton=By.xpath("(//input[contains(@id,'product_attribute')])[4]");
    By checkBoxMicroSoftOffice =By.xpath("(//input[contains(@id,'product_attribute')])[5]");
    By checkBoxTotalCommander=By.xpath("(//input[contains(@id,'product_attribute')])[7]");
    By priceLink=By.xpath("//span[contains(@id,'price-value')]");
    By addToCartButton=By.xpath("//button[contains(@id,'add-to-cart-button')]");
    By popUpTextFromAddToCart=By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By popUpCloseButton=By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By shoppingCartLink=By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCartButton=By.xpath("//button[contains(text(),'Go to cart')]");



    public String getWelcomeText(){

        return getTextFromElement(welcomeText);
    }

    public void select2_2GHzIntelPentiumDualCoreE2200Processor(){
        selectByValueDropDown(waitUntilVisibilityOfElementLocated(processorAttribute,30),"1");
    }

    public void select8GBWhichAdd$60(){
        selectByValueDropDown(waitUntilVisibilityOfElementLocated(ramAttribute,30),"5");
    }

    public void clickOnRadioButton400GBHDDWhichAdd$100(){
        clickOnElement(waitUntilVisibilityOfElementLocated(hDD400GbRadioButton,20));
    }

    public void clickOnRadioButtonOSVistaPremium(){
        clickOnElement(waitUntilVisibilityOfElementLocated(oSVistaPremiumRadioButton,30));
    }

    public void checkOnCheckBoxMicroSoftOffice(){

        WebElement microSoftOfficeCheckBox=driver.findElement(checkBoxMicroSoftOffice);
        if(!microSoftOfficeCheckBox.isSelected()){
            microSoftOfficeCheckBox.click();
        }
    }

    public void checkOnCheckBoxTotalCommander(){

        clickOnElement(waitUntilVisibilityOfElementLocated(checkBoxTotalCommander,30));
    }

    public String getTextFromPrice(){

        return getTextFromElement(waitUntilVisibilityOfElementLocated(priceLink,30));
    }

    public void clickOnAddToCart(){
        clickOnElement(waitUntilVisibilityOfElementLocated(addToCartButton,30));
    }

    public String getTextFromAddToCartPopup(){
        return getTextFromElement(waitUntilVisibilityOfElementLocated(popUpTextFromAddToCart,30));
    }

    public void setPopUpCloseButton(){

        clickOnElement(waitUntilVisibilityOfElementLocated(popUpCloseButton,20));
    }

    public void mouseHoverOnShoppingCart(){

        mouseHoverToElement(waitUntilVisibilityOfElementLocated(shoppingCartLink,30));
    }

    public void clickOnGoToCartButton(){

        clickOnElement(waitUntilVisibilityOfElementLocated(goToCartButton,30));
    }
}
