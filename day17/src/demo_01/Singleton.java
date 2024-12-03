package demo_01;

// 싱글톤패턴 : 인스턴스(복제물)가 하나만 생성되도록 보장하는 패턴
public class Singleton {
	
	private static Singleton instance;
	
	// 외부에서 접근 불가(외부에서는 생성자 호출 못함)
	private Singleton() {
		System.out.println("생성자 호출");
	}
	
	// 외부에서는 gieInstance()를 통해서
	// 인스턴스 생성이 가능
	// 최초에 한번 인스턴스가 생성되면
	// 그이후에는 더이상 새로운 인스턴스가 생성되지 않는다.
	// 최초의 인스턴스가 반환됨
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
}
