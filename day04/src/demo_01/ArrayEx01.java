package demo_01;

// 배열(Array)
public class ArrayEx01 {
	public static void main(String[] args) {
		// 배열 만들기
		int[] a = {1, 2, 3};
		int b[] = {11, 22, 33};
		
		// 배열 a의 첫번째 방의 값을 가져오기
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("-----------");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		int[] aa = {10, 20, 30};
		// 30을 출력하시오.
		System.out.println(aa[2]);
		
		// ArrayIndexOutOfBoundsException
//		System.out.println(aa[3]);
		
		
	}
}
