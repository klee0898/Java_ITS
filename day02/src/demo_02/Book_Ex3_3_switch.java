package demo_02;

import java.util.Scanner;

public class Book_Ex3_3_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String grade;
		
		System.out.println("숫자를 입력하세요.");
		int score = sc.nextInt();
		
		// 문제> Ex3_3을 switch문으로 작성하세요.
		// score / 10의 결과는 정수, score = 99이면 9.9가 아니라 9가 된다.
		// 정수 / 10은 : 자바에서 정수/정수 = 정수 (사칙연산 모두 해당)
		switch(score / 10) { 
		case 10: 
//			grade = "A";
//			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		
		System.out.println("당신의 학점은 "+grade+" 입니다.");
	}
}
