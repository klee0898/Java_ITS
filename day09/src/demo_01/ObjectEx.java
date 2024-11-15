package demo_01;

class A extends Object{} // extends Object 생략

class B { // extends Object 생략
	// 오버라이드
	public String toString() {
		return "B 클래스";
	}
}

public class ObjectEx {
	public static void main(String[] args) {
		A a = new A();
		String str = a.toString();
		System.out.println("str = " + str);
		System.out.println(a); // toString() 생략된 형태
		System.out.println();
		B b = new B();
		str = b.toString();
		System.out.println("str = " + str);
		System.out.println(b); // toString() 생략된 형태
	}
}
