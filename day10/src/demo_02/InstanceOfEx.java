package demo_02;

class D{}
class E extends D{}
class F extends D{}

public class InstanceOfEx {
	public static void main(String[] args) {
		D e = new E();

		// instanceof는 실제 타입을 알아볼때 사용
		System.out.println(e instanceof D); // true
		System.out.println(e instanceof E); // true
		System.out.println(e instanceof F); // false
		
	}
}
