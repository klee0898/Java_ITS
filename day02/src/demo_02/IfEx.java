package demo_02;

import java.util.Scanner;

public class IfEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 점수를 입력하세요.");
		int score = sc.nextInt();
		
//		if(score >= 60) {
//			System.out.println("당신은 합격 입니다.");
//		}
		
		// 블럭안의 문장이 하나인 경우는 블럭({})을 생략할 수 있다.
		if(score >= 60)
			System.out.println("당신은 합격 입니다.");		
		
		// if ~ else ~
//		if(score >= 60) {
//			System.out.println("당신은 합격 입니다.");
//		}else {
//			System.out.println("당신은 불합격 입니다.");			
//		}
		
		int n = -4;
		// 다중 if문
		if(n > 0) {
			System.out.println("양수 입니다.");
		}else if(n < 0) {
			System.out.println("음수 입니다.");
		}else {
			System.out.println("제로 입니다.");
		}
		
		// if문 안에 if문
		System.out.println("아이디를 입력하시오:");
		String id = sc.next();

		System.out.println("비밀번호를 입력하시오:");
		String pw = sc.next();

		// id : test, pw : 1234 이면 로그인 성공
		if( id.equals("test")){ 
			if(pw.equals("1234")){
				System.out.println("로그인 성공!!");
			}else{
				System.out.println("비밀번호가 일치하지 않습니다!!");
			}
		} else {
			System.out.println("아이디가 일치하지 않습니다!!");
		}		
		
	} // main
} // class
