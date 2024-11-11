package demo_02;

public class ForEx {
	public static void main(String[] args) {		
//		for(int i = 1; i <=10; i++) {
//			System.out.println("안녕하세요");
//		}	
		
		// 1 ~ 10까지의 합
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum += i; // sum = sum + i
		}
		
		System.out.println("sum = " + sum);
		
	}
}
