package demo_01;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : ");
		
		String msg;
//		msg = sc.nextLine(); // 한라인을 입력 받는다.
		msg = sc.next(); // 한단어만 입력 받는다.
		
		System.out.println(msg);
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		System.out.println(num);
		System.out.println();
		float num2 = sc.nextFloat();
		System.out.println(num2);
	}
}
