package demo_02;

// 다형성(Polymorphism)
class A{}
class B{}

class AA{
	void a() {System.out.println(1);}
	void b() {System.out.println(2);}
}
class BB extends AA{
	// 오버라이드
	void b() {System.out.println(3);}
	void c() {System.out.println(4);}
}

class CC{
	void abc() {System.out.println(10);}
}

public class Polymorphism01 {
	public static void main(String[] args) {
		// 다형성
		// 부모타입으로 자식 클래스를 생성
		// 부모클래스 주소(참조변수) = new 자식클래스();
		Object a = new A(); // 업캐스팅(Upcasting) : 자동으로 부모클래스로 형변환 된것 
		Object b = new B();
		
		Object poly = new Polymorphism01();
		
		// 자식클래스 주소 = new 부모클래스(); 불가능
		// A aa = new Object(); // 컴파일 에러
		System.out.println("-----------");
		AA aa = new BB(); // 부모타입으로 자식객체 생성
		AA a1 = new AA();
				
//		BB bb = new AA(); // 컴파일에러
		aa.a();
		aa.b();
		// c()는 자식의 고유기능, AA 타입이므로 자식의 고유기능은 사용불가
//		aa.c(); // 컴파일 에러
		BB bb = (BB)aa;
		bb.c();
		System.out.println("===========");
		Object obj = new CC();		
		// obj.abc(); // // 컴파일에러, abc()는 CC의 고유기능
		CC cc = (CC)obj; // CC타입으로 형변환 ==> 다운캐스팅(강제적(=명시적) 형변환)
		cc.abc();
	}
}
