package demo_04;

public class CoffeeMachine {
	// 농도
	private int coffee;
	private int sugar;
	private int cream;
	
	//getter 메소드, 접두어 get
	public int getCoffee() {
		return coffee;
	}
	public int getSugar() {
		return sugar;
	}
	public int getCream() {
		return cream;
	}
	
	// setter 메소드, 접두어 set
	public void setCoffee(int coffee) {
		if(coffee < 0 || coffee > 20) {
			System.out.println("커피 농도는 0 ~ 20이어야 합니다.");
		}else {
			this.coffee = coffee;
		}
	}
	public void setSugar(int sugar) {
		if(sugar < 0 || sugar > 20) {
			System.out.println("설탕 농도는 0 ~ 20이어야 합니다.");
		}else {
			this.sugar = sugar;
		}		
	}
	public void setCream(int cream) {
		if(cream < 0 || cream > 20) {
			System.out.println("크림 농도는 0 ~ 20이어야 합니다.");
		}else {
			this.cream = cream;
		}
	}
	
}
