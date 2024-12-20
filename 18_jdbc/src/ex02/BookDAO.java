package ex02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	
	//	DB에 도서 등록 
    //	매개변수로 BookDTO를 전달 받는다.
  public int insertBook(BookDTO dto) {
      int n = 0;
      try {
         conn = DbConn.getConnection();
         sql = "INSERT INTO book"
               + " VALUES(book_seq.nextVal,?,?,?,?)";
         ps = conn.prepareStatement(sql);
         ps.setString(1, dto.getTitle());
         ps.setString(2, dto.getAuthor());
         ps.setString(3, dto.getPub_year());
         ps.setInt(4, dto.getPrice());
         
         n = ps.executeUpdate(); // sql 실행(db에 전송)
      } catch (Exception e) {         
         e.printStackTrace();
      } finally {
         try {
            ps.close();
            conn.close();
         } catch (SQLException e) {            
            e.printStackTrace();
         }
      }
      return n;
   }

  	//	SQL DB에 도서LIST  조회
	public ArrayList<BookDTO> bookList() {
		// 도서를 담을 리스트 생성
		ArrayList<BookDTO> list = new ArrayList<BookDTO>();
		try {
			conn = DbConn.getConnection();
			sql = "SELECT * FROM book";
			ps = conn.prepareStatement(sql);
			
			ps.executeQuery();
			rs = ps.executeQuery();	
			// list에 DB에서 가져온 도서를 담기
			while(rs.next()) {
				// 한권의 책정보를 dto로 묶기
				BookDTO dto = new BookDTO();
				//rs 각행의 컬럼을 각각 읽어와서 dto에 셋팅
				
				dto.setBno(rs.getInt("bno"));
				dto.setTitle(rs.getString("title"));
				dto.setAuthor(rs.getString("author"));
	            dto.setPub_year(rs.getString("pub_year"));
	            dto.setPrice(rs.getInt("price"));
	            
	            // 위의 셋팅된 dto를 리스트에 추가
	            list.add(dto);
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
//	SQL DB에 도서수정
	public int updateBook(BookDTO dto) {
		int n = 0;
	      try {
	         conn = DbConn.getConnection();
	         sql = "UPDATE book SET pub_year=?, price=? "
	               + "WHERE bno=?";
	         ps = conn.prepareStatement(sql);
	         ps.setString(1, dto.getPub_year());
	         ps.setInt(2, dto.getPrice());
	         ps.setInt(3, dto.getBno());
	         
	         n = ps.executeUpdate();
	      } catch (Exception e) {         
	         e.printStackTrace();
	      } finally {
	         try {
	            // 생성된 순서의 역순으로 close처리 한다.
	            ps.close();
	            conn.close();
	         } catch (SQLException e) {
	            e.printStackTrace();
	         }
	      }
	      
	      return n;
	}
	// SQL DB에 도서삭제
	public int deleteBook(int bno) {
		// TODO Auto-generated method stub
		int n = 0;
	      try {
	         conn = DbConn.getConnection();
	         sql = "DELETE FROM book "
	               + "WHERE bno=?";
	         ps = conn.prepareStatement(sql);
	         ps.setInt(1, bno);
	        
	         
	         n = ps.executeUpdate();
	      } catch (Exception e) {         
	         e.printStackTrace();
	      } finally {
	         try {
		            // 생성된 순서의 역순으로 close처리 한다.
		            ps.close();
		            conn.close();
		         } catch (SQLException e) {
		            e.printStackTrace();
		         }
	      }
	      return n;
	}
	// SQL DB에 도서검색
			public ArrayList<BookDTO> selectBook(String title) {
				// 도서를 담을 리스트 생성
				ArrayList<BookDTO> list = new ArrayList<BookDTO>();
				try {
					conn = DbConn.getConnection();
					sql = "SELECT * FROM book WHERE title =?";
					ps = conn.prepareStatement(sql);
					ps.setString(1, title);
					
					rs = ps.executeQuery();	
					// list에 DB에서 가져온 도서를 담기
					while(rs.next()) {
						// 한권의 책정보를 dto로 묶기
						BookDTO dto = new BookDTO();
						//rs 각행의 컬럼을 각각 읽어와서 dto에 셋팅
						
						dto.setBno(rs.getInt("bno"));
						dto.setTitle(rs.getString("title"));
						dto.setAuthor(rs.getString("author"));
			            dto.setPub_year(rs.getString("pub_year"));
			            dto.setPrice(rs.getInt("price"));
			            
			            // 위의 셋팅된 dto를 리스트에 추가
			            list.add(dto);
					}

					
				} catch (Exception e) {
					e.printStackTrace();
			} finally {
				try {
					 // 생성된 순서의 역순으로 close처리 한다.
					rs.close();
					ps.close();
					conn.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
			
			return list;
		}
			 
}
  
