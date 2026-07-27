package be_study_8.db.v4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import be_study_8.db.v3.DBConnectionManager;

public class DepartmentDAO {

	
	public DepartmentDTO findDeptmentByDeptno(int deptno) {
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		conn = DBConnectionManager.connectDB();

		String sqlQuery = " select * from department where deptno = ? ";
		
		DepartmentDTO departmentDTO = null;
		

		try {
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, deptno);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				departmentDTO = new DepartmentDTO();
				
				departmentDTO.setDeptno( rs.getInt("deptno") );
				departmentDTO.setDname( rs.getString("dname") );
				departmentDTO.setPart( rs.getInt("part") );
				departmentDTO.setBuild( rs.getString("build") );
			}
			
		} catch (SQLException e) { 
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return departmentDTO;
		
	}
	
}
