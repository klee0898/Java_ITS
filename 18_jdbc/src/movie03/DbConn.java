package movie03;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConn {
	// 드라이버 : 애플리케이션과 데이터베이스를 연결해주는 중간 프로그램
	// 오라클 서버에 접속해서 접속된 객체(Connection)를 반환해주는 메소드
	static Connection getConnection() throws Exception{
		// OracleDriver를 찾아서 드라이버 객체를 생성 후 DriverManger에 등록
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 오라클 서버 주소, 오라클 드라이버 중 thin 드라이버를 이용해서 접속
		String url = "jdbc:oracle:thin:@//localhost:1521/xe";
		
		// DriverManger : 드라이버를 관리하는 객체
		// 서버 접속 객체 얻어옴                         //서버주소, 계정, 비번    
		Connection conn= DriverManager.getConnection(url, "hr", "2521");
		
		return conn;
	}
}
