package demo_03;

class Milk{
	// Object 클래스의 toString() 메소드를 오버라이딩
	public String toString() {
		return "우유";
	}
}

class Coffee{
	public String toString() {
		return "커피";
	}
}

class Coke{
	public String toString() {
		return "콜라";
	}
}


public class Cup <T>{
	private T things;
	
	public void set(T things) {
		this.things = things;
	}
	
	// 담는 기능
	public void hold() {
		System.out.println(things +"를 담은 컵");
	}
}
