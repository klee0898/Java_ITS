package review;

import java.util.Scanner;

public class WhileTest {

	// main 메서드
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);		
			
			while(true) {
				System.out.println("아이디를 입력하세요 > ");
				String id = sc.next();
				
				// id가 test이고 pw가 1234면 로그인 성공
				if(id.equals("test")) { // 아이디가 일치하는 경우				
					while(true) {
						System.out.println("비밀번호를 입력하세요 > ");
						String pw = sc.next();
						
						if(pw.equals("1234")) { // 비번이 일치
							System.out.println("로그인 성공!!");
							// break;
							System.exit(0); // 프로그램종료
							//return; // 메서드의 종료 
						}else { // 비번이 불일치
							System.out.println("비밀번호를 다시 확인하세요!!");
						}
					}// while----
					
				}else { // 아이디가 일치하지 않는 경우
					System.out.println("아이디를 다시 확인하세요!!");				
				}
			} // while----
			
		} // main------
	} // class----
