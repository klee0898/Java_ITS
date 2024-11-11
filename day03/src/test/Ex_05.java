package test;

import java.util.Scanner;

public class Ex_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 > ");
		int a = sc.nextInt();
		
		// 30번
		if(a < 0) {
			System.out.println("minus");
		}else {
			System.out.println("plus");
		}
		if(a%2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		
	}
}
