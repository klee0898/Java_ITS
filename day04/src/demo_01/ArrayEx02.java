package demo_01;

// 배열(Array)
public class ArrayEx02 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		// 컴파일에러를 해결하시오.
//		b = {"aa", "bb"};
//		c = {0.3, 12.11};
		
		String[] b = {"aa", "bb"};
		double[] c = {0.3, 12.11};
		
		int num = 100;
		int[] a = {100, 200, num};
		
		String s1 = "", s2 = "java";
		String[] aa = {s1, s2};
		
		// 아래와 같이 출력되도록 배열을 만드세요.
		double[] v1 = {0.2, 1.1};
		int[] v2 = {11, 100, 12};
		String[] v3 = {"h", "", "Hello"};
		
		System.out.println(v1[0]); // 0.2
		System.out.println(v2[1]); // 100
		System.out.println(v3[2]); // Hello
		
		System.out.println("--------------");
		int[] x = {0,1,2,3,4};
		
		// 배열의 길이 구하기 : x(배열변수명).length
		int len = x.length;
		System.out.println("배열 x의 길이 : "+len);
		
		// 배열 만들기 #2
//		int[] y;
//		y = new int[10];
		
		// 위의 두라인 한줄로 표현
		// 10개의 방이 있는 배열 y를 생성
		// 자료형[] 배열변수명 = new 자료형[방갯수]
		int[] y = new int[10]; //여기서 y는 참조형 변수
		
		System.out.println(y.length); // 10
		
	}
}
