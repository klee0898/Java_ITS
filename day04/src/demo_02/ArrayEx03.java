package demo_02;

public class ArrayEx03 {
	public static void main(String[] args) {
		
		
		int[] arr; 
		// int[5] arr; <--- 방의 수를 정하고 값을 할당하지 않으면 에러
		
//		int aa; // 선언
		int aa = 10; // 초기화(값을 할당)
		
		// 빈방 5개를 만듦, int형의 기본값 0이기 때문에
		// 각 방에는 0으로 초기화되었음
		int[] a = new int[5]; 
		
		for(int i : a) {
			System.out.println(i);
		}
		
		// 각방에 값을 할당
		a[2] = 3;
		System.out.println("a[2] = " + a[2]);
		
		for(int i=0; i<a.length; i++) {
			a[i] = i+1; // a[0]=0+1, a[1]=1+1, a[2]=2+1,...
		}
		// 각 방의 값을 출력
		for(int k : a) {
			System.out.println(k);
		}
		
		char[] carr = {'a', 'b', 'c'};
		for(char ch : carr)
			System.out.print(ch);
	}
}
