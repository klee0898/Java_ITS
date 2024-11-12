package demo_02;

// this : 인스턴스(객체) 자신
class C {
	int a = 100;
	
	void abc(int a) {
		System.out.println("a = " + a); // 지역변수(== 매개변수)
		System.out.println("전역변수 a = " + this.a);
	}	
	void xxx(int a) {
		// 전역변수와 매개변수를 구분하기 위해 this를 사용
		this.a = a;
	}
}
// 도색 공장
class ColorFactory{
	// 매개변수 타입 Car
	void changeColor(Car car, String color) {
		car.color = color;
	}
}

class Car{
	String color;	
	
	Car(){}
	Car(String color){ // 생성자의 역할 => 멤버변수의 초기화
		this.color = color;
	}
	void changeColor(String color) {
		this.color = color;
		System.out.println(this.color);// 전역변수 출력
	}
	// 도색 공장에 맡김
	void colorChange(String color) {
		ColorFactory cf = new ColorFactory();
		cf.changeColor(this, color);
	}
}

public class ThisEx {
	public static void main(String[] args) {
		C c = new C();
		c.abc(10);
		c.xxx(200);
		System.out.println("전역변수 a = " + c.a);
		
		Car car = new Car();
		System.out.println(car.color);
		Car car2 = new Car("red");
		System.out.println(car2.color);
		car2.changeColor("blue");
		
		// 도색 공장에 맡김
		car.colorChange("orange");
		System.out.println(car.color);
	}
}
