package be_study_8.quiz.Quiz46;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;





public class Quiz46Main2 {

	public static void main(String[] args) {
		
		List<Professor> professorList = findProfessorListByDeptno(111);

		if (professorList != null && professorList.size() > 0) {
			for (Professor p : professorList) {
				System.out.println(p.toString());
			}
		} else {
			System.out.println("그런 교수는 없습니다");
		}
		

	}
	
	public static List<Professor> findProfessorListByDeptno(int deptno) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}


		String sqlQuery = " select * from professor where deptno = ? ";
		
		List<Professor> professorList = null;
		
		try {
			psmt = conn.prepareStatement(sqlQuery);

			psmt.setInt(1, deptno);

			rs = psmt.executeQuery();

			while (rs.next()) {

				Professor professor = new Professor();

				professor.setProfno( rs.getInt("profno") );
				professor.setName( rs.getString("name") );
				professor.setId( rs.getString("id") );
				professor.setPosition( rs.getString("position") );
				professor.setPay( rs.getInt("pay") );
				professor.setDeptno( rs.getInt("deptno") );
				
				if (professorList == null) {
					professorList = new ArrayList<>();
				}
				professorList.add(professor);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (rs != null)
				rs.close();

			if (psmt != null)
				psmt.close();

			if (conn != null)
				conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return professorList;

	}
	
}