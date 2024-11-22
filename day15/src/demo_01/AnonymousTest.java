package demo_01;

// 익명클래스(Anonymous) : 이름이 없는 클래스
// 일회성 사용을 위해 선언

interface Greeting{
	void sayHello();
}

// 인터페이스를 구현한 클래스명뒤에 보통 접미사 Impl을 붙인다.
class GreetingImpl implements Greeting{
	@Override
	public void sayHello() {
		System.out.println("Hello~~");
	}	
}

class Person{
	void work() {
		System.out.println("열심히 일을 합니다~~~");
	}
}
class Student extends Person{
	void work() {
		System.out.println("열심히 공부를 합니다~");
	}
}

abstract class Human{
	public abstract void create();
	public void work() {
		System.out.println("열심히 일을 합니다.");
	}
}

class Man extends Human{
	@Override
	public void create() {
		System.out.println("문자를 만들다");
	}
}


public class AnonymousTest {
	public static void main(String[] args) {
		GreetingImpl gi = new GreetingImpl();
		gi.sayHello();
		
		// 인터페이스를 오버라이딩하는 익명클래스 사용
		Greeting g= new Greeting() {
			@Override
			public void sayHello() {
				System.out.println("Hello~~~~");
			}
		};
		g.sayHello();
		
		Student st1 = new Student();
		st1.work();
		// 일반클래스를 익명클래스로
		Person st2 = new Person() {
			void work() {
				System.out.println("열심히 아르바이트를 합니다~~");
			}
		};
		st2.work();
		
		Man man = new Man();
		man.create();
		// 추상클래스를 익명클래스를 이용하여 create()를 호출하세요.
		Human man2= new Human() {
			@Override
			public void create() {
				System.out.println("자동차를 발명하다~");
			}
		};
		
		man2.create();
		man2.work();
		
	}
}
