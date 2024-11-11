package demo_02;

public class ForEx2 {
	public static void main(String[] args) {
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
		
		// 6행 5열의 별찍기 총반복횟수 6 X 5 = 30
		// 바깥 for문이 1바퀴 돌때마다 안쪽 for문은 5바퀴 돈다.
		for(int j=1; j<=6;j++) {
			for(int i=1; i<=5;i++) {
				System.out.print("*");			
			}
			System.out.println();
		}
	}
}
