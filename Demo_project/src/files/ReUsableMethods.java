package files;

import io.restassured.path.json.JsonPath;

public class ReUsableMethods {

	public static  JsonPath rawToJson(String Response) {
		// TODO Auto-generated method stub
		JsonPath js1 =new JsonPath(Response);
		return js1;
	}

}
