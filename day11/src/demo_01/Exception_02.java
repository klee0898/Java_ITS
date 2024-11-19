package demo_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_02 {
	public static void main(String[] args) {
		System.out.println("=======================");
		System.out.println(" 1.로그인 2.로그아웃 3.종료");
		System.out.println("=======================");
		
		// 문자를 입력했을 때 예외처리를 하시오. finally 생략
		// 예외처리는 "숫자가 아닙니다... 다시 입력하세요"
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("메뉴를 선택하시오 >");
				int num = sc.nextInt();
				
				if(num ==1) {
					System.out.println("로그인 되었습니다!!");
				}else if(num == 2) {					
					System.out.println("로그아웃 되었습니다!!");
				}else if(num == 3) {
					System.out.println("프로그램 종료~~");
					break;
//					return; //메소드 종료 
				}
			}catch(InputMismatchException ie) {
	//		}catch(Exception e) { 
	//			ie.printStackTrace();
				System.out.println("숫자가 아닙니다. ~ 다시입력하세요!!");
			}
		}// while
	}// main
}
