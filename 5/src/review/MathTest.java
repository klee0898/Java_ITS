package review;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub      
		// 문제> 반지름이 5인 원의 면적과 원둘레를 구하시오.
	    // 원면적 : 반지름*반지름*파이
	    // 원둘레 : 2*파이*반지름
		
		// 원면적
		double area = 5*5*Math.PI;
		System.out.println("원면적 : " + area);
		// 소수점 4자리까지 
				System.out.printf("원면적 : %.4f\n\n", area);
				
		// 원둘레
		double radius = 2*Math.PI*5;
		System.out.println("원둘레 : " + radius);
		System.out.printf("원둘레 : %.3f",radius);

	}

}
