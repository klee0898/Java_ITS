package test;

import java.util.Scanner;

public class Ex_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 > ");
		int a = sc.nextInt();
		
		System.out.println("정수 입력 > ");
		int b = sc.nextInt();
		
//		int i = (a > b) ? a : b;
//		System.out.println(i);
		
		System.out.println((a > b) ? a : ((a < b) ? b : "두수가 같음"));
//		System.out.println(i);		
		
		// if문으로 바꾸기
		/* 여러줄 주석 */
//		int i;
//		if(a>b) { 
//			i = a;
//			System.out.println(i);
//		}else if(b>a) {
//			i = b;
//			System.out.println(i);
//		}
//		else
//			System.out.println("두수가 같습니다!!");
		
	}
}
