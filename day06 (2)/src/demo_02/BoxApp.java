package demo_02;

//class Box{
//	// 전역변수(멤버변수)
//	String color;
//	
//	// 기본 생성자
//	public Box() {
//		System.out.println("생성자 호출");
//		color = "black";
//	}
//	// 메소드
//	void showInfo() {
//		System.out.println("컬러는 "+color);
//	}
//}

public class BoxApp {
	public static void main(String[] args) {
		Box redBox = new Box(); // 기본생성자 호출
		redBox.color = "red";
		redBox.showInfo();
		
		System.out.println(redBox.color);
		
		Box box = new Box(); // 내부적으로 기본생성자 호출
		System.out.println(box.color);
		box.showInfo();		
	}
}
