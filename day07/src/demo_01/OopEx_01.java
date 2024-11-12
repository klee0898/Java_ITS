package demo_01;

class Box{
	String color;
	// 기본 생성자가 생략된 경우에는 JVM(컴파일러)이 자동으로 생성해줌
//	 public Box() {}
	
	//** 기본 생성자이외에 인자생성자가 있는 경우에는
	// 기본생성자를 컴파일러가 자동으로 생성해주지 않는다.
	
	// 매개변수가 있는 생성자 => 인자 생성자
	public Box(String s){color = s;}
	
	void printColor() {System.out.println(color);}
}

class Box2{
	// 가로, 세로
	int width;
	int height;
	String color;
	
	// 인자 생성자
	public Box2(int w, int h, String c){
		width = w; height=h; color=c;
	}
	
}

public class OopEx_01 {
	public static void main(String[] args) {
		
		// 기본 생성자를 이용한 객체 생성
//		Box b1 = new Box();
//		System.out.println(box1.color); // null
		
		// 인자 생성자를 이용한 객체 생성
		Box b2 = new Box("red");
		System.out.println(b2.color);//red
		Box b3 = new Box("blue");
		System.out.println(b3.color);//blue
		b3.printColor();//blue
		
//		Box2 b4 = new Box2(); // 에러
		Box2 b4 = new Box2(100, 50, "yellow");
		System.out.println(b4.color); // yellow
		System.out.println(b4.width); // 100
		System.out.println(b4.height); // 50
	}
}
