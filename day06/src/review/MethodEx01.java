package review;

class A{ // a(), b(), c() 메소드들은 class A를 구성하는 멤버
	public void a() {
		System.out.println("a");
	}
	public void b() {
		System.out.println(100);
	}
	void c() {
		System.out.println(333);
	}
}

class Cat{
	public void cry() {
		System.out.println("야옹~~");
	}
}

class D{
	void abc() { System.out.println("D의 abc()");}
	void foo() {
		Cat cat = new Cat();
		cat.cry();
		
		// 같은 클래스내의 메소드 호출은 주소생성없이 메소드명만 호출
		abc();
	}
}

public class MethodEx01 {
	public static void main(String[] args) {
		// int a = 값;, 타입 변수 = 값
		String str = new String("Hello"); // String은 타입(클래스)
		
		// 다른 클래스에 있는 메소드를 호출
		// #1. 그 클래스의 주소를 생성
		//    -- 주소 생성 방법 
		//      : 클래스명 변수(참조변수) = new 클래스명();
		// 		  클래스는 타입(자료형)이다.
		// #2. 메소드 호출
		A aa = new A(); // new : 주소 생성 연산자
		
		
		// A클래스의 멤버 접근(메소드 호출 : 메소드의 기능을 사용)
		aa.a(); // . 멤버접근 연산자
		aa.b();
		aa.c();
		
		Cat cat = new Cat();
		cat.cry();
		// 참조변수(주소)를 출력 : 메모리상의 주소를 16진수로 표시
		System.out.println(cat); // review.Cat@1f32e575
		
		// D 클래스의 foo() 메소드 호출하기
		D d = new D(); // 주소생성
		d.foo(); // 메소드 호출
		
	}
}
