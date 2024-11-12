package demo_02;

public class ABC {
	// 스태틱 변수
	static int x = 50;
	// 인스턴스 변수
	int y = 60;
	
	// 기본 생성자
	public ABC(){}
	
	// 인스턴스 메소드
	void foo() {
		System.out.println("foo() 메소드 호출");
	}
	
	// 스태틱 메소드
	static String bar() {
		return "하이";
	}
	
	
}
