package demo_02;

//메소드 오버로딩 : 하나의 클래스에 이름이 같은 메소드가 여러 개 선언되는 것
//매개변수의 자료형 개수, 매개변수 자료형의 순서로 구분할 수 있어야
//오버로딩이 성립된다.
//오버로딩은 반환타입과 무관하다.
//오버로딩은 다형성과 관련 있다.
public class OverloadEx {
	int a;
	
	void abc() {}
	void abc(int a) {}
	void abc(String a) {}
	void abc(int a, int b) {}
	void abc(int b, String s) {}
	void abc(String s, int b) {}
	// 위에 매개변수 타입 int 2개가 있기 때문에 에러가 발생
//	void abc(int b, int a) {} // 컴파일 에러
	
//	int abc(int a, int b) {return a;} // 컴파일 에러	
	int abc(String a, String b) {return 100;}
}
