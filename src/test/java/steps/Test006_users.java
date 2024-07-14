package steps;
import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Test006_users {
	boolean test=false;
	
	public String[] Test002User()
	{
		RestAssured.useRelaxedHTTPSValidation();
//		RestAssured.baseURI = "https://qa-investor-api.lendenclub.com/";
		Response response = given()
//				.param("partner_code", "")
				.header("Accept", ContentType.JSON.getAcceptHeader())
				.get("http://jsonplaceholder.typicode.com/users")
				.then().log().all()
				.extract().response();
		 String responseBody = response.prettyPrint();
	        System.out.println("Response Body: " + responseBody);

	        // Print the status code
	        int statusCode = response.getStatusCode();
	        System.out.println("Status Code: " + statusCode);

	        // Assert that the status code is 200
	        Assert.assertEquals(statusCode, 200, "Expected status code to be 200, but found: " + statusCode);

		return null;	
	}

}
