package demo_01;

// 스레드 생성 방법
// 1. Thread 클래스 상속
class SubThread extends Thread{
	@Override
	public void run() {
		for(int i=1; i<6; i++) {
			System.out.println("자바");
			
			try {
				Thread.sleep(1000); // 1초간 중지
			} catch (InterruptedException e) {				
				e.printStackTrace();
			} 
		}
	}
	
}
// 2. Runnable인터페이스 상속
class SubThread2 implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<6; i++) {
			System.out.println("스프링");
			
			 try {
				Thread.sleep(1000); // 1초간 중지
			} catch (InterruptedException e) {				
				e.printStackTrace();
			} 
		}		
	}
}

public class ThreadEx {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		SubThread st1 = new SubThread();
		
		SubThread2 st2 = new SubThread2();
		// Runnable로 생성된 스레드는
		// 아래와같이 다시 Thread생성을 해준다.
		Thread th = new Thread(st2);
		
		// 스레드 실행
		st1.start(); // start()는 run() 호출
		th.start(); 
		
		for(int i=1; i<6; i++) {
			System.out.println("Main");
			
			 try {
				Thread.sleep(1000); // 1초간 중지
			} catch (InterruptedException e) {				
				e.printStackTrace();
			} 
		}
		
		long end = System.currentTimeMillis();
		// 스레드를 활용해서 동시에 작업처리를 하기 때문에
		// 5초 정도의 시간이 걸린다.
		System.out.println("작업시간 : " + (end - start));
	}
	
}
