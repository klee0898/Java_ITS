package demo_03;

class AA {
	void a() {
		System.out.println(100);
	}
}
class BB extends AA{
	// 메소드 오버라이딩
	// 성립조건 : 메소드의 선언부가 같아야 한다.
	// 부모클래스의 메소드를 자식클래스에서 재정의 한 것(rewrite)
	void a() {
		System.out.println(200);
	}
}

class Animal{
	void cry() {System.out.println("동물소리");}
}
class Dog extends Animal{
	// 어노테이션 : 컴파일러에 해당 메소드가 오버라이딩된 메소드라고 알려줌
	@Override
	void cry() {
		System.out.println("멍멍~~");
	}
}
class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("야옹~");
	}
}

public class Inheritance02 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.cry();
		Cat cat = new Cat();
		cat.cry();
	}
}
