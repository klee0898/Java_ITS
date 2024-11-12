package demo_04;

public class Cafe {
	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		
//		cm.coffee = 2; // not visible
//		cm.sugar = 1;
//		cm.cream = 1;
		
		cm.setCoffee(-2);
		cm.setSugar(1);
		cm.setCream(1);
		
		System.out.println("커피농도 : " +cm.getCoffee());
		System.out.println("설탕농도 : " +cm.getSugar());
		System.out.println("크림농도 : " +cm.getCream());
	}
}
