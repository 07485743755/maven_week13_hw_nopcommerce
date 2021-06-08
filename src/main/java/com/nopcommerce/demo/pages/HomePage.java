package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By computersLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']");
    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']");
    By apparelLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']");
    By digitalDownloadLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']");
    By booksLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']");
    By jewelryLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']");
    By giftCardsLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']");
    By pageTitleText = By.xpath("//div[@class='page-title']");
    By welcomeText=By.xpath("//h2[text()='Welcome to our store']");

    public String selectMenu(String menu) {
        List<WebElement> menuList = driver.findElements(By.xpath("//div[@class='header-menu']/ul[1]/li/a"));
        String expectedText = null;
        for (WebElement element : menuList) {
            if (element.getText().equalsIgnoreCase(menu)) {
                expectedText = element.getText();
                element.click();
                break;
            }
        }
        return expectedText;
    }

    public String getActualText() {
        return waitUntilVisibilityOfElementLocated(pageTitleText, 30).getText();
    }

    public String getWelcomeText(){
        return getTextFromElement(waitUntilVisibilityOfElementLocated(welcomeText,20));
    }

}
