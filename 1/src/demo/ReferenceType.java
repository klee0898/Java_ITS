package demo;

public class ReferenceType {
   public static void main(String[] args) {
      // 참조형 변수이면서 문자열 변수
      // 문자열 변수는 너무 사용하기 때문에 
      // 기본형처럼 선언할 수 있도록 해둠
      String str = "abce";
      System.out.println(str);
      
      // 기본형 선언 방법
      int aa = 100;
      
      // 참조형 변수 일반적 선언 방법
      String str2 = new String("abcd");
      System.out.println("str2 = " + str2);
      
      // 문자열 연산 : +
      System.out.println(str + str2 + "zzzz");
   }
}