package demo_04;

public class Child extends Parent{
	public void go() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
		System.out.println(defaultVar);		
//		System.out.println(privateVar); // not visible, 접근 불가
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		child.go();
	}
}
