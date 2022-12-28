package files;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dynamicjson {
	
	@Test(dataProvider="Book Data")
	
	public void addBook(String isbn,String ailse) {
		RestAssured.baseURI = "http://216.10.245.166";
		String response= given().log().all().headers("Cotent-Type","application/json")
		.body(payload.AddBook("java3","1211"))
		.when().post("Library/Addbook.php").then()
		.assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js= ReUsableMethods.rawToJson(response);
		String id=js.get("ID");
		System.out.println(id);
		
	}
	
	@DataProvider(name="Book Data")
	public Object[][] getData(){
		
	return new Object[][]{ {"java1","1220"},{"java2","1320"},{"java","1410"} };
	
		
	}

}
