package demo_02;

class DD{
	void abc() {
		int a; // 변수선언
		// 지역변수는 반드시 초기화(값할당)를 해야 한다.
//		System.out.println(a);// 컴파일 에러
		a = 0;
		System.out.println(a);
	}
}

class Gugudan{
	void print(int dan) {
		for(int i = 1; i<10; i++) {
			System.out.print(dan);
			System.out.print("x");
			System.out.print(i);
			System.out.print("=");
			System.out.print(dan*i+"\n");
		}
	}
}

public class Method03 {
	public static void main(String[] args) {
		Gugudan g = new Gugudan();
		g.print(3);
		System.out.println();
		g.print(5);
	}
}
