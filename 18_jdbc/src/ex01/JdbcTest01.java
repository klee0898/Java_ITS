package ex01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest01 {
	public static void main(String[] args) throws Exception{
		// #1. Connection : 데이터베이스 접속(연결) 객체
		Connection conn= DbConn.getConnection();
		System.out.println("~~~데이터베이스 접속 성공");
		
//		String sql = "SELECT employee_id, first_name from employees";
		String sql = "SELECT employee_id, first_name From employees "
				+ "WHERE first_name='William'";
		// #2. Statement : SQL을 실행하는 객체 생성
		Statement stmt = conn.createStatement();
		// ResultSet : SQL 실행결과를 저장하고 처리하는 객체
		// #3. executeQuery() : select문을 실행하고 결과 집합을 반환
		ResultSet rs= stmt.executeQuery(sql);
		
		// #4. rs.next() : 다음 행으로 커서(포인터)를 이동, 값이 있으면 true, 없으면 false반환
		while(rs.next()) { 
								// getString(1): 1번째 컬럼을 문자열로 가져옴, 
//			System.out.println(rs.getString(1) + " "+rs.getString(2));
			// 컬럼명을 명시하는 것이 좋다.
			System.out.println(rs.getString("employee_id") + " "+rs.getString("first_name"));
			
		}
	}
}
