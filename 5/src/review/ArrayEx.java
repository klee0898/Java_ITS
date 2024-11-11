package review;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		// #1 배열(Array) 생성
				int[] arr = {11, 22, 33};
				
				System.out.println(arr.length);
				// 위 배열의 모든 값을 출력하시오.
				for(int i =0; i < arr.length; i++) {
					System.out.println("arr["+i+"] = " + arr[i]);
				}
				System.out.println();
				// 향상된 for문 => for(배열 요소를 저장할 변수 : 배열명)
				// 요소의 개수만큼 반복
				for(int item : arr) { // item=11, item=22, item=33
					System.out.println(item);
				}
				System.out.println();
				// #2 배열 생성
				int[] arr2 = new int[5]; // int의 기본값 0으로 초기화
				
				for(int i =0; i < arr2.length; i++) {
					System.out.println("arr2["+i+"] = " + arr2[i]);
				}
				
				for(int item : arr2)
					System.out.println(item);
				
				System.out.println("--------");
				// Arrays : 배열을 관리하는 클래스, 반복문 없이 배열 값 확인
				System.out.println(Arrays.toString(arr));
				System.out.println(Arrays.toString(arr2));
				System.out.println("---------");
				
				// 배열명을 출력하면 배열의 메모리 위치(주소)를 출력한다.
				// 메모리 주소는 16진수로 표현
				System.out.println(arr); // [I@1fb3ebeb
				System.out.println(arr2); // [I@548c4f57

				char[] carr = {'a', 'b', 'c'};
				// char형의 배열명을 출력시 예외적으로 배열요소를 연결해서 출력함
				System.out.println(carr); // abc
	}

}
