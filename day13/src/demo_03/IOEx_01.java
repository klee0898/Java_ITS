package demo_03;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IOEx_01 {
	public static void main(String[] args) throws IOException {
		InputStream is= System.in; // 입력스트림
//		Scanner sc = new Scanner(is);
//		String input = sc.next();
		
		PrintStream ps= System.out; // 출력스트림
//		ps.println("Hello");
//		ps.println(input);
		
//		System.in.read(); // 컴파일 타입 예외체크
		// 알파벳은 1바이트, ABCD~의 아스키값은 65,66,67,68,~
		// abcd~의 아스키값은 97,98,99,100~
//		int i = is.read(); // read() 한바이트씩 읽어서 정수로 리턴하는 메소드		
//		ps.print(i);
		int cnt=0;
		while(true) {
			System.out.println("문자를 입력하세요!!");
			// Enter의 키값은 아스키로 13, 10으로 이루어짐
			// 13(캐리지리턴값) + 줄바꿈(10)
			int ii = is.read();
			ps.println(ii);
			cnt++;			
			if(ii == 'z') { // char형 문자는 정수로 저장됨, 'z'는 ii와 비교 가능
				System.out.println("프로그램 종료~");
				break;
			}
		}
		ps.print(cnt + "바이트 읽음");
	}
}












