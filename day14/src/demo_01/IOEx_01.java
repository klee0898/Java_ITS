package demo_01;

import java.io.IOException;

public class IOEx_01 {
	public static void main(String[] args) throws IOException {
//		int n = System.in.read();
//		System.out.println(n);
//		n = System.in.read();
//		System.out.println(n);
//		n = System.in.read();
//		System.out.println(n);
//		n = System.in.read();
//		System.out.println(n);
		byte[] arr = new byte[5];
		
		int n2 = System.in.read(arr); // n2는 읽은 바이트 수
		System.out.println(n2 + "바이트 읽음");
		
		for(byte b : arr) {
			// ab입력시
//			System.out.println(b); 97 98 13 10
			System.out.println((char)b);
		}
	}
}
