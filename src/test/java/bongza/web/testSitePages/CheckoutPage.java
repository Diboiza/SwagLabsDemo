package bongza.web.testSitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    protected WebDriver driver;

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
        if (!driver.getTitle().equals("Swag Labs")) {
            throw new IllegalStateException(
                    "this is not sign in page" + "current page is:" + driver.getCurrentUrl());
        }
    }

    private By firstnameField = By.xpath("//*[@id=\"first-name\"]");
    private By lastnameField = By.xpath("//*[@id=\"last-name\"]");
    private By zipcodeField = By.xpath("//*[@id=\"postal-code\"]");
    private By continueBtn = By.xpath("//*[@id=\"continue\"]");

    public OverviewPage fillInfoCheckoutInfo(String name, String lastname, String zipcode){
        driver.findElement(firstnameField).sendKeys(name);
        driver.findElement(lastnameField).sendKeys(lastname);
        driver.findElement(zipcodeField).sendKeys(zipcode);
        driver.findElement(continueBtn).click();

        return new OverviewPage(driver);
    }
}
