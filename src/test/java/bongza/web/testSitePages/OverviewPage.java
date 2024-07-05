package bongza.web.testSitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {

    WebDriver driver;

    public OverviewPage(WebDriver driver){
        this.driver = driver;
        if (!driver.getTitle().equals("Swag Labs")) {
            throw new IllegalStateException(
                    "this is not sign in page" + "current page is:" + driver.getCurrentUrl());
        }
    }

    private By finishBtn = By.xpath("//*[@id=\"finish\"]");

    public CompletePage finishOrder(){
        driver.findElement(finishBtn).click();
        return new CompletePage(driver);
    }
}
