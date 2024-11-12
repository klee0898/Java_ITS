package review;

// class를 만드는 것 => 추상화
class Tv{
	// 속성 == 필드 == 프로퍼티 ==> 멤버변수
	String color;
	boolean power; // boolean의 기본값 false가 할당
	int channel;
	int volume;
	
	// 기본 생성자 : 매개변수가 없는 생성자, 생략가능
	public Tv(){
		System.out.println("생성자 호출");
	}	
	
	// 메소드
	void power() {
		power = !power;
	}
	
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
	void volumeUp() {++volume;}
	void volumeDown() {volume--;}
}

public class Oop_01 {
	public static void main(String[] args) {
//		int a;
//		Tv tv; // 선언만 함
//		tv = new Tv();
		
		// 위의 두라인과 동일
		Tv tv = new Tv(); // 객체생성(주소생성)
		tv.power(); // power == true
		tv.channel = 11;
		tv.power(); // power == false
		System.out.println(tv.power);
		System.out.println(tv.channel);
		tv.channelUp();
		tv.channelUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeDown();
		System.out.println(tv.channel);
		System.out.println(tv.volume);
	}
}
