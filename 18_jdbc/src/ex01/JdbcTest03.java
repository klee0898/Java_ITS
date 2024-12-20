package ex01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcTest03 {
// java JDBC에서 DataBase 연결 자동설정은 자동커밋 ON
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = DbConn.getConnection();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("상품명을 입력하세요 >> ");
		String pName =sc.next();
		
		String sql = "INSERT INTO prod"
				+ " VALUES(prod_seq.nextVal, ?)";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1, pName);
//		executeQuery() : select
//		데이터베이스에 반영되 행의 수를 리턴
		int n = ps.executeUpdate();
//		DDL= insert, update. delete 
		
		System.out.println(n + " 개의 상품이  입력됨 >> ");
	}

}
