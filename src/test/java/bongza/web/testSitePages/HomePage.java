package bongza.web.testSitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    protected WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        if(!driver.getTitle().equals("Swag Labs")){
            throw new IllegalStateException("This is not Inventory Page, Current page is: " + driver.getCurrentUrl());
        }
    }

    private By backPackBtn = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    private By bikeLightBtn = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
    private By cartLink = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    public CartPage addItemsAndCheckout(){
        driver.findElement(backPackBtn).click();
        driver.findElement(bikeLightBtn).click();
        driver.findElement(cartLink).click();

        return new CartPage(driver);
    }

}
