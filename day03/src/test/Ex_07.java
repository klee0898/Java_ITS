package test;

import java.util.Scanner;

public class Ex_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String str = sc.next();
		
//		System.out.println(str.charAt(1));
		char ch = str.charAt(0);		
		
		// 32번
		switch(ch) {
		case 'A':
			System.out.println("best!!!");
			break;
		case 'B':
			System.out.println("good!!!");
			break;
		case 'C':
			System.out.println("run!!!");
			break;
		case 'D':
			System.out.println("slowly!!!");
			break;
		default:
			System.out.println("what?");
			break;
		}
		
	}
}
