package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {

    By desktopLink=By.xpath("//h2[@class='title']/a[@href='/desktops']");
    HomePage homePage=new HomePage();

    public void clickOnComputerTab(){

        clickOnElement(waitUntilVisibilityOfElementLocated(homePage.computersLink,60));
    }

    public void clickOnDesktop(){

        clickOnElement(waitUntilVisibilityOfElementLocated(desktopLink,60));
    }
}
