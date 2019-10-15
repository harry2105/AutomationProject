package automationTesting.restApiTesting;


import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.hamcrest.Matchers.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void getMethod(){
		
		RestAssured.baseURI="https://reqres.in";
		
		Response response=RestAssured.given().when().get("/api/users?page=2");
		int statusCode=response.getStatusCode();
		
		Assert.assertEquals(200, statusCode);
		
		
		//RestAssured.given().when().get("/api/users?page=2").then().assertThat().statusCode(200);
	}
}
