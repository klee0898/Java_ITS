package test;

import java.util.Scanner;

public class Ex_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 > ");
		int a = sc.nextInt();
		
		System.out.println("정수 입력 > ");
		int b = sc.nextInt();
		
		System.out.println("정수 입력 > ");
		int c = sc.nextInt();
		
		// 28번
		if(a%2 == 0)
			System.out.println(a);
		
		if(b%2 == 0)
			System.out.println(b);
		
		if(c%2 == 0)
			System.out.println(c);
		
		// 29번
		if(a%2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
		
		if(b%2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
		
		if(c%2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
		
		
	}
}
