package bongza.Test;

import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;


public class GBPRateTest {

//    RestAssured.ba
ValidatableResponse[] rate = new ValidatableResponse[1];
    public ValidatableResponse[] getGBPPrice(){
      rate[0] = given().get("https://api.coindesk.com/v1/bpi/currentprice.json")
             .then().log().body();
        return rate;
    }
}
