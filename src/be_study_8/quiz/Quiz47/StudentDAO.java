package be_study_8.quiz.Quiz47;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import be_study_8.db.v3.DBConnectionManager;
import be_study_8.db.v3.ProfessorDTO;

public class StudentDAO {

	public List<StudentDTO> findStudentList() {
		
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();
		
		//실행할 쿼리 준비
		//String sqlQuery = " select * from professor ";
		//String sqlQuery = " select profno, name, id, hiredate from professor ";
		String sqlQuery = " select studno, name, id, grade, jumin ,"
				+ " TO_CHAR(birthday, 'yyyy-mm-dd') birthday,  "
				+ "			tel, height, weight, deptno1, deptno2, profno"		
				+ " from student ";
		
		List<StudentDTO> studentList = new ArrayList<StudentDTO>(); 
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		try {
			
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {   // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				// rs가 하나의 행을 가리키고, 열단위 값을 기준으로 조회
				//데이터가 있다.
				
				StudentDTO studentDTO = new StudentDTO();
				
				studentDTO.setStudno( rs.getInt("studno") );
				studentDTO.setName( rs.getString("name") );
				studentDTO.setId( rs.getString("id") );
				studentDTO.setGrade( rs.getInt("grade") );
				studentDTO.setJumin( rs.getString("jumin") );
				
				
				studentDTO.setBirthday(rs.getString("birthday"));
				
				studentDTO.setTel( rs.getString("tel") );
				studentDTO.setHeight( rs.getInt("height") );
				studentDTO.setWeight( rs.getInt("weight") );
				studentDTO.setDeptno1( rs.getInt("deptno1") );
				studentDTO.setDeptno2( rs.getInt("deptno2") );
				studentDTO.setProfno( rs.getInt("profno") );
				
				
				studentList.add(studentDTO);
			}
			
		} catch (SQLException e) { 
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return studentList;
		
	}
	
	public List<StudentDTO> findStudentListByGrade(int grade) {
		
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();
		
		//실행할 쿼리 준비
		//String sqlQuery = " select * from professor ";
		//String sqlQuery = " select profno, name, id, hiredate from professor ";
		String sqlQuery = " select studno, name, id, grade, jumin ,"
				+ " TO_CHAR(birthday, 'yyyy-mm-dd') birthday,  "
				+ "			tel, height, weight, deptno1, deptno2, profno"		
				+ " from student "
				+ " where grade = ? ";
		
		List<StudentDTO> studentList = new ArrayList<StudentDTO>(); 
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		try {
			
			psmt = conn.prepareStatement(sqlQuery);
			
			psmt.setInt(1, grade);
			
			rs = psmt.executeQuery();
			
			
			while(rs.next()) {   // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				// rs가 하나의 행을 가리키고, 열단위 값을 기준으로 조회
				//데이터가 있다.
				
				StudentDTO studentDTO = new StudentDTO();
				
				studentDTO.setStudno( rs.getInt("studno") );
				studentDTO.setName( rs.getString("name") );
				studentDTO.setId( rs.getString("id") );
				studentDTO.setGrade( rs.getInt("grade") );
				studentDTO.setJumin( rs.getString("jumin") );
				
				
				studentDTO.setBirthday(rs.getString("birthday"));
				
				studentDTO.setTel( rs.getString("tel") );
				studentDTO.setHeight( rs.getInt("height") );
				studentDTO.setWeight( rs.getInt("weight") );
				studentDTO.setDeptno1( rs.getInt("deptno1") );
				studentDTO.setDeptno2( rs.getInt("deptno2") );
				studentDTO.setProfno( rs.getInt("profno") );
				
				
				studentList.add(studentDTO);
			}
			
		} catch (SQLException e) { 
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return studentList;
		
	}
	
	public int saveStudent(StudentDTO studentDTO) {
		
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();
		
		//실행할 쿼리 준비
		//String sqlQuery = " select * from professor ";
		//String sqlQuery = " select profno, name, id, hiredate from professor ";
		String sqlQuery = " insert into student "
					+ " values ( ?, ?, ?, ?, ?, TO_DATE(?, 'yyyy-mm-dd'), ? ,?, ?, ?, ?, ? )";
		
		int result = 0;
		
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		try {
			
			psmt = conn.prepareStatement(sqlQuery);
			
			psmt.setInt(1, studentDTO.getStudno());
			psmt.setString(2, studentDTO.getName());
			psmt.setString(3, studentDTO.getId());
			psmt.setInt(4, studentDTO.getGrade());
			psmt.setString(5, studentDTO.getJumin());
			psmt.setString(6, studentDTO.getBirthday());
			
			
			psmt.setString(7, studentDTO.getTel());
			psmt.setInt(8, studentDTO.getHeight());
			psmt.setInt(9, studentDTO.getWeight());
			psmt.setInt(10, studentDTO.getDeptno1());
//			psmt.setInt(11, studentDTO.getDeptno2());
			
			
			
			
			//숫자값에 null이 필요하다면 조건문으로 set 타입을 바꿔줘야함
			if(studentDTO.getDeptno2() == null ) {
				psmt.setNull(11, Types.INTEGER);	//null 세팅
			}else {
				psmt.setInt(11, studentDTO.getDeptno2());
			}
			
			
			
			
			
			psmt.setInt(12, studentDTO.getProfno());
			
			
			
			rs = psmt.executeQuery();
			
			
			
		} catch (SQLException e) { 
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return result;
		
	}
}