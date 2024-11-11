package demo_01;

// 배열(Array)
public class ArrayEx03 {
	public static void main(String[] args) {
		int[] v = {1,2,5,9};
		System.out.println(v[0]);
		System.out.println(v[1]);
		System.out.println(v[2]);
		System.out.println(v[3]);
		
		System.out.println("----------");
		// for문을 이용해서 v배열의 값을 모두 출력하기
		for(int i=0; i<4; i++) {
			System.out.println("i = "+i+", "+v[i]);
//			System.out.println(v[i]);
		}
		System.out.println("----------");
		// 배열의 길이가 커서 잘모르는 경우 ==> 배열의 길이를 구해서 반복
		for(int i=0; i<v.length; i++) {
			System.out.println("i = "+i+", "+v[i]);
		}
		
		// 1부터 10까지의 합구하기
		/*
		int sum = 0;
		for(int k=1; k<11; k++){
			sum = sum + k;
		}  
		*/
		// 반복문을 활용해서 a의 배열 요소(item)의 합을 구하시오.
//		int sum = 0;
//		sum = sum + a[0];
//		sum = sum + a[1];
//		sum = sum + a[2];
//		sum = sum + a[3];
		
		int[] a = {10, 20, 30, 40};
		
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i]; // sum = sum + a[i];
		}
		System.out.println("sum = " + sum);
		
		// 배열의 마지막 요소값을 출력
		System.out.println(a[3]);
		// 배열의 길이를 모를 때 마지막 요소값
		int size = a.length;
		System.out.println(a[size - 1]);
		
		
		
		
	}
}
