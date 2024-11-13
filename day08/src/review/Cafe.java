package review;

import java.util.Scanner;

public class Cafe {
	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		
		// private으로 지정된 변수는 외부클래스에서 not visible 에러
//		cm.coffee = 2; // not visible
//		cm.sugar = 1; // not visible
//		cm.cream = 1; // not visible
		
		cm.setCoffee(-2);
		cm.setSugar(-1);
		cm.setCream(-1);
		
		
		System.out.println("커피농도 : " +cm.getCoffee());
		System.out.println("설탕농도 : " +cm.getSugar());
		System.out.println("크림농도 : " +cm.getCream());
	}
}
