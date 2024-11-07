package demo;

public class Var2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 : 나열 ""감싸서 표현 
		
		//문자열변수
		String str = "Hello java!!";
		System.out.println(str);
		// 변수 선언
		int score;
		score = 99; 
//		값을 할당 위의 두줄을 한줄로 표현, 변수선언과 동시에 값을 할당=> 초기화 
		int score2 = 100;
//		변수선언규칙
//		int 9abc = 10;error , 숫자 앞에 오면 x
//		int class = 10;error , 예약 
//		int class = 100;
	    int _abc = 100;
	    int a_b_c = 100;// _, $는 사용 가능
//	    int a&bc = 100; // 특수문자 사용불가
	    int a$$ = 10;
	      
	      // 상수선언 : 대문자를 사용, 키워드로 final을 앞에 붙인다.
	    final int MAX = 10000;
//	      MAX = 999; // 상수는 값을 변경할 수 없음.
	      
	    final double PI = 3.14;


	}

}
