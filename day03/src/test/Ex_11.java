package test;

import java.util.Scanner;

public class Ex_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 : ");
		int n = sc.nextInt();
		
		System.out.println("두번째 숫자 입력 : ");
		int m = sc.nextInt();
		
		// 36번
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=m; k++) {
				System.out.println(i + " "+k);
			}
			System.out.println("--------");
		}
		// 37번
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int k=1; k<=num; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
