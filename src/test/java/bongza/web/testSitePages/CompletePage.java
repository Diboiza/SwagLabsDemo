package bongza.web.testSitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompletePage {
    protected WebDriver driver;

    public CompletePage(WebDriver driver){
        this.driver = driver;
        if (!driver.getTitle().equals("Swag Labs")) {
            throw new IllegalStateException(
                    "this is not sign in page" + "current page is:" + driver.getCurrentUrl());
        }
    }

    private By headerMessage = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");
    private By backHomeBtn = By.xpath("//*[@id=\"back-to-products\"]");

    public String getMessageText(){
        return driver.findElement(headerMessage).getText();
    }

}
