package demo_01;

//추상 클래스 == 미완성 클래스
abstract class Animal{
	void info() {
		System.out.println("동물 클래스~~");
	}
	// 추상메소드
	abstract void speak();
}
class Dog extends Animal{
	@Override
	void speak() {		
		System.out.println("멍멍~");
	}
}
class Cat extends Animal{
	@Override
	void speak() {
		System.out.println("야옹~");
	}
}
// 추상클래스 --> speak()를 오버라이드 하지 않음
abstract class Bird extends Animal{
	void info() {
		System.out.println("새~");
	}
}

class Sound{
//	static void cry(Dog dog) {
//		dog.speak();
//	}	
//	static void cry(Cat cat) {
//		cat.speak();
//	}
	// dog is a Animal, cat is a Animal
	static void cry(Animal animal) { // 다형성
		animal.speak();
	}
}

public class AbstractEx {
	public static void main(String[] args) {
//		Animal ani = new Animal(); // 추상클래스는 인스턴스 생성불가
		Dog dog = new Dog();
		dog.speak();
		Cat cat = new Cat();
		cat.speak();
		cat.info();
//		Bird bird = new Bird(); // 인스턴스 생성 불가
		
		// cry() 호출하세요
		Sound.cry(dog); // 스태틱메소드 호출 ==> 클래스명.메소드명()
		Sound.cry(cat);
	}
}
