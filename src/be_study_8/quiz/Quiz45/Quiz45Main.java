package be_study_8.quiz.Quiz45;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class Quiz45Main {

	public static void main(String[] args) {
		
		System.out.println("---1. 단일 행을 읽어서 리턴해서 출력하기---");
		Product product1 = findProductByP_Code(100);
		
		if(product1 != null) {
			System.out.println(product1.toString());
		}else {
			System.out.println("해당 상품은 존재하지 않습니다");
		}
		System.out.println();
		
		
		System.out.println("---2. 객체 리스트 단위로 리턴해서 출력하기---");
		List<Product> productList = findProductList();

		if (productList != null && productList.size() > 0) {
			for (Product p : productList) {
				System.out.println(p.toString());
			}
		} else {
			System.out.println("데이터가 없습니다");
		}
	}

	public static Product findProductByP_Code(int p_code) {

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

		Product product = null;

		String sqlQuery = " select * from product where p_code = ? ";

		try {
			psmt = conn.prepareStatement(sqlQuery);

			psmt.setInt(1, p_code);

			rs = psmt.executeQuery();

			if (rs.next()) {

				product = new Product();

				product.setP_code( rs.getInt("p_code") );
				product.setP_name( rs.getString("p_name") );
				product.setP_price( rs.getInt("p_price") );

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
		
		return product;

	}

	public static List<Product> findProductList() {

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

		String sqlQuery = " select * from Product ";

		List<Product> productList = null;

		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) {

				Product product = new Product();

				product.setP_code(rs.getInt("p_code"));
				product.setP_name(rs.getString("p_name"));
				product.setP_price(rs.getInt("p_price"));

				if (productList == null) {
					productList = new ArrayList<>();
				}
				productList.add(product);

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

		return productList;
	}

}