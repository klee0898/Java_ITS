package demo_03;

interface A{
	int a = 100; // public static final이 생략된 형태
	
	// 인터페이스안에 모든 메소드는 추상메소드 이므로
	// public abstract 생략된 형태
	void abc(); 
}

interface A2{
	void abc();
//	void aaa() {};// 추상메소드가 아님
	void def();
}

class B implements A2{
	@Override
	public void abc() {}
	@Override
	public void def() {}
}
interface A3{}
interface A4{}
class C implements A3, A4{} // 다중 상속

// 인터페이스명은 형용사로 표현하는 경우가 많다.
interface Flyable {
	void fly();
}

class Bird implements Flyable{
	@Override
	public void fly() {		 
		System.out.println("새가 날다~~");
	}
}
class Superman implements Flyable{
	@Override
	public void fly() {		 
		System.out.println("수퍼맨 날다~");
	}
}
class Airplane implements Flyable{
	@Override
	public void fly() {		 
		System.out.println("비행기 날다~");
	}
}

public class InterfaceEx01 {
	public static void main(String[] args) {
		Bird b = new Bird();
		b.fly();
		Superman s = new Superman();
		s.fly();
		// 부모타입의 자식객체 생성 (다형성의 예) 
		Flyable f1 = new Bird();
		Flyable f2 = new Superman();
		Flyable f3 = new Airplane();
	}
}
