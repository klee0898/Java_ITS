package test;

import java.util.Scanner;

public class Ex_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 입력 > ");
		int a = sc.nextInt();
		System.out.println("a = "+a);
		
		// a가 0이상이면 블럭을 수행
		if(a >=0) {
			System.out.println("10보다 작은 정수를 입력하세요");
			int b = sc.nextInt();
			System.out.println("b=" + b);
			if(b<=10) {
				// a는 정수 Math.pow(2, b)는 double : int * double = double 
				double m = a*Math.pow(2, b);
				System.out.println(m);
			}else {
				System.out.println("10보다 작은수를 입력하세요!!");
			}
		}else {
			System.out.println("양수를 다시 입력하세요!!");
		}
		System.out.println("프로그램 종료~");
	}
}
