package be_study_8.db.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import be_study_8.quiz.Quiz45.Product;

public class DBSamplemain {

	public static void main(String[] args) {
		
		//DB dept 테이블 관련 데이터 접근 담당 객체
		DeptDAO deptDAO = new DeptDAO();

		Dept dept1 = deptDAO.findDeptByDeptno(30);
		System.out.println(dept1.getDname());
		System.out.println(dept1.getDeptno());
		System.out.println(dept1.toString());
		
		Dept dept2 = deptDAO.findDeptByDeptno(90);
		if(dept2 == null) {
			System.out.println("90번에 해당하는 데이터 없음");
		}else {
			System.out.println(dept2.toString());
		}
		
		Dept dept3 = deptDAO.findDeptByDname("ACCOUNTING");
		System.out.println(dept3.toString());
		
		
		Dept dept4 = deptDAO.findDeptByDname("REST");
		if(dept4 == null) {
			System.out.println("해당 부서는 없습니다");
		}else {
			System.out.println(dept4.toString());
		}
		
		List<Dept> deptList = deptDAO.findDeptList();
		
		
		if(deptList != null) {

			for(Dept d : deptList) {
				System.out.println(d.toString());
			}
		}
		
		
		System.out.println("=================================================");
		
		
		ProductDAO productDAO = new ProductDAO();
		
		System.out.println("---1. 단일 행을 읽어서 리턴해서 출력하기---");
		Product product1 = productDAO.findProductByP_Code(100);
		
		if(product1 != null) {
			System.out.println(product1.toString());
		}else {
			System.out.println("해당 상품은 존재하지 않습니다");
		}
		System.out.println();
		
		
		System.out.println("---2. 객체 리스트 단위로 리턴해서 출력하기---");
		List<Product> productList = productDAO.findProductList();

		if (productList != null && productList.size() > 0) {
			for (Product p : productList) {
				System.out.println(p.toString());
			}
		} else {
			System.out.println("데이터가 없습니다");
		}
	}
}