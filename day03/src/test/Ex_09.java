package test;

import java.util.Scanner;

public class Ex_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 34번
//		for(;;) { // 무한루프
		while(true) {
			System.out.println("숫자 입력하세요 >");
			int n = sc.nextInt();
			
			if(n == 0) {				
				System.out.println("bye bye ~~");
				break;
			}
		}
		
		
	}
}
