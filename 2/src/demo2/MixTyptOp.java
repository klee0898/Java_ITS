package demo2;

public class MixTyptOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub// 혼합타입의 연산 결과
		int i = 10;
		double d = 3.5;
		
		  // 정수 + 실수 ==> 실수 (사칙연산 모두 동일)
//      int res = i + d; // 에러
      double res = i + d;
      System.out.println("res = " + res);
      
      // 정수 - 실수 ==> 실수
      double res_ = i - d;
      System.out.println("res_ = " + res_);
      
      // 정수 + 실수의 결과를 정수로 받으려면 ?      
//      int res1 = (int)i + d; // () 캐스팅 연산자의 우선순위가 + 보다 높다 => 에러
      
      int res1 = (int)(i + d);
      System.out.println("res1 = " + res1);


	}

}
