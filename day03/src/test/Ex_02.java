package test;

import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 > ");
		int a = sc.nextInt();
		System.out.println("정수 입력 > ");
		int b = sc.nextInt();
		
//		if(a > b) 
//			System.out.println(1);
//		else // a<=b
//			System.out.println(0);
		
		if(a > b) 
			System.out.println(1);
		else if(a == b || a < b)
			System.out.println(0);
		System.out.println();
		// 23문제
		if(a == b) 
			System.out.println(1);
		else 
			System.out.println(0);
		System.out.println();
		// 25문제
		if(a != b) 
			System.out.println(1);
		else 
			System.out.println(0);
		System.out.println();
		// 26문제
		System.out.println("true나 false를 입력하세요");
		boolean bool = sc.nextBoolean();
		
//		if(bool == true)
//			System.out.println(false);
//		else
//			System.out.println(true);
		
		System.out.println(!bool);
		
		
		
	}
}
