package demo_01;

//import java.lang.Math; // 자동으로 JVM이 불러옴

public class MathEx {
	public static void main(String[] args) {
		// abs() : 절대값 구함
		System.out.println(Math.abs(-10));
		
		// max(a, b) : a와 b 값 중 큰값을 리턴
		System.out.println(Math.max(10, 100));
		// min(a, b) : a와 b 값 중 작은값을 리턴
		System.out.println(Math.min(10, 100));
		
		//ceil(double 타입의 실수) : 천정값
		// ceil(double x)
		System.out.println(Math.ceil(3.2)); //4.0
		System.out.println(Math.ceil(-3.2)); //-3.0
		
		// floor(double x)
		System.out.println(Math.floor(3.2)); // 3.0
		System.out.println(Math.floor(-3.2)); // -4.0
		
		// round(double x)
		System.out.println(Math.round(3.2567)); // 3
		System.out.println(Math.round(3.567)); //4		
		
		// pow(a, b) : a의 b승
		System.out.println(Math.pow(2, 3)); // 8
		
		// sqrt() : 제곱근
		System.out.println(Math.sqrt(16)); // 4
		
		// PI : 파이값(3.1415...)
		System.out.println(Math.PI);
		System.out.println();
		
		// random() : 난수(0.0 ~ 1.0 사이의 임의의 값)
		System.out.println(Math.random());
		
		// 0 ~ 9 사이의 정수값 발생하기 
		// 0.0 <= Math.random() < 1.0, 
		// 10을 곱하면 0 <= (Math.random() * 10) < 10.0
		double m = Math.random() * 10;
		System.out.println( m );
		System.out.println( (int)m );// 소수점 제거됨
		
		// 0 ~ 99 사이의 정수값 발생
		double n = Math.random() * 100;
		System.out.println(n);
		System.out.println((int)n);
	}
}
