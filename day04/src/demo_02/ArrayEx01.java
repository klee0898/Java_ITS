package demo_02;

public class ArrayEx01 {
	public static void main(String[] args) {
		int[] list = {1,33,3,4,5,56};
		
		// list의 모든 요소 출력하기
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
		System.out.println("--------------");
		// 향상된 for문, list배열 요소 수만큼 반복
		// n = list[0], n = list[1],n = list[2],n = list[3],....
		for(int n : list) {
			System.out.println(n);
		}
		
		int even = 0;
		int odd = 0;
		// list 배열안의 짝수의 갯수를 구하시오.
		for(int i = 0; i<list.length; i++) {
			if(list[i]%2 == 0) { // 요소가 짝수인 경우만 1씩 추가
				even += 1;// even = even + 1;
			}else { // 홀수이면 1씩 추가
				odd += 1; //odd = odd + 1;
			}
		}
		System.out.println("짝수의 개수 = "+even);
		System.out.println("홀수의 개수 = "+odd);
		
		// 전체 요소의 수에서 짝수를 빼면 홀수
		System.out.println("홀수 갯수 = "+(list.length - even));
		
		System.out.println();
		// 향상된 for문으로 홀수/짝수의 갯수를 구하시오.
		odd = 0;
		for(int n : list) {
			if(n%2 == 1)
				odd +=1;
		}
		System.out.println();
		System.out.println("짝수의 개수 = "+(list.length - odd));
		System.out.println("홀수 개수 = " + odd);
	}
}
