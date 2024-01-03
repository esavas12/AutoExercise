package stepDefinitions.apiStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;

public class CommonApiSteps {
    Response response;
    @Given("user gets all {string} api")
    public void user_gets_all_api(String apiType) {
        //Set the url
        String url = ConfigReader.getProperty("apiBaseUri");

        //Set the expected data

        //Send the request and get the response
        response = given().get(url+apiType);
        response.prettyPrint();
    }

    @Then("status code should be {int}")
    public void status_code_should_be(int statusCodeExpected) {
        int actualResponseCode = response.statusCode();
        System.out.println(statusCodeExpected+" => "+actualResponseCode );
        Assert.assertEquals(statusCodeExpected,actualResponseCode);
    }

}
