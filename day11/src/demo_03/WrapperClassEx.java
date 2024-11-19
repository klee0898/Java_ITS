package demo_03;

public class WrapperClassEx {
	public static void main(String[] args) {
		
//		int num = 100;
		// 기본형 --> 참조형 // autoboxing
		Integer num = 100;
		
		// 참조형 --> 기본형
		int n = num; // unboxing
		
		// 예전버전에서 intValue()를 사용
		int n2 = num.intValue(); // unboxing
		
		// Wrapper클래스 사용
		int n3 = Integer.parseInt("10000");// parseInt() 리턴 타입 =>int
		Integer n4 = Integer.parseInt("10000"); // autoboxing
		
		Short sNum = 1000; // autoboxing
		short sn = sNum.shortValue(); // unboxing
	}
}
