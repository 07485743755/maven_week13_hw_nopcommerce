package com.nopcommerce.demo.homePage;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testBase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestTopMenu extends TestBase {

    HomePage homepage=new HomePage();
    @Test
    public void selectMenuAndClick() throws InterruptedException {
      String expectedText=homepage.selectMenu("Computers");
      String actualText=homepage.getActualText();
      Assert.assertEquals(expectedText,actualText);

    }
}
