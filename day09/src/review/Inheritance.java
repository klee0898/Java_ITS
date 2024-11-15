package review;

// Object는 모든 클래스의 조상
class A { // extends Object 생략되어 있는 형태			
	void abc() {
		System.out.println(200);
	}
}
//모든 생성자의 첫줄에는 super(); 생략되어 있다.
//super()는 생성자안에서 첫줄에 와야한다.
//super() 첫줄에 오는 이유 : 부모가 존재해야 자식이 존재
//super()는 부모클래스의 기본생성자를 호출하는 것
class B extends A{
	B(){
		super(); // 부모의 기본생성자를 호출
	}	
	// 오버라이드
	void abc() {
		System.out.println(300);
	}	
	void def() {
		abc(); // this가 생략
		super.abc(); // super : 부모주소(== 부모인스턴스)
	}
}


public class Inheritance {
	public static void main(String[] args) {
		B b = new B();
		b.abc(); // 300, 오버라이딩된 메소드가 우선
		b.def(); // 300 200
		A a = new A();		
	}
}
