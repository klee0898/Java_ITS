package demo_01;

import java.util.Scanner;

//Error : 개발자가 손쓸 수 없는 치명적 오류(시스템상의 오류)
//Exception(예외): 프로그램이 실행되는 과정에서 만나게되는 가벼운 오류

//예외처리 : 프로그램 실행과정에서 발생할 수 있는 예외를 예상해서
//미리 조치를 취하여 정상적으로 동작할 수 있도록 하기 위한 처리

//예외 종류를 크게 두가지로 분류
//1) 컴파일 타임에 체크되는 예외
//2) 실행중에 체크되는 예외(런타임 예외)

//try ~ catch
//try ~ catch ~ finally

// ** 예외처리를 하지 않으면 프로그램이 중단되버림
public class Exception_01 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			String str = sc.next(); // 단어를 입력받는 변수
			// 문자열 숫자를 => 정수형 숫자
			// NumberFormatException 발생
			int i = Integer.parseInt(str); //parseInt(문자열숫자) 
			System.out.println(i);
		}catch(NumberFormatException ne){
			System.out.println("숫자형식의 문자열이 아닙니다.");
			System.out.println("프로그램 종료~~");
			// return; // 메소드의 종료, finally 수행
			System.exit(0); // finally 수행 안됨
		}finally { // 예외가 발생하든 안하든 반드시 수행되는 블럭
			System.out.println("반드시 수행되어야하는 코드");
		}
		System.out.println("#############");
	}// 메소드의 종료
}
