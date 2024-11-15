package demo_02;

// this() : 자기 자신의 클래스내에서 다른 생성자를 호출할 때 사용
class AAA{	
	AAA(){}
	AAA(int a){System.out.println(100);} // 생성자
	void AAA(int n) {System.out.println(n);} // 메서드
	
	AAA(String s){ // 생성자
		this(1111); // 항상 첫줄에 와야한다.
		AAA(222);// 메소드 호출
	}
}

public class ThisEx {
	public static void main(String[] args) {
		AAA aaa = new AAA("하이");
	}
}
