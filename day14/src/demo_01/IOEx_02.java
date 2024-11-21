package demo_01;

import java.io.IOException;

public class IOEx_02 {
	public static void main(String[] args) throws IOException {
		byte[] arr = new byte[10];
		
		// 배열 3번 인덱스부터 5바이트를 저장, abcdef 입력시
		System.in.read(arr, 3, 5);
		
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");//0 0 0 97 98 99 100 101 0 0
		}
		
		// 문자열 생성하기
		System.out.println(new String(arr));//     abcde 
		
	}
}
