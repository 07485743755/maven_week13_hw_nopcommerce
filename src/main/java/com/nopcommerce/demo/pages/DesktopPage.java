package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    By sortFilterLink=By.id("products-orderby");
    By productNameListLink=By.xpath("//div[@class='product-grid']//h2");
    By buildYourOwnComputerLink=By.xpath("//a[contains(text(),'Build your own computer')]");
    By addToCartButtonForBuildYourOwnComputer=By.xpath("//div[@data-productid='1']//div[@class='buttons']");

    public void selectSortByFilterZToA(){

        selectByValueDropDown(waitUntilVisibilityOfElementLocated(sortFilterLink,30),"6");
    }

    public void selectSortByFilterAToZ(){

        selectByValueDropDown(waitUntilVisibilityOfElementLocated(sortFilterLink,40),"5");
    }

    public List<String> getProductNameList() throws InterruptedException {

        return setProductNameList(productNameListLink);
    }

    public void clickOnAddToCartButtonForBuildYourOwnComputer(){

        clickOnElement(waitUntilVisibilityOfElementLocated(addToCartButtonForBuildYourOwnComputer,20));
    }

}
