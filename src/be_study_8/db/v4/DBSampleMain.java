package be_study_8.db.v4;
import java.util.List;

public class DBSampleMain {

	public static void main(String[] args) {
		
		//student
		//department
		
		//BE 프로세스
		
		//조회
		//조회.. DB 조회
		
		//FE 화면 전달
		
		int pk = 9411; //이전 사용중에 해당 학생 정보 조회 요청 -> pk 값 전달 받음
		
		// 1) 각자 조회해서 각각 객체 전달
		StudentDAO studentDAO = new StudentDAO();
		StudentDTO s1 = studentDAO.findStudentByStudno(pk);
		System.out.println(s1);
		
		// 학과 정보 조회 department
		// s1.getDeptno1() 학생의 전공번호 deptno1 조회 가능
		// deptno pk 값으로 조회
		DepartmentDAO departmentDAO = new DepartmentDAO();
		DepartmentDTO d1 = departmentDAO.findDeptmentByDeptno(s1.getDeptno1());
		
		System.out.println(d1);
		
		
		StudentMyPageDTO smDTO = studentDAO.findStudentMypageByStudno(pk);
		System.out.println(smDTO);
		
		
		
		// 2) JOIN 쿼리 포함해서 한번에 합쳐진 DTO 객체로 전달
	}

}
