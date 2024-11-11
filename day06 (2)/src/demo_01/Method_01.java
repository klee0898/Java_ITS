package demo_01;

import java.util.Arrays;

class A {
	int abc(int x, int y) {
		
		int sum = x + y;
		return sum;
	}
	// 배열 생성 방법
	// #1 자료형[] 배열명 = {요소, 요소,...} <-- 자료형 : 요소의 자료형
	//   ==> 자료형[] 배열명 = new 자료형[] {요소, 요소,...}
	// #1은 new 자료형[] 생략된 형태
	
	// ex> int[] arr = {1,2,3} ==> int[] arr = new int[] {1,2,3}
	
	// 리턴타입 1차원배열
	int[] bbb(){
//		return {1,2,3}; //에러
		return new int[] {1,2,3};
	}
	
	// 리턴타입은 int형의 일차원 배열
	int[] def(int a, int b) {
		// 참조변수 arr의 타입은 일차원배열 int[]
		// arr은 int타입의 요소를 갖는 1차원 배열
		int[] arr = {a+b, a-b, a*b}; // a-b의 타입은 int
		return arr;
	}
}

public class Method_01 {
	public static void main(String[] args) {
		A a = new A();
		int x = a.abc(1, 2);
		System.out.println("x = " + x);
		
		int[] arr = a.bbb();
		// Arrays클래스는 배열을 다루는 클래스(내장된 클래스)
		System.out.println(Arrays.toString(arr)); // [1, 2, 3]
		
		// def를 호출해서 리턴값을 출력하세요.
		int[] arr2= a.def(10, 3);
		System.out.println(Arrays.toString(arr2));//[13, 7, 30]
	}
}
