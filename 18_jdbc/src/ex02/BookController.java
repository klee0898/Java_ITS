package ex02;

import java.util.Scanner;

public class BookController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 BookView bv = new BookView();
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int selMenu;
		 while(true) {
			 bv.showMenu();
			 selMenu = sc.nextInt();		
			 
			 switch(selMenu) {
			 case 1:
				 bv.insertBook();
				 break;
				 
				 //	도서수정
			 case 2:
				 bv.updateBook();
				 break;
				 
			 case 3:
				 bv.bookList();
				 break;
				 
			 case 4:
				 bv.deleteBook();
				 break;
				 
			 case 5:
				 bv.searchBook();
				 break;
				 
			 case 6:
				System.out.println("프로그램 종료~~~");
				System.exit(0);
				break;
			 }
		 }
	}

}
