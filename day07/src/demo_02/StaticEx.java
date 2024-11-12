package demo_02;

class A{
	// 인스턴스 메소드
	void aaa() {System.out.println("aaa()");}
	
	// static이 안붙은 메소드 (non-static메소드) == 인스턴스 메소드
	void abc() {
		System.out.println("A의 abc()");
		// 같은 클래스 내에서 호출시 주소 생성없이 바로 호출
		aaa();
	}
}

class Employee {
	// non-static 변수 (인스턴스 변수)
//	int empCnt = 0;
	
	// 스태틱변수(=클래스변수), 공유변수
	static int empCnt = 0; // 주소생성과 무관하게 메모리에 만들어짐
	
	public Employee() {
		empCnt++;
	}
}


// main() 메소드는 JVM(자바가상머신)이 호출한다.
// 메소드를 호출하려면 메모리에 메소드가 존재해야 한다.
// static이 붙은 메소드는 주소 생성없이도 자동으로 메모리에 만들어 진다.
// 따라서, JVM이 주소생성 없이 main() 메소드를 호출 할 수 있다.

public class StaticEx {
	// static 메소드
	static void abc() {
		System.out.println("StaticEx의 abc()");
	}
	// non-static 메소드 (== 인스턴스 메소드)
	void aaa() {System.out.println("aaa()");}
	
	// static 메소드, main() 메소드는 JVM이 호출
	public static void main(String[] args) { // 프로그램 시작
		A a = new A();
		a.abc();
		// static이 붙은 변수나 메소드는 주소생성 없이 접근, 호출할 수 있다.
		abc();
//		aaa(); // 에러
		StaticEx se = new StaticEx();
		se.aaa(); // 주소생성 후 호출
		
		// 주소 생성없이 empCnt에 접근, 
		// 클래스명.empCnt로 접근
//		System.out.println(Employee.empCnt);
		
		Employee emp1 = new Employee();
		System.out.println("사원수 = " + emp1.empCnt + "명");
//		System.out.println("사원수 = " + Employee.empCnt + "명");
		
		Employee emp2 = new Employee();
		System.out.println("사원수 = " + emp2.empCnt + "명");
//		System.out.println("사원수 = " + Employee.empCnt + "명");
		
		Employee emp3 = new Employee();
		System.out.println("사원수 = " + emp3.empCnt + "명");
//		System.out.println("사원수 = " + Employee.empCnt + "명");
		
	}// 프로그램 종료
}
