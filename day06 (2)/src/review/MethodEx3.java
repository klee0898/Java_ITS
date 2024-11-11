package review;

//변수의 종류
//1. 자료형에 따라 구분 
//1.1 기본형(정수, 실수, 문자, 논리)
//1.2 참조형(클래스, 배열, 인터페이스, enum)

//2. 선언 위치에 따라 구분
//2.1 전역변수(멤버 변수) : 메서드 블럭 바깥쪽에 선언된 변수
//2.2 매개 변수 : 메서드 소괄호에 선언된 변수(지역변수)
//2.3 지역(local) 변수 : 메서드 블럭 안쪽에 선언된 변수
//단, 매개변수는 선언과 동시에 값을 할당할 수 없다.

class AA{ // AA 클래스의 멤버는 x, abc(), def()
	int x = 111; // 전역변수(멤버변수) : 클래스 블록{} 어디서든 사용가능
	
	void abc(int a) { // 매개변수 a는 지역변수
		int b = 100 - a; // 지역변수b는 메서드 블럭 내부에서만 사용가능
		System.out.println(b);
	}
	void ccc() {
		int x = 222; // 전역변수 x와 변수명이 같은 지역변수
		System.out.println(x); // 지역변수값 222
	}
	
	void fff() {
		int a; // 지역변수 선언
		// 컴파일 에러 : 지역변수는 선언 후 값을 할당하지 않고 사용하면 에러 발생
//		System.out.println(a); 
		a = 2000;
		System.out.println(a);
	}
	
	void def() {
//		System.out.println(b); // 컴파일에러, 지역변수 b는 사용불가
		System.out.println(x); // 전역변수 x는 어디서든 사용가능
	}
	
	void ddd(int a, int b) {
		System.out.println("합 : " + (a + b));
	}
	
	int eee(int a, int b) {
		
		return a + b;
	}
}

public class MethodEx3 {
	public static void main(String[] args) {
		// AA의 abc() 호출하기
		AA aa = new AA();
		aa.abc(1000);
		// ddd() 호출
		aa.ddd(10, 20);
		
		System.out.println(aa.eee(11, 22));
		
		// 리턴값을 활용
		int y = aa.eee(11, 22);
		System.out.println(y);
		
		aa.ccc();
		
	}
}
