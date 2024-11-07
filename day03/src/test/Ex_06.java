package test;

import java.util.Scanner;

public class Ex_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 > ");
		int a = sc.nextInt();
		
		// 31번
		if(a >= 90) { // 90이상 
			System.out.println("A");
		}else if(a >= 70) { // 70 ~ 89
			System.out.println("B");
		}else if(a >= 40) { // 40 ~ 69
			System.out.println("C");
		}else {
			System.out.println("D");
		}
	}
}
