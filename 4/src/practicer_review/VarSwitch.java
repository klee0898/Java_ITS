package practicer_review;

import java.util.Scanner;

public class VarSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 22;
		int y = 33;
		
		x = y;
		y = x;
		System.out.println("x ="+ x +", y =+y");
		
		System.out.println("-----");
		Scanner sc = new Scanner(System.in);
		
		while(true ) {
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

