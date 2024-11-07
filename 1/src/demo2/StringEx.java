package demo2;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 1.234f;
		System.out.println("d=" + d);
		
		String number = "1000";
	
		
		
		  // 숫자를 문자열 숫자로 변환
	      // String.valueOf(숫자) ==> 문자열 숫자
	      String a = String.valueOf(1000); // 1000 --> "1000"
	      
	      String ss = "Hello World!!"; // 기본형 처럼 선언
	      String ss2 = new String("Hello World!!");
	      
	      // ss 변수의 길이(문자열의 길이)
	      System.out.println(ss.length()); // 13
	      
	      // 문제 > ss 문자열의 길이를 변수 len에 담아서 출력하시오.
	      int len = ss.length();
	      System.out.println("len = " + len);
	      
	      
	   }
	

}
