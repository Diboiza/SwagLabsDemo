package bongza.web.testSitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    protected WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        driver.get("https://www.saucedemo.com/");
        if(!driver.getTitle().equals("Swag Labs")){
            throw new IllegalStateException(
                    "this is not sign in page" + "current page is:" + driver.getCurrentUrl());
        }
    }
    private By usernameField = By.xpath("//*[@id=\"user-name\"]");

    private By passwordField = By.xpath("//*[@id=\"password\"]");

    private By loginBtn = By.xpath("//*[@id=\"login-button\"]");



    public HomePage loginValidUser(String username, String password){

        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginBtn).click();
        return new HomePage(driver);
    }



}
