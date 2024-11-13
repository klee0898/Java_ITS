package review;

import java.util.Scanner;

public class CoffeeMachine {
	// 농도
	private int coffee; // int의 기본값 0으로 할당
	private int sugar;  // int의 기본값 0으로 할당
	private int cream;  // int의 기본값 0으로 할당
	
	//getter 메소드, 접두어 get, 값을 가져올 때
	// 접근제어자 public
	public int getCoffee() {
		return coffee;
	}
	public int getSugar() {
		return sugar;
	}
	public int getCream() {
		return cream;
	}
	
	Scanner sc = new Scanner(System.in);
	
	
	// setter 메소드, 접두어 set, 수정할 때
	// public 
	public void setCoffee(int coffee) {
		// 커피 농도가 잘못 입력된 경우
		if(coffee < 0 || coffee > 20) {
			while(true) {
				System.out.println("커피 농도는 0 ~ 20이어야 합니다.다시 입력하세요");
				int value = sc.nextInt();
				
				if(value < 0 || value > 20) {
					continue;
				}else {
					this.coffee = value;
					break; // 루프 탈출 
				}
			} // while
		}else {
			this.coffee = coffee;
		}
	}
	public void setSugar(int sugar) {
		if(sugar < 0 || sugar > 20) {
			while(true) { // 제대로 입력될 때까지 반복
				System.out.println("설탕 농도는 0 ~ 20이어야 합니다.");
				int value = sc.nextInt();
				
				if(value < 0 || value > 20) { // 잘못 입력된 경우
					continue;
				}else { // 제대로 입력된 경우
					this.sugar = value;
					break; // 루프 탈출 
				}
			}
		}else {
			this.sugar = sugar;
		}		
	}
	public void setCream(int cream) {
		if(cream < 0 || cream > 20) {
			while(true) {
				System.out.println("크림 농도는 0 ~ 20이어야 합니다.");
				int value = sc.nextInt();
				
				if(value < 0 || value > 20) { // 잘못 입력된 경우
					continue;
				}else { // 제대로 입력된 경우
					this.cream = value;
					break; // while루프 탈출 
				}
			}// while
		}else {
			this.cream = cream;
		}
	}
	
}
