package example;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class simplePostexample {
    final static String ROOT_URI = "https://petstore.swagger.io/v2/pet";

    @Test
    public void simpleTest() {
        String reqBody = "{\"id\": 77232, \"name  \": \"Chens\",\"status\":\"alive\"}";
        Response response =
                given().contentType(ContentType.JSON) // Set headers
                        .body(reqBody).when().post(ROOT_URI);
// Print response of POST request
        String body = response.getBody().asPrettyString();
        System.out.println(body);

    }
}
