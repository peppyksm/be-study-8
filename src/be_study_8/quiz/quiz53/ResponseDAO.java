package be_study_8.quiz.quiz53;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ResponseDAO {
	
	public void saveResponse(ResponseDTO responseDTO) {

		// db 연결, 실행 객체
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		String sqlQuery = "INSERT into 초미세먼지주간예보조회 (발표일시, 예보일시, 예보)"
				+ "VALUES (?, ?, ?)";
		


		// 쿼리 실행, 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);

			psmt.setString(1, responseDTO.body.items.get(0).getPresnatnDt());
			psmt.setString(2, responseDTO.body.items.get(0).getFrcstOneDt());
			psmt.setString(3, responseDTO.body.items.get(0).getFrcstOneCn());

			rs = psmt.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

	}


	
}
