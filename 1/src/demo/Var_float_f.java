package demo;

public class Var_float_f {
//   프로그램의 시작은 main()에서 시작한다.
   public static void main(String[] args) {
//      데이터 타입(Data Type) = 자료형
//      기본형
      System.out.println("----- 정수형 -----");
      byte bt = 10;
//      1byte : -128 ~ 0 ~ 127
//      byte bt2 = 128; // 컴파일 오류
      byte bt3 = 127;
      
      // short : 2byte = 16bit
      short st = 1000;
//      short st = 322; // 컴파일 에러, 이미 있는 변수명
      st = 32767; // 재할당
      
      // int : 4byte = 32bit
      int intValue = 300;
      intValue = 1_000_000_000;
//      intValue = 10_000_000_000; // 0 10개 초과시 에러      
      System.out.println(intValue);
      
      // long : 8byte = 64bit
      long ln = 10_000_000_000L; // long형은 접미사 L을 붙인다.
      
      int a = 010; // 010 : 앞에 0이 붙으면 8진수로 인식 0 ~ 7
      // 앞에 0x가 붙으면 16진수로 인식 0 ~ 9, A,B,C,D,E,F
      int x = 0xAF; 
      
      System.out.println("----- 실수형 ------");
//      float ft = 1.2345; // 에러
      float ft = 1.2345f; // 접미사 f를 붙인다.
      
      double db = 0.321;
      System.out.println("----- 문자형 ------");
      // char : 2byte, 0 ~ 65535, 음수표현 없음
      // 영문(알파벳) : 1byte, 한글:2byte
      
      char ch = 'A'; // 홑따옴표 사용, 한문자만 사용가능
//      ch = ''; //빈값은 에러
      ch = ' ';
//      ch = '  '; //공백2개 이상이면 에러
      
      char ch2 = '가';
      System.out.println("ch2=" + ch2);
      
      
      
      
      
//      변수(Variable) 선언 : 자료형 변수명 = 값
      
//      명령줄 끝에는 ;
//      int apple = 10000 <-- 오류:(컴파일 에러)
      int apple = 10000; // 변수 초기화 : 변수생성
      apple = 3000; // 재할당
      System.out.println(apple);
      System.out.println("사과가격 : " + apple);
      
      
   }
}
