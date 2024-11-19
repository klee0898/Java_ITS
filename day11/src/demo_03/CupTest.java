package demo_03;

public class CupTest {
	public static void main(String[] args) {
		// 우유컵 만들기, hold() 메소드 호출
		Milk milk = new Milk();
		Cup<Milk> milkCup = new Cup<Milk>();
		
		milkCup.set(milk);
		milkCup.hold();
		
		Coffee coffee = new Coffee();
		
		Cup<Coffee> coffeeCup = new Cup<Coffee>();		
		coffeeCup.set(coffee);
//		Coffee 타입이외에는 매개변수로 사용불가
//		개발자의 실수를 줄일 수 있음.
//		coffeeCup.set(milk);// 컴파일 에러,  
		coffeeCup.hold();
		
		Coke coke = new Coke();
		Cup<Coke> cokeCup= new Cup<>();// <>안 생략가능
		cokeCup.set(coke);
		cokeCup.hold();
	}
}
