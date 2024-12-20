package ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookView {
		Scanner sc = new Scanner(System.in);
		BookDAO dao = new BookDAO();
		
		// 메뉴 표시 
		public void showMenu() {
		
		
		System.out.println("\n--------- 메뉴 -------\n"
	            + "1. 도서등록\t 2.도서수정\n"
	            + "3. 도서리스트\t 4.도서삭제\n"
	            + "5. 도서검색\t 6.종료");

		System.out.println("\n-----------\n");
		System.out.println("메뉴를 선택하세요 ~~~ >>");
	}
	  // 도서등록
		public void insertBook() {
			BookDTO dto = new BookDTO();	
			// dto 입력데이터 묶어줌
			System.out.println("도서명");
//			String title = sc.next();
//			dto.setTitle(title);
			// 위의 두줄과 동일 
			dto.setTitle(sc.next());
			
			System.out.println("저자명");
			dto.setAuthor(sc.next());
			System.out.println("출판년도");
			dto.setPub_year(sc.next());
			System.out.println("가격");
			dto.setPrice(sc.nextInt());
			
			//   위의 셋팅된  DTO 를 DAO에 전달 
			
			int n = dao.insertBook(dto);
			if(n>0) {
				System.out.println("도서등록 완료!!");
			}else {
				System.out.println("도서등록 실패!!");
			}

			
			}
		// 도서수정
		public void updateBook() {
		      BookDTO dto = new BookDTO();
		      
		      System.out.println("도서번호 >");
		      dto.setBno(sc.nextInt());
		      System.out.println("출판년도 >");
		      dto.setPub_year(sc.next());
		      System.out.println("가격 >");
		      dto.setPrice(sc.nextInt());
		      
		      int n = dao.updateBook(dto);
		      
		      if(n>0) {
		         System.out.println("도서수정 완료!!");
		      }else {
		         System.out.println("도서수정 실패!!");
		      }
		   }
		// 도서리스트 출력
		public void bookList() {
//			list  : dao에서 반환받은 도서리스트
			ArrayList<BookDTO> list = dao.bookList();
			
			Iterator<BookDTO> it = list.iterator();
			
			while(it.hasNext()) {
				BookDTO book = it.next();
				System.out.println(book);
			}
		}
		// 도서 삭제
		   public void deleteBook() {
			      System.out.println("도서번호");
			      int bno = sc.nextInt();
			      int n = dao.deleteBook(bno);
			      
			      System.out.println(n);
			      
			      if(n>0) {
			         System.out.println("도서삭제 완료!!");
			      } else {
			         System.out.println("도서삭제 실패!!");
			      }
			   }
		// 도서검색
		   public void searchBook() {
			   	  // 도서명으로 검색
			      System.out.println("도서명 입력 ");
			      String title = sc.next();
			      ArrayList<BookDTO> list = dao.selectBook(title);
			     for(int i =0; i<list.size(); i++) {
			    	  System.out.println(list.get(i));
			    	 
			     }
		   }	    		
	
}
