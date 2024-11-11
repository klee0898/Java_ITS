package demo_02;

import java.util.Scanner;

public class Book_Ex3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int num = sc.nextInt();
		
//		if(num % 2 == 0) 
//			System.out.println("짝");
//		else  
//			System.out.println("홀");
		
		// 위의 if ~ else 문을 삼항(조건) 연산자로 바꾸기
//		String res = (num % 2 == 0) ? "짝" : "홀";
//		System.out.println(res);
		
		System.out.println((num % 2 == 0) ? "짝" : "홀");
		
		System.out.println("프로그램 종료~~");
	}
}
