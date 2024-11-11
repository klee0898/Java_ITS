package test;

import java.util.Scanner;

public class Ex_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int n = sc.nextInt();
		// 35번
		
		int sum = 0;
		// 반복문안에 if문
		for(int i = 1; i <=n; i++) {
			System.out.println("i="+i);
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("sum = " + sum);
		
		
	}
}
