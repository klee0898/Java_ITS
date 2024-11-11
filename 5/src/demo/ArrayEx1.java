package demo;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] x = {1,2,3};
		int[] y = {4,5,6};
		
		// 이차원 배열
		int[][] z = {x, y};
		System.out.println(z[1][0]); //4
		
		int[][] zz = {
					  {1,2,3},
					  {4,5,6}
					 };
		
		System.out.println(zz[1][0]); //4
		System.out.println(zz[0][1]); //2
		
		// 행의 수
		System.out.println("행의 수 : " + zz.length);// 2
		
		// 열의 수
		System.out.println("열의 수 : " + zz[0].length);// 3
		System.out.println("열의 수 : " + zz[1].length);// 3
		
		int[][] zzz = {
						{1,2,3},
						{4,5,6,7}
		              };
		// zzz의 행의 수를 구하시오.
		System.out.println("zzz행수 = " + zzz.length);
		System.out.println("zzz[0] 열수 = " + zzz[0].length);
		System.out.println("zzz[1] 열수 = " + zzz[1].length);
		System.out.println();
		// for문을 이용해서 zzz의 요소 값을 모두 출력하시오. 7번 반복
		for(int i = 0; i<zzz.length; i++) { // 행수 : zzz.length = 2 
			for(int k=0; k<zzz[i].length; k++) // k<zzz[0].length=3,k<zzz[1].length=4
				// [0][0],[0][1],[0][2]  
				// [1][0],[1][1],[1][2],[1][3]
				System.out.print(zzz[i][k]);
			System.out.println();
		}
	}
}


