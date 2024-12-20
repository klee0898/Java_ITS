package movie03;

import java.util.Scanner;

public class MovieController {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 MovieView mv = new MovieView();
		 
		 int selMenu;
		 while(true) {
			 mv.showMenu();
			 selMenu = sc.nextInt();		
			 
			 switch(selMenu) {
			 //	영화등록
			 case 1:
				 mv.insertMovie();
				 break;
			 case 2:
				 mv.updateMovie();
				 break;
			 case 3 :
				 mv.movieList();
				 break;
			 case 4 :
				 mv.deleteMovie();
				 break;
			 case 5 :
				 mv.searchMovie();
				 break;
			 case 6 :
				 System.out.println("프로그램 종료~~~");
					System.exit(0);
				 break;
				 
			 }
		 } 
	}

}
