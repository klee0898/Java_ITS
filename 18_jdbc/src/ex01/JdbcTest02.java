package ex01;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

//문제 > 검색할 사원의 이름을 입력받아서 사번, 이름, 입사일을 출력하시오.
//(단, 없으면 "해당 직원이 존재하지 않습니다" 출력)
public class JdbcTest02 {

	public static void main(String[] args) throws Exception {
		Connection conn = DbConn.getConnection();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 사원 이름 입력하시오 >>");
		String searchName = sc.next();
		
//		String sql = "SELECT employee_id, first_name, hire_date"
//				+ "FROM employees "
//				+ "WHERE first_name ='"+searchName+"'";
				
//		Statement stmt = conn.createStatement();	
//		ResultSet rs = stmt.executeQuery(sql);
		
		String sql = "SELECT employee_id, first_name, hire_date "
				+ "FROM employees "
				+ "WHERE first_name =?";
		
//		성능, 보안 측면에서 Statement보다 우수함 
//		execyteQuery
		
		PreparedStatement ps = conn.prepareStatement(sql);
//		1은 첫번째 ?를 의미
		ps.setString(1, searchName);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			System.out.println(rs.getString("employee_id") +
					" "+rs.getString("first_name")+
					" "+ rs.getNString("hire_date"));
		}else {
			System.out.println("해당 직원이 존재하지 않습니다~~~");
		}
		
		// TODO Auto-generated method stub

	}

}
