package bongza.Steps;

import bongza.web.testSitePages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class PurchaseSteps {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    OverviewPage overviewPage;
    CompletePage completePage;

    public PurchaseSteps(){
      driver  = WebDriverManager.chromedriver().create();
      loginPage = new LoginPage(driver);
    }


    @Given("User logins to site with {string} and {string}")
    public void user_logins_to_site_with_test_user_and_tester5027(String username, String password) {
        homePage = loginPage.loginValidUser(username, password);
    }

    @When("they order items")
    public void they_order_items() {
      cartPage = homePage.addItemsAndCheckout();
    }

    @And("Places an order")
    public void Places_an_order() {
      checkoutPage =  cartPage.checkout();
    }


    @And("capture the checkout information {string} and {string} and {string}")
    public void captureTheCheckoutInformationAndAnd(String firstname, String lastname, String zipcode) {
       overviewPage = checkoutPage.fillInfoCheckoutInfo(firstname, lastname, zipcode);
    }

    @And("Completes the order")
    public void completesTheOrder() {
        completePage = overviewPage.finishOrder();
    }


    @Then("the order should be processed")
    public void theOrderShouldBeProcessed() {
        completePage.getMessageText();
    }
}
