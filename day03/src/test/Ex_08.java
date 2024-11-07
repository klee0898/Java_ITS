package test;

import java.util.Scanner;

public class Ex_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요>");
		int month = sc.nextInt();
		
		// 33번
		switch(month) {
		case 12:
//			System.out.println("winter");
//			break;
		case 2:
		case 1:
			System.out.println("winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("fall");
			break;
			
			
		}
		System.out.println("bye bye ~~");
		
	}
}
