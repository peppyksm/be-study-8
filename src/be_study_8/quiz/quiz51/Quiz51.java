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
				JSONObject emp = (JSONObject)employees.get(i);
				System.out.print("ID:" +emp.get("id") + " ");
				System.out.print("이름:" + emp.get("name") + " ");
				System.out.print("포지션:" + emp.get("position") + " ");
				System.out.print("연봉:" + emp.get("salary") + " ");
				
				JSONArray skills = (JSONArray)emp.get("skills");
				
				System.out.print("보유 스킬:");
				
				for(int j = 0 ; j < skills.size(); j++) {
					System.out.print(skills.get(j) + " ");
				}
				System.out.println();
			}	
			
			
			
			
			JSONObject company = (JSONObject)jsonObj.get("company");
			
			System.out.print(company.get("name") + " ");
			System.out.print(company.get("address") + " ");
			System.out.println(company.get("established"));
			
			JSONArray departments = (JSONArray)company.get("departments");
			
			for(int i = 0; i < departments.size(); i++) {
				JSONObject dept = (JSONObject)departments.get(i);
				
				System.out.print(dept.get("name") + " ");
				JSONArray emps = (JSONArray)dept.get("employees");
				for(int j = 0; j < emps.size(); j++) {
					System.out.print(emps.get(j) + "번 사원 ");
				}
				System.out.println();
			}
			
			
			
			
			
			JSONArray projects = (JSONArray)jsonObj.get("projects");
			
			for(int i = 0; i < projects.size(); i++) {
				JSONObject pro = (JSONObject)projects.get(i);
				
				System.out.print("프로젝트:" + pro.get("title") + " ");
				System.out.print("예산:" + pro.get("budget") + " ");
				JSONArray team = (JSONArray)pro.get("team");
				System.out.print("소속 인원:");
				for(int j = 0; j < team.size(); j++) {
					System.out.print(team.get(j) + "번 사원 ");
				}
				System.out.println();
			}
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

	}

}
