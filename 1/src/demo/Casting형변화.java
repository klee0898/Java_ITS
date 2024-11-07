package demo;

// 형변환(캐스팅)
public class Casting형변화 {
   public static void main(String[] args) {
      char ch = 'A';
      System.out.println("ch = " + ch);
      System.out.println("ch + 1 = " + ch + 1);
      
//      문자형은 산술연산시에 정수로 형변환이 된다.(묵시적형변환)
      System.out.println("ch + 1 = " + (ch + 1));
      
      float ft = 1.234f;
//      int a = ft; // 컴파일 에러, 실수그릇이 더크다
      int a = (int)ft; // int형으로 변환
      System.out.println("a = " + a); // 소수점 자리 손실
      
      byte b1 = 10;
      byte b2 = 20;
      
//      byte result = b1 + b2; // 컴파일 에러
      
      // int형보다 작은 데이터형(byte, short, char)이 산술연산 될 경우
      // int형으로 자동형변환 된다.
      int result = b1 + b2;
      
      char ch1 = 'A'; 
      char ch2 = 'B';
      
      // 값과 그릇의 타입은 일치
      int res = ch1 + ch2;
      
      int res2 = ch2 + 1;
      // 강제적(명시적) 형변환
      char ch3 = (char)res2;
      System.out.println("ch3 = " + ch3);
      
      
      System.out.println("---논리형(boolean)-----");
      
      
   }
}

