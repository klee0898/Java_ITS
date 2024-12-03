package demo_01;


// 싱글톤
class Demo {	
	private static Demo instance;
	
	private Demo() {
		System.out.println("생성자 호출");
	}
	
	// 비동기처리, 
	// 3개의 스레드는 인스턴스 생성전에 이미 메소드 영역안에 
	// 모두 진입한 상태가 된다.
//	public static Demo getInstance() {
//		if(instance == null) {
//			instance = new Demo();
//		}
//		return instance;
//	}
	
	// 동기화 --> 동시성 제어(임계영역 제어: 화장실)
	public static synchronized Demo getInstance() {
		if(instance == null) {
			instance = new Demo();
		}
		return instance;
	}
}


public class ThreadEx2 extends Thread {
	@Override
	public void run() {	
		// 싱글톤 인스턴스를 생성
		Demo d1 = Demo.getInstance();
		// 인스턴스(주소)를 출력 
		System.out.println(d1);
	}
	
	public static void main(String[] args) {
		// ----------------------------
//		Demo d1 = Demo.getInstance();
//		Demo d2 = Demo.getInstance();
//		Demo d3 = Demo.getInstance();
//		
//		System.out.println(d1); // demo_01.Demo@5305068a
//		System.out.println(d2); // demo_01.Demo@5305068a
//		System.out.println(d3); // demo_01.Demo@5305068a
		
		
		//------------------------
		// 3개의 스레드를 만들어서 실행
		new ThreadEx2().start(); // run() 호출
		new ThreadEx2().start();
		new ThreadEx2().start();
	}
}
