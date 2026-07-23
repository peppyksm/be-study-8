package be_study_8.quiz.Quiz46;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Quiz46Main {

	public static void main(String[] args) {
		
		findProfessorListByDeptno(101);

	}
	
	public static void  findProfessorListByDeptno(int deptno) {

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


		try {
			psmt = conn.prepareStatement(sqlQuery);

			psmt.setInt(1, deptno);

			
			rs = psmt.executeQuery();

			while (rs.next()) {

				System.out.print(rs.getInt("profno") + " ");
				System.out.print(rs.getString("name") + " ");
				System.out.print(rs.getString("id") + " ");
				System.out.print(rs.getString("position") + " ");
				System.out.print(rs.getInt("pay") + " ");
				System.out.println(rs.getInt("deptno"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결 종료
		try { // null 객체 메소드 호출 = NullPointerException 발생

			if (rs != null)
				rs.close();

			if (psmt != null)
				psmt.close();

			if (conn != null)
				conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
