package demo2;
//스마트폰 추상화
class SmartPhone{
//	속성들
	 String model;
	 String color;
	 int price;
	 
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
		


	}
}
