package demo2;
//스마트폰 추상화
class SmartPhone{
//	속성들
	 String model;
	 String color;
	 int price;
	// 생성자 : 매개변수가 없는 생성자 ==> 기본 생성자
//		public SmartPhone(){
//			System.out.println("생성자 호출~~");
	//// 기본 생성자는 생략 가능하다.
//		public SmartPhone(){
//		model ="s2";
//		color ="silver";
//		price = 500_000;
	 void powerOn() {
		 System.out.println("전원power on");
	 }
	 
	 void powerOff() {
		 System.out.println("power off");
	 }

}
public class SmartphoneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SmartPhone sp = new SmartPhone();
		 sp.color = "white";
		 sp.model = "갤럭시";
		 sp.price = 500_000; // 천단위 표시, _지원
		 
		 System.out.println(sp.color);
		 System.out.println(sp);// demo_02.SmartPhone@5305068a
		 sp.powerOn();
		 
		 // 두번째 객체 생성
		 SmartPhone sp2 = new SmartPhone();
		 sp2.color = "red";
		 sp2.model = "z플립";
		 sp2.price=1_000_000;		 
		 System.out.println(sp2.price);
		 System.out.println(sp2);// demo_02.SmartPhone@1f32e575
		 sp2.powerOff();
		 
		 // sp와 sp2는 서로 다른 객체
		 
		 System.out.println();
		 SmartPhone sp3 = new SmartPhone();
		 System.out.println(sp3.color);
		 System.out.println(sp3.model);
		 System.out.println(sp3.price);
		 


	}
}
