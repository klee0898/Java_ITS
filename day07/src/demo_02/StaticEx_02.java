package demo_02;

class B {	
	void abc() {} // 인스턴스 메소드
	
	static void def() {} // 스태틱 메소드
}

public class StaticEx_02 {
	public void aaa() {}//인스턴스 메소드
	static void bbb() {}// 스태틱 메소드
	
	public static void main(String[] args) {
		// aaa() 메소드를 호출하시오.
		StaticEx_02 se = new StaticEx_02();
		se.aaa();		
		// bbb() 메소드를 호출하시오.
		bbb();		
		// abc() 메소드를 호출하시오.
		B b = new B();
		b.abc();
		// def() 메소드를 호출하시오.
		B.def();
	}
}
