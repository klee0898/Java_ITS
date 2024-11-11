package demo1;

import java.util.Scanner;

public class ScannerEx {
	//lang패키지에 있는 클래스들은 자동으로 JVM이 불러온다. 따라서, 생략되어짐
	//import java.lang.System;
	 // System.in : 표준 입력장치
    
    
//    String msg;
//    msg = sc.nextLine(); // 한라인을 입력 받는다.
//    msg = sc.next(); // 한단어만 입력 받는다.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력. :");
		
		String msg;
//		msg = sc.nextLine(); 한 line 만 입력받음 
//		msg = sc.next(); 한  단어만  입력받음
		msg = sc.next();
		
		System.out.println(msg);
		
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		System.out.println(num);
		System.out.println();
		float num2 = sc.nextFloat();
		System.out.println(num2);
		
	}

}
