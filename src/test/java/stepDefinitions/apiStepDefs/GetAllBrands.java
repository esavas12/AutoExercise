package stepDefinitions.apiStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Assert.*;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;

public class GetAllBrands {

    Response response;

    @Given("user gets all brands")
    public void user_gets_all_brands() {
        //Set the url
        String url = "https://automationexercise.com/api/brandsList";

        //Set the expected data

        //Send the request and get the response
        response = given().get(url);
        response.prettyPrint();
    }


}
