package practicer_review;

import java.util.Scanner;

public class ElectricUsageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--- Menu ---");
		System.out.println("1. 가정용(liter당 50원)");
		System.out.println("2. 상업용(liter당 45원)");
		System.out.println("3. 공업용(liter당 30원)");
		System.out.println("---  ---");
		System.out.println("메뉴코드입력");
		
		Scanner sc = new Scanner(System.in);
//		메뉴선택, 변수 code
		int code = sc.nextInt();
		
//		사용량입력받기, 변수 usage, liter
		System.out.println("사용량입력하세요 > ");
		int usage = sc.nextInt();
//		1, 2, 3 이외의 code가 입력되면 프로그램 종료하기

		if(code < 1  || code > 3) {
			System.out.println("잘못된 접근입니다! 메뉴선택을 다시하세요! 프로그램을 종료합니다");
		}
	
//		사용요금 계산, 요금변수fare
		int fare = 0;
//		switch문을 이용하여 계산하는 코를 작성
		switch(code) {
		case 1:
			fare = usage * 50;
			break;
		case 2:
			fare = usage * 45;
			break;
		case 3:
			fare = usage * 30;
			break;
		}
		//	10% 부가세 부여, 변수 tax
		double tax = fare * 0.1;
		// 총수도요금 (사용요금 + 부가세), 변수 total
		double total = fare + tax;
		
		System.out.println("=============");
		System.out.println("메뉴코드 : " + code);
		System.out.println("사용요금 : " + fare + " 원");
		System.out.println("=============");
		System.out.println("총수도요금 : " + total + "원(부가세포함)");
//		MAIN {} END
	}
//		class {} END
}
