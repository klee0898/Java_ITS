package demo_02;

public class Cafe {
	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		
		int n = cm.getTea(2, 2, 3);
		System.out.println("농도 : "+n);
		
		n = cm.getTea(2, 3);
		System.out.println("농도 : "+n);
		
		// 설탕커피를 만들어보세요.
		n = cm.getTea(2, "3");
		System.out.
		println("농도 : "+n);
		
		// 유자 객체를 생성
		Yuja y = new Yuja();
		y.yuja = 3;
		y.sugar = 3;
		
		cm.getTea(y);
		
		// 오렌지 생성
		Orange o = new Orange();
		o.orange = 5;
		o.sugar = 2;
		
		cm.getTea(o);
	}
}
