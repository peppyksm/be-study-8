package be_study_8.quiz.quiz48;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be_study_8.db.v3.DBConnectionManager;


public class StudentDAO {
	
	public List<StudentDTO> findStudentByDeptno(int deptno1) {

		// db 연결, 실행 객체
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		// 실행할 쿼리 준비
		String sqlQuery = " select s.studno, s.name, s.total, h.grade "
				+ "from "
				+ "(select sd.studno, sd.name, sr.total from student sd, score sr "
				+ "where sd.studno = sr.studno and sd.deptno1 = ?) s, hakjum h "
				+ "where s.total between h.min_point and h.max_point " ;

		List<StudentDTO> studentList = new ArrayList<StudentDTO>(); 

		// 쿼리 실행, 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, deptno1);
			rs = psmt.executeQuery();

			while(rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다

				StudentDTO studentDTO = new StudentDTO();
				
				studentDTO.setStudno(rs.getInt("studno"));
				studentDTO.setName(rs.getString("name"));
				studentDTO.setTotal(rs.getInt("total"));
				studentDTO.setGrade(rs.getString("grade"));
				
				studentList.add(studentDTO);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return studentList;

	}
}
