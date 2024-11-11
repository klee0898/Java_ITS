package demo2;




public class Box {
		// 전역변수(멤버변수)
		String color;
		
		// 기본 생성자
		public Box() {
			System.out.println("생성자 호출");
			color = "black";
		}
		// 메소드
		void showInfo() {
			System.out.println("컬러는 "+color);
		
	}


