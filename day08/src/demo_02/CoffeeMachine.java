package demo_02;

public class CoffeeMachine {
	//농도
	private int coffee;
	private int sugar;
	private int cream;

	// 메소드 오버로딩
	// 밀크커피
	public int getTea(int coffee, int sugar, int cream) {
		this.coffee = coffee;
		this.sugar = sugar;
		this.cream = cream;
		System.out.println("농도 : "+(coffee+sugar+cream)+" 밀크 커피 나갑니다!!");
		return coffee+sugar+cream;
	}
	
	// 프림커피
	public int getTea(int coffee, int cream) {
		this.coffee = coffee;
		this.cream = cream;
		System.out.println("농도 : "+(coffee+cream)+" 프림 커피 나갑니다!!");
		return coffee+cream;
	}
	
	// 설탕커피
	public int getTea(int coffee, String sugar) {
		this.coffee = coffee;
		// Integer.parseInt(문자열숫자) ==> 정수형숫자
		// Integer.parseInt("1000") ==> 1000
		this.sugar = Integer.parseInt(sugar);
		System.out.println("농도 : "+(coffee+this.sugar)+" 설탕 커피 나갑니다!!");
//		return coffee+sugar; // 에러, 정수+문자열=문자열
		return coffee+this.sugar;
	}
	
	// 유자차
	public void getTea(Yuja y) {
		System.out.println("유자차 나갑니다!!");
		System.out.println("농도 : " + (y.yuja + y.sugar));
	}
	
	// 오렌지 쥬스
	// 1. Orange 클래스 만들고
	// 2. 농도는 orange, sugar 속성 사용
	// 메소드 오버로딩하세요.
	
	public void getTea(Orange o) {
		System.out.println("오렌지 쥬스 나갑니다...");
		System.out.println("오렌지 농도 : " + o.orange);
	}
	
	
}
