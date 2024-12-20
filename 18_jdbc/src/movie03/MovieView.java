package movie03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import ex02.BookDTO;

public class MovieView {
		Scanner sc = new Scanner(System.in);
		MovieDAO dao = new MovieDAO();
		
		// 메뉴 표시 
		public void showMenu() {
		
		System.out.println("\n--------- 메뉴 -------\n"
	            + "1. 영화등록\t 2.영화수정\n"
	            + "3. 영화리스트\t 4.영화삭제\n"
	            + "5. 영화검색\t 6.종료");

		System.out.println("\n-----------\n");
		System.out.println("메뉴를 선택하세요 ~~~ ");
	}
		// 1.영화등록
		public void insertMovie() {
			MovieDTO dto = new MovieDTO();	
			// movie data를 dto 입력데이터 묶어줌
			System.out.println("영화명");
			dto.setM_name(sc.next());			
			System.out.println("줄거리");
			dto.setSummary(sc.next());
			System.out.println("상영시간");
			dto.setRun_time(sc.next());
			System.out.println("개봉일");
			dto.setRelease (sc.next());
			System.out.println("감독");
			dto.setDirector(sc.next());
			System.out.println("출연진");
			dto.setCast(sc.next());
			System.out.println("관객수");
			dto.setBox_office(sc.nextInt());

			//   위의 셋팅된  DTO 를 DAO에 전달
		
			int n = dao.insertMovie(dto);
			if(n>0) {
				System.out.println("영화등록 완료!!");
			}else {
				System.out.println("영화등록 실패!!");
			}

			
		}
		// 2.영화수정
		public void updateMovie() {
			MovieDTO dto = new MovieDTO();	
			// movie data를 dto 입력데이터 묶어줌
			System.out.println("영화명");
			dto.setM_name(sc.next());			
			System.out.println("줄거리");
			dto.setSummary(sc.next());
			System.out.println("상영시간");
			dto.setRun_time(sc.next());
			System.out.println("개봉일");
			dto.setRelease (sc.next());
			System.out.println("감독");
			dto.setDirector(sc.next());
			System.out.println("출연진");
			dto.setCast(sc.next());
			System.out.println("관객수");
			dto.setBox_office(sc.nextInt());

			//   위의 셋팅된  DTO 를 DAO에 전달
		
			int n = dao.updateMovie(dto);
			if(n>0) {
				System.out.println("영화수정 완료!!");
			}else {
				System.out.println("영화수정 실패!!");
			}
		}
		// 3.영화리스트 출력
		public void movieList() {
			MovieDTO dto = new MovieDTO();	
			// list  : dao에서 반환받은 movie list
			ArrayList<MovieDTO> list = dao.movieList();
			
			Iterator<MovieDTO> it = list.iterator();
			
			while(it.hasNext()) {
				MovieDTO book = it.next();
				System.out.println(movie);
			}
		}

		//4.영화삭제
		public void deleteMovie() {
		      System.out.println("영화번호");
		      int movie_num = sc.nextInt();
		      int n = dao.deleteMovie(movie_num);
		      
		      System.out.println(n);
		      
		      if(n>0) {
		         System.out.println("영화삭제 완료!!");
		      } else {
		         System.out.println("영화삭제 실패!!");
		      }
		   }
		
		  // 5.영화명으로 검색
		public void searchMovie() {
		   	
		      System.out.println("영화명 입력 ");
		      String title = sc.next();
		      ArrayList<MovieDTO> list = dao.selectMovie(title);
		     for(int i =0; i<list.size(); i++) {
		    	  System.out.println(list.get(i));
		    	 
		
			
			}

			
		}
		
}