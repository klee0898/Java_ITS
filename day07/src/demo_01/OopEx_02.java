package demo_01;

class A{
	int a;
	String b = "Hello";
	
	public A(){};
	// 인자 생성자 2개
	public A(int x) {a = x;}
	public A(int x, String s) {
		a = x;
		b = s;
	}
}

class Car{
	String name;
	int speed;
	
	public Car(String s) { // 매개변수 1개, 타입 String
		name = s; speed = 200;
	}
	
	public Car(String s, int ss) {
		name = s; speed = ss;
	}
	
	public Car(int ss) { // 매개변수 1개, 타입 int
		name = "제네시스"; speed = ss;
	}
}

public class OopEx_02 {
	public static void main(String[] args) {
		A a = new A();
		A aa = new A(100);
		A aaa = new A(100, "Hi");
		
		System.out.println(aa.a + ","+aa.b); // 100,Hello
		System.out.println(aaa.a + ","+aaa.b); // 100,Hi
		
		// 그랜저, 200
		Car c1 = new Car("그랜저");
		// 소렌토, 180
		Car c2 = new Car("소렌토", 180);
		// 제네시스, 220
		Car c3 = new Car(220);
		
		System.out.println(c1.name+", "+c1.speed);
		System.out.println(c2.name+", "+c2.speed);
		System.out.println(c3.name+", "+c3.speed);
	}
}
