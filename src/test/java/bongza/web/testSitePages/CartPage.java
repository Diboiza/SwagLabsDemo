package bongza.web.testSitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    protected WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        if (!driver.getTitle().equals("Swag Labs")) {
            throw new IllegalStateException(
                    "this is not sign in page" + "current page is:" + driver.getCurrentUrl());
        }
    }

    private By removeBtn = By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]");
    private By continueShopBtn = By.xpath("//*[@id=\"continue-shopping\"]");
    private By checkoutBtn = By.xpath("//*[@id=\"checkout\"]");

    public CheckoutPage checkout(){
        driver.findElement(checkoutBtn).click();

        return new CheckoutPage(driver);
    }



}
