package demo2;
// 연산자 + - * / 그리고 나머지 연사자 %
public class OperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		num = num + 2; // num +=2
		num = num - 2; // num -=2
		num = num * 2; // num *=2
		num = num / 2; // num /=2
// num +=2
		
		System.out.println("num = " + num);
		num = 7;
		num = num % 2; // num %=2
		System.out.println("num = " + num);
		System.out.println("--비교연산===");
		System.out.println(5 == 5);
		System.out.println(5 >= 3);
		System.out.println(5 != 3);

		System.out.println("--관계연산===");
		int aa = 50; int bb=60;
		
		 boolean b = (aa > bb) && (aa > 0); // AND 연산
	      System.out.println("b = " + b);
	      
	      b = (bb < aa) || (bb < 0); // OR 연산
	      System.out.println("b = " + b);
	      
	      System.out.println("-------- 삼항(조건) 연산자 -------");
	      int x = 100, y= 200;
	      
	      // 조건 ? 조건이 참일때 값 : 조건이 거짓일때 값      
	      int max = (x > y) ? x : y;
	      System.out.println("max = " + max);
	      
	      int min = (x < y) ? x : y;
	      System.out.println("min = " + min);
	      
	      // 컴파일 에러 해결하기
	      String str = (x!=y) ? "다르다" : "같다";
	      System.out.println("str = " + str);
	      
	      // 단항 연산자 : ++, --, i++ ==> i = i +1, i-- ==> i = i - 1
	      System.out.println("--------- 단항 연산자 ---------");
	      int val = 1;      
	      // 출력후 1 증가      
	      System.out.println("val++ = " + val++); // 후치연산 val = val+1
	      System.out.println("val = "+val);
	      System.out.println();
	      
	      int val2 = 1;
	      // ++val2 => val2 = val2 + 1
	      // 출력 전 1 증가      
	      System.out.println("++val2 = " + ++val2); // 전치연산 
	      
	      System.out.println();
	      int a = 10;
	      System.out.println("a = " + a);
	      a++; // a = a + 1
	      System.out.println("a = " + a);
	      
	      System.out.println();
	      int i = 3;
	      int v; // 기본형의 기본값은 0
	      v = i++; // i값을 먼저 v에 할당 후 i=i+1
	      System.out.println("v = "+v);
	      System.out.println("i = " + i); // i는 4
	      
	      System.out.println();
	      int ii = 3;
	      int vv;
	      vv = ++ii; // 먼저 ii = ii + 1 한 후 vv에 할당한다.
	      System.out.println("vv = " + vv);
	   }
	}
