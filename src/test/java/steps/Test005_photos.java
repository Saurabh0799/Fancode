package steps;
import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Test005_photos {
	boolean test=false;
	
	public String[] Test002Photo()
	{
		RestAssured.useRelaxedHTTPSValidation();
//		RestAssured.baseURI = "https://qa-investor-api.lendenclub.com/";
		Response response = given()
//				.param("partner_code", "")
				.header("Accept", ContentType.JSON.getAcceptHeader())
				.get("http://jsonplaceholder.typicode.com/photos")
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
