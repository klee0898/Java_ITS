package demo_05;

// enum(enumerate:열거하다) : 상수값을 모아서 선언한 클래스

//class M{
//	// 자기 자신을 생성해서 상수로 선언
//	static final M A = new M();
//	static final M B = new M();
//	static final M C = new M();
//}

// 위의 class M을 enum클래스로 아래와 같이 사용할 수 있다.
enum M {A, B, C};

public class Enum_01 {
	public static void main(String[] args) {
		M mVal= M.B; // static 변수는 클래스명.변수명
		
		// switch() 매개변수로 올 수 있는 것
		// 100(o), "abc"(o), 2.2(X), 'A'(o), true(x), enum상수(o)
		switch(mVal) {
		case A:System.out.println("A"); break;
		case B:System.out.println("B"); break;
		case C:System.out.println("C"); break;
		}
	}
}
