package stepDefinitions.apiStepDefs;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigReader;


import static io.restassured.RestAssured.given;

public class NotSupportedMessage {
    Response response;
    String expected = "responseCode: 405, message: This request method is not supported.";
    @Given("user posts to all products")
    public void user_posts_to_all_products_and_assert() {
        //Set the url
        String url = "https://automationexercise.com/api/productsList";

        //Set the expected data


        //Send the request and get the response
         response = given()
                .contentType(ContentType.JSON)
                .body(expected)
                .post(url);
        String responseBody = response.getBody().asString();
        System.out.println("Response Body: " + responseBody);

        //Assertion
        Assert.assertTrue(responseBody.contains("405"));
        Assert.assertTrue(responseBody.contains("This request method is not supported."));
    }

    @Given("user {string} to all {string}")
    public void user_to_all(String string, String string2) {
        String url = ConfigReader.getProperty("apiBaseUri");
        if(string=="posts") {
            response = given()
                    .contentType(ContentType.JSON)
                    .body(expected)
                    .post(url + string2);
            String responseBody = response.getBody().asString();
            System.out.println("Response Body: " + responseBody);
            //Assertion
            Assert.assertTrue(responseBody.contains("405"));
            Assert.assertTrue(responseBody.contains("This request method is not supported."));

        }else if (string=="puts"){
            response = given()
                    .contentType(ContentType.JSON)
                    .body(expected)
                    .put(url + string2);
            String responseBody = response.getBody().asString();
            System.out.println("Response Body: " + responseBody);
            //Assertion
            Assert.assertTrue(responseBody.contains("405"));
            Assert.assertTrue(responseBody.contains("This request method is not supported."));
        }



    }


}
