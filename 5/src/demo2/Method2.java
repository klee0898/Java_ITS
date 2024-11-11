package demo2;

class AA{
	int n = 200; // 전역변수(멤버변수)
	
	void abc(int a) { // a는 매개변수 == 지역변수
		int b = 100 - a; // 지역(local)변수
		System.out.println(b);
	}
	
	void def() {
//		System.out.println(b); // 컴파일 에러, 지역변수는 사용불가
		System.out.println(n);
	}
}
class C {
	int a = 100; // 전역변수
	void abc(int a) { // a는 지역변수
		System.out.println(a);
	}
	void def() {
		System.out.println(a);
	}
}

class CC {	
	void abc(int a) { // a는 지역변수
		System.out.println(a);
	}
	void def() {
//		System.out.println(a); // 컴파일 에러
	}
}

class BB{
	void a(int n) {
		System.out.println(n);
	}
	void b(String s) {
		System.out.println(s);
	}
	void add(int x, int y) {
		System.out.println(x+y);
	}
}


public class Method2 {
	public static void main(String[] args) {
		AA aa = new AA();
		aa.abc(100);
		aa.abc(200);
		aa.abc(300);
		
		aa.def();
		
		System.out.println();
		C c = new C();
		c.abc(10);
		c.def();
		// BB의 a, b 메소드를 호출하세요.
		BB bb = new BB();
		bb.a(10);
		bb.b("Hello");
		bb.add(10,2);
	}
}
