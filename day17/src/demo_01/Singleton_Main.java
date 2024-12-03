package demo_01;

public class Singleton_Main {
	public static void main(String[] args) {
		
		// 접근불가
		// Singleton st = new Singleton();
		
		// getInstance() 통해서 최초의 인스턴스 생성
		Singleton st = Singleton.getInstance();
		
		// demo_01.Singleton@5305068a
		System.out.println(st);
		
		// getInstance()를 호출해도 기존의 인스턴스를
		// 반환받는다.
		Singleton st2 = Singleton.getInstance();
		// demo_01.Singleton@5305068a
		System.out.println(st2);
	}
}
