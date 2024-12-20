package movie03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ex02.DbConn;

public class MovieDAO {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	
//	1.DB에 영화등록 매개변수로  MovieDTO 로 전달받는다
  public int insertMovie(MovieDTO dto) {
      int n = 0;
      try {
         conn = DbConn.getConnection();
         sql = "INSERT INTO movie"
               + " VALUES(movie_seq.nextVal,?,?,?,?,?,?,?)";
         ps = conn.prepareStatement(sql);        
         ps.setString(1, dto.getM_name());
         ps.setString(2, dto.getSummary());
         ps.setString(3, dto.getRun_time());
         ps.setString(4, dto.getRelease());
         ps.setString(5, dto.getDirector());
         ps.setString(6, dto.getCast());
         ps.setInt(7, dto.getBox_office());
         
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
  
	//2.	SQL DB에 MOVIE수정=update
public int updateMovie(MovieDTO dto) {
	int n = 0;
    try {
       conn = DbConn.getConnection();
       sql = "UPDATE movie SET release =?, box_office=? "
             + "WHERE movie_num=?";
       ps = conn.prepareStatement(sql);        
       ps.setString(1, dto.getM_name());
       ps.setString(2, dto.getSummary());
       ps.setString(3, dto.getRun_time());
       ps.setString(4, dto.getRelease());
       ps.setString(5, dto.getDirector());
       ps.setString(6, dto.getCast());
       ps.setInt(7, dto.getBox_office());
       
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
    
	return 0;
}

public int deleteMovie(int movie_num) {
	// TODO Auto-generated method stub
	return 0;
}

//3.	SQL DB에 MOVIELIST  조회
//public ArrayList<MovieDTO> selectMovie(String title) {
//	// TODO Auto-generated method stub
//	return null;
//}
//
//// 5. 영화검색
//public int deleteMovie(int movie_num) {
//	// TODO Auto-generated method stub
//	return 0;
//}


	
			
			 
}
  
