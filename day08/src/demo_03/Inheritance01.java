package demo_03;

// 상속 ==> 코드의 재활용
class A{
	int a = 100;
	void b() {
		System.out.println(200);
	}
}

class B extends A{	
	void c() {
		System.out.println(300);
	}
}

public class Inheritance01 {
	public static void main(String[] args) {
		B bb = new B();
		System.out.println(bb.a);
		bb.b();
		bb.c();
	}
}
