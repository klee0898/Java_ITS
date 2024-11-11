package demo_02;

import java.util.Scanner;

public class Book_Ex3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int num = sc.nextInt();
		
		if(num % 2 == 0) 
			System.out.println("짝");
		if(num % 2 == 1) 
			System.out.println("홀");
		
		System.out.println("프로그램 종료~~");
	}
}
