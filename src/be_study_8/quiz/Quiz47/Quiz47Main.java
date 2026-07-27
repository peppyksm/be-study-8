package be_study_8.quiz.Quiz47;

import java.util.List;

public class Quiz47Main {

	public static void main(String[] args) {


		DBConnectionManager.connectDB();
		
		StudentDAO studentDAO = new StudentDAO();
		
		List<StudentDTO> list1 = studentDAO.findStudentList();
		
		for(StudentDTO s : list1) {
			System.out.println(s.toString());
		}
		
		List<StudentDTO> list2 = studentDAO.findStudentListByGrade(4);
		
		for(StudentDTO s : list2) {
			System.out.println(s.toString());
		}
		
		StudentDTO st1 = new StudentDTO();
		
		st1.setStudno(9999);
		st1.setName("name");
		st1.setId("Id");
		st1.setGrade(5);
		st1.setJumin("0005311234567");
		st1.setBirthday("2000-05-31");
		st1.setTel("031-123-1234");
		st1.setHeight(190);
		st1.setWeight(90);
		st1.setDeptno1(401);
		st1.setDeptno2(501);
		st1.setProfno(9999);
		
		int result = studentDAO.saveStudent(st1);
		if(result > 0) {
			System.out.println("잘 만들어졌다");
		}
		
		StudentDTO st2 = new StudentDTO();
		
		st2.setStudno(9989);
		st2.setName("name2");
		st2.setId("Id2");
		st2.setGrade(5);
		st2.setJumin("0005311234567");
		st2.setBirthday("2000-05-31");
		//st2.setTel("031-123-1234");
		st2.setTel(null);
		st2.setHeight(190);
		st2.setWeight(90);
		st2.setDeptno1(401);
		//st2.setDeptno2(501);	//Deptno2	int d = null; 안됨
		st2.setDeptno2(null);
		st2.setProfno(9999);
		
		int result2 = studentDAO.saveStudent(st2);
		if(result2 > 0) {
			System.out.println("잘 만들어졌다");
		}

	}

}
