package demo_041;

import demo_04.Parent;
// 접근 범위가 넓은거에서 좁은 순으로
// public > protected > default > private
public class Child extends Parent{
	public void go() {
		System.out.println(publicVar);
		// 다른 패키지임에도 불구하고
		// protected 제어자로 선언된 변수는 
		// 접근이 가능하다.
		System.out.println(protectedVar);
//		System.out.println(defaultVar);		
//		System.out.println(privateVar); // not visible, 접근 불가
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		child.go();
	}
}
