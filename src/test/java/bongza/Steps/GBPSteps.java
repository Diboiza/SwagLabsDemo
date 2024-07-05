package bongza.Steps;

import bongza.Test.GBPRateTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.MatcherAssert.assertThat;

public class GBPSteps {

    GBPRateTest api = new GBPRateTest();
    String _rate;
    ValidatableResponse[] rate = new ValidatableResponse[1];
    @Given("user call the API")
    public void user_call_the_api() {
        rate = api.getGBPPrice();
        _rate = rate[0].extract().path("bpi.GBP.rate");

    }
    @Then("rate should be return successfully")
    public void rate_should_be_return_successfully() {
        System.out.println(_rate);
    }
}
