package demo_02;

import java.io.IOException;

// 예외처리 방법
// #1. try ~ catch
// #2. throws

// main()의 호출은 jvm(자바가상머신)
public class Exception_01 {
	public static void main(String[] args) throws IOException {
		// try ~ catch : 직접 예외처리
		// 메소드명 옆에 throws 예외명 : 선언형 예외처리
		
		// 선언형 예외처리는 해당 메소드를 호출한 곳에 던진다는 의미
		// 즉, 호출한 곳에서 예외처리를 하라는 의미
		
		// read() : System.in(= 표준입력장치)로 부터 1바이트씩 읽어오는 메소드
		// IOException(입출력 예외)는 컴파일 타임에 예외처리
		int in = System.in.read(); // 컴파일 타임 예외		

	}
}
