import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonparse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		JsonPath js=new JsonPath(payload.CoursePrice());
		//Print No of courses returned by API
		
				
		//print purchase amount
		
		//Print No of courses returned by API
		
		int count=	js.getInt("courses.size()");
		System.out.println(count);
		//Print Purchase Amount
		int totalAmount= js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
			
		//Print title of the first Courses
		
		
		
		String titlefristCourse= js.get("courses[0].title");
		System.out.println(titlefristCourse);
		
		//print All Course title and respective prices
		
		for(int i=0;i<count;i++) {
			
			String CourseTitles=js.get("courses["+i+"].title");
			System.out.println(js.get("courses["+i+"].price").toString());
			
			System.out.println(CourseTitles);
			
			
		}
		
		//print no of copies sold by RPA course
		
		System.out.println("print no of copies sold by RPA course");
		
		for(int i=0;i<count;i++) {
			String courseTitles= js.get("courses["+i+"].title");
			if(courseTitles.equalsIgnoreCase("RPA")) {
				int copies =js.get("courses["+i+"].copies");
				System.out.println(copies);
				break; 
			}
		}
		
	}

}
