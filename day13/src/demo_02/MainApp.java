package demo_02;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		// dao 생성될 때마다 3명의 멤버가 members 리스트에 추가됨
		MemberDAO dao = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("------- 회원가입 Pgm -------");
			System.out.println("[1] 로그인 [2] 회원가입 [3]회원리스트 [0] 종료");
			System.out.println("메뉴 선택하세요 > ");
			int menu = sc.nextInt();
			
			if(menu == 0) {
				System.out.println("bye bye~~");
				System.exit(0);
			}
			switch(menu) {
			case 1:
				// 로그인
				dao.login();
				break;
			case 2:
				// 회원가입
				dao.memberJoin();
				break;
			case 3:
				// 회원리스트 조회 메소드 호출
				dao.memberList();
				break;
			}
		}
		
	}
}
