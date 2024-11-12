package demo_02;

class AA {
	static int a;
}

public class VarEx01 {
   // 멤버변수(인스턴스변수, 클래스변수(== 스태틱변수)) == 전역변수
   // 전역변수는 초기화하지 않으면 기본값이 할당된다.
   static int aa;
   int bb = 100;
   static int cc = 200;
   int dd;
   
   // 기본 생성자
   VarEx01(){
      dd = 300;
   }
   // 인자 생성자
   VarEx01(int i){
      dd = i;
   }
   
   public static void main(String[] args) {
	   System.out.println("aa = "+VarEx01.aa);//클래스명.변수명
	   System.out.println("aa = "+aa); // 같은 클래스의 스태틱변수 접근시 클래스명 생략가능
	   System.out.println("cc = "+cc); 
	   VarEx01 ve = new VarEx01();
	   System.out.println(ve.bb);
	   
	   System.out.println("a = " + AA.a); // 클래스명.변수명
   }

}
