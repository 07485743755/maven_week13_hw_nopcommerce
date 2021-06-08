package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testBase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestSuite extends TestBase {

    HomePage homePage=new HomePage();
    ComputersPage computersPage = new ComputersPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage=new BuildYourOwnComputerPage();
    CartPage cartPage=new CartPage();
    LoginPage loginPage=new LoginPage();
    CheckOutPage checkOutPage=new CheckOutPage();
    CompletedPage completedPage=new CompletedPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {


        homePage.selectMenu("computers");
        Thread.sleep(2000);
        computersPage.clickOnDesktop();
        Thread.sleep(2000);
        desktopPage.selectSortByFilterZToA();
        Thread.sleep(3000);

        List<String>  productNameList=desktopPage.getProductNameList();
        List<String> sortedProductNameList = new ArrayList<>(productNameList);
        Collections.sort(sortedProductNameList, Collections.reverseOrder());
        Assert.assertEquals(sortedProductNameList,productNameList);

    }

    @Test

    public void verifyProductAddedToShoppingCartSuccessfully() throws InterruptedException {

        homePage.selectMenu("computers");
        Thread.sleep(2000);
        computersPage.clickOnDesktop();
        Thread.sleep(2000);

        desktopPage.selectSortByFilterAToZ();
        Thread.sleep(1000);
        desktopPage.clickOnAddToCartButtonForBuildYourOwnComputer();

        String expectedTextMessage="Build your own computer";
        String actualTextMessage=buildYourOwnComputerPage.getWelcomeText();
        Assert.assertEquals(expectedTextMessage,actualTextMessage);
        buildYourOwnComputerPage.select2_2GHzIntelPentiumDualCoreE2200Processor();
        buildYourOwnComputerPage.select8GBWhichAdd$60();
        Thread.sleep(4000);
        buildYourOwnComputerPage.clickOnRadioButton400GBHDDWhichAdd$100();
        buildYourOwnComputerPage.clickOnRadioButtonOSVistaPremium();
        buildYourOwnComputerPage.checkOnCheckBoxMicroSoftOffice();
        Thread.sleep(2000);
        buildYourOwnComputerPage.checkOnCheckBoxTotalCommander();
        Thread.sleep(3000);
        String expectedPrice="$1,475.00";
        String actualPrice=buildYourOwnComputerPage.getTextFromPrice();
        Assert.assertEquals(expectedPrice,actualPrice);
        buildYourOwnComputerPage.clickOnAddToCart();
        Thread.sleep(2000);
        String expectedAddToCartPopUpText ="The product has been added to your shopping cart";
        String actualAddToCartPopUpText =buildYourOwnComputerPage.getTextFromAddToCartPopup();
        Assert.assertEquals(expectedAddToCartPopUpText, actualAddToCartPopUpText);
        buildYourOwnComputerPage.setPopUpCloseButton();
        buildYourOwnComputerPage.mouseHoverOnShoppingCart();
        buildYourOwnComputerPage.clickOnGoToCartButton();

        String expectedWelcomeShoppingPageText="Shopping cart";
        String actualWelcomeShoppingPageText=cartPage.getWelcomeText();
        Assert.assertEquals(expectedWelcomeShoppingPageText,actualWelcomeShoppingPageText);
        Thread.sleep(2000);
        cartPage.changeQuantityOfSelectedProduct();
        cartPage.clickOnUpdateShoppingCart();
        Thread.sleep(2000);
        String expectedTotalPrice="$2,950.00";
        String actualTotalPrice=cartPage.getTextFromTotalPrice();
        Assert.assertEquals(expectedTotalPrice,actualTotalPrice);
        cartPage.clickOnTermsOfService();
        cartPage.clickOnCheckOutButton();
        Thread.sleep(3000);
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage);

        loginPage.clickOnCheckOutAsGuestButton();

        Thread.sleep(5000);
        checkOutPage.enterFirstName("Harry");
        checkOutPage.enterLastName("Potter");
        checkOutPage.enterEmailID("harryPotter");
        checkOutPage.selectCountryFromDropDown("United Kingdom");
        Thread.sleep(3000);
        checkOutPage.enterCityName("Leicester");
        checkOutPage.enterAddress("75,Corporation road");
        checkOutPage.enterPostCode("LE45NJ");
        checkOutPage.enterPhoneNumber("07896543215");
        checkOutPage.clickOnContinueButton();
        Thread.sleep(3000);
        checkOutPage.selectNextDayAirRadioButton();
        checkOutPage.clickOnShippingContinueButton();
        Thread.sleep(2000);
        checkOutPage.selectCreditCardRadioButton();
        checkOutPage.clickOnPaymentContinueButton();
        Thread.sleep(3000);
        checkOutPage.selectMasterCardFromDropDown();
        Thread.sleep(2000);
        checkOutPage.enterCardHolderName("Harry Potter");
        checkOutPage.enterCardNumber("5465222828379708");
        checkOutPage.enterExpireMonth("01");
        Thread.sleep(2000);
        checkOutPage.enterExpireYear("2022");
        checkOutPage.enterCardCode("283");
        Thread.sleep(2000 );
        checkOutPage.clickOnPaymentConfirmationButton();
        Thread.sleep(3000);
        String expectedPaymentMethodText="Payment Method: Credit Card";
        String actualPaymentMethodText=checkOutPage.getTextFromPaymentMethod();
        Assert.assertEquals(expectedPaymentMethodText,actualPaymentMethodText);
        String expectedShippingMethodText="Shipping Method: Next Day Air";
        String actualShippingMethodText=checkOutPage.getTextFromShippingMethod();
        Assert.assertEquals(expectedShippingMethodText,actualShippingMethodText);
        String expectedTotalPriceText="$2,950.00";
        String actualTotalPriceText=checkOutPage.getTextFromTotalPrice();
        Assert.assertEquals(expectedTotalPriceText,actualTotalPriceText);
        checkOutPage.clickOnConfirmOrderButton();

        Thread.sleep(5000);
        String expectedTextFromThankYou="Thank you";
        String actualTextFromThankYou=completedPage.getTextFromThankYou();
        Assert.assertEquals(expectedTextFromThankYou,actualTextFromThankYou);
        String expectedTextOfOrderConformation="Your order has been successfully processed!";
        String actualTextOfOrderConfirmation=completedPage.getTextOfOrderConfirmation();
        Assert.assertEquals(expectedTextOfOrderConformation,actualTextOfOrderConfirmation);
        completedPage.clickOnContinueButton();

        Thread.sleep(4000);
        String expectedWelcomeText="Welcome to our store";
        String actualWelcomeText=homePage.getWelcomeText();
        Assert.assertEquals(expectedWelcomeText,actualWelcomeText);

    }

}
