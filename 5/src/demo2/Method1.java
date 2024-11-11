package demo2;


class A {
	// 메소드의 선언 위치 : 클래스 블럭{} 내부
	// void : 리턴값이 없다는 의미
	
	// 매개변수(입력값)도 없고 리턴값도 없는 메소드
	public void a() { // a는 메소드명
		System.out.println(10);
	}	
	public void b() {
		System.out.println(20);
	}	
	void c() {
		System.out.println(30);
	}
}

class Dog{
	void cry() {
		System.out.println("멍멍~~");
	}
}

class B{
	void abc() { System.out.println("B의 abc()");}
	void foo() {
		// 다른 클래스의 메소드를 호출
		Dog dog = new Dog();
		dog.cry();
		// 같은 클래스내의 메소드를 호출하는 경우, 주소 생성없이 메소드명만 호출
		abc();
	}
}


public class Method1 {
	public static void main(String[] args) {
		String str = new String("Hello World!!");
		// 다른 클래스에 있는 메소드를 호출하려면
		// 그 클래스의 주소를 먼저 만들어야 한다.
		// 주소 생성 방법:
		// 클래스명 참조변수(주소) = new 클래스명(); , 이때 new : 주소 생성 연산자		
		// 자료형 변수명 = 값
		
		// A 클래스에 있는 a() 메소드를 호출(기능을 가져다 사용)
		A obj= new A();
		obj.a(); // .은 멤버 접근 연산자
		obj.b();
		obj.c();
		Dog dog = new Dog();
		dog.cry();
		System.out.println();
		// 화면 가로분할 단축키 : ctrl + shift + -(하이픈)
		// B클래스의 foo() 호출하시오.
		B b = new B();
		b.foo();
	}
}

