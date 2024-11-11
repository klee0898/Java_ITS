package review;

import java.util.Scanner;

public class VarSwitch {
	public static void main(String[] args) {
		int x = 22;
		int y = 33;
		
//		두변수의 값을 교환
//		x = y;
//		y = x;
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x = "+ x +", y= "+y);
		
		System.out.println("----------");
		Scanner sc = new Scanner(System.in);
		
		// 여러 숫자를 입력받고 0이 입력되면 프로그램 종료
		// while문을 이용해서 작성
		while(true) {
			System.out.println("숫자 입력 : ");
			int num = sc.nextInt();
			
			if(num != 0) {
				System.out.println("num = " + num);
			}else {
				System.out.println("bye bye ~");
				break;
			}
		}
		
		
	}
}
