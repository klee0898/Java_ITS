package demo_01;

public class DoWhileEx {
	public static void main(String[] args) {
//		int a; // 선언
//		int b = 100; // 값을 할당 --> 초기화
		
		int i = 1, j = 10; // 두 변수가 모두 int형 인 경우 동시에 초기화 가능
		
//		do {
//			System.out.println("i = " + i);
//			j--; // j = j - 1;
//		} while(j > 5);
		
		// break문을 수행하지 않는다.
		do {
			if(i>j) break;  
			System.out.println("i :"+i);
			j--;
		}while(++i<5);
	}
}
