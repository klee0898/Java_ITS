package demo_03;

class AAA{
	int a = 100;
}

// super : 부모 인스턴스 주소
// this : 자신의 인스턴스 주소
class BBB extends AAA{
	int a = 200;
	void abc() {
		System.out.println(a); // 200, a앞에 this 생략됨.
		System.out.println(this.a); // 200, this는 BBB의 인스턴스
		System.out.println(super.a); // 100
	}
}

public class Inheritance04 {
	public static void main(String[] args) {
		BBB bbb = new BBB();
		bbb.abc();
	}
}
