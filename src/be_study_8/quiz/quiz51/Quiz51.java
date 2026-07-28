package be_study_8.quiz.quiz51;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Quiz51 {

	public static void main(String[] args) {
		String jsonString = "{"
				+ "\"employees\": ["
				+ "{"
				+ "\"id\": 1,"
				+ "\"name\": \"홍길동\","
				+ "\"position\": \"개발자\","
				+ "\"salary\": 50000,"
				+ "\"skills\": [\"Java\", \"Python\", \"SQL\"]"
				+ "},"
				+ "{"
				+ "\"id\": 2,"
				+ "\"name\": \"김철수\","
				+ "\"position\": \"디자이너\","
				+ "\"salary\": 40000,"
				+ "\"skills\": [\"Photoshop\", \"Illustrator\"]"
				+ "}"
				+ "],"
				+ "\"company\": {"
				+ "\"name\": \"주식회사 ABC\","
				+ "\"address\": \"서울시 강남구\","
				+ "\"established\": \"1990-01-01\","
				+ "\"departments\": ["
				+ "{"
				+ "\"name\": \"개발부\","
				+ "\"employees\": [1, 3, 5]"
				+ "},"
				+ "{"
				+ "\"name\": \"디자인부\","
				+ "\"employees\": [2, 4]"
				+ "}"
				+ "]"
				+ "},"
				+ "\"projects\": ["
				+ "{"
				+ "\"title\": \"사내 시스템 개발\","
				+ "\"budget\": 100000,"
				+ "\"team\": [1, 3]"
				+ "},"
				+ "{"
				+ "\"title\": \"웹 디자인 프로젝트\","
				+ "\"budget\": 80000,"
				+ "\"team\": [2, 4]"
				+ "}"
				+ "]"
				+ "}";
		
		JSONParser parser = new JSONParser();
		
		try {
			
			JSONObject jsonObj = (JSONObject)parser.parse(jsonString);
			
			JSONArray employees = (JSONArray)jsonObj.get("employees");
			
			for(int i=0; i<employees.size(); i++) {
				JSONObject employee = (JSONObject)employees.get(i);
				
				System.out.println("-----employee----" + i);
				System.out.print("아이디 : " +employee.get("id"));
				System.out.print("이름 : " + employee.get("name"));
				System.out.print("포지션 :  " + employee.get("position"));
				System.out.print("연봉 : " + employee.get("salary"));
				System.out.println();	
			}		
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

	}

}
