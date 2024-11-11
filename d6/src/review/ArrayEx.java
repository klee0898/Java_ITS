package review;

public class ArrayEx {
	public static void main(String[] args) {
		// 타입 변수명 = 값
		int[] x = {1,2,3}; // int는 x요소의 타입, x의 타입은 int[]
		int[] y = {4,5,6}; // y의 타입은 int[], 요소4의 타입은 int
		
		// x.length = 3;
		// 이차원 배열
		int[][] z = {x, y}; // z의 타입은 int[][], x의 타입은 int[]
		System.out.println(z[1][0]); //4
		
		int[][] zz = { // int[]는 zz 배열 요소의 타입
					  {1,2,3},
					  {4,5,6}
					 };
		
		int[][] yy = { // int[]는 yy 배열 요소의 타입
				{1,2,3},
				{4,5,6}
		};
		System.out.println(yy[0][1]);
		// yy.length = 요소의 수(행의 수)
		// yy[0].length, yy[1].length = 각 요소의 수(열의 수)
		for(int i=0; i < yy.length; i++) {
			for(int k=0; k<yy[i].length;k++) { 
				System.out.print(yy[i][k]+ " ");
			}
			System.out.println();
		}
		
		// 3차원 배열
		int[][][] zzz = {zz, yy}; // zzz 배열 요소의 타입은 2차원 배열(int[][])
		
		// 4차원 배열
		int[][][][] zzzz = {zzz};
		
		
		
		
		
		
	}

}
