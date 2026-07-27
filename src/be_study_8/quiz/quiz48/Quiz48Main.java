package be_study_8.quiz.quiz48;

import java.util.List;

public class Quiz48Main {

	public static void main(String[] args) {
		
		int deptno = 101;
		
		StudentDAO studentDAO = new StudentDAO();
		List<StudentDTO> studentList = studentDAO.findStudentByDeptno(deptno);
//		System.out.println(s1.toString());
		
		for(StudentDTO s : studentList) {
			System.out.println(s.toString());
		}
	}

}