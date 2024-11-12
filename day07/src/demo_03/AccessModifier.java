package demo_03;

// 접근제어자
//접근 범위가 가장 넓은 것부터
//public > protected > default > private

//접근제어자의 위치 : []는 생략가능을 의미 
//[접근제어자] class 클래스명
//[접근제어자] 자료형 멤버변수
//[접근제어자] 생성자(){}
//[접근제어자] 반환타입 메서드명() {}
public class AccessModifier {
	int num = 100;
	
	// 접근 제어자 default
	void add() {
		System.out.println("더하기");
	}
	
	public void minus() {
		System.out.println("빼기");
	}
	
	private void multi() {
		System.out.println("곱하기");
	}
	
	public void divide() {
		System.out.println("나누기");
	}
	
	void abc() {
		multi(); // 같은 클래스 내에서만 호출가능
	}
}
