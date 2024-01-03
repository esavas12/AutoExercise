package stepDefinitions.apiStepDefs;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GetAllPro {
    Response response;

    @Given("user gets all the products list")
    public void user_gets_the_room_data() {
        //Set the url
        String url = "https://automationexercise.com/api/productsList";


        //Set the expected data

        //Send the request and get the response
        Response response = given().get(url);
        response.prettyPrint();
    }
}
