package demo_02;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

// 인코딩 : 컴퓨터가 이해하기 쉽게 변환해 주는 것(bit변환) 
// 디코딩 : 사람이 이해하기 쉽게 변환해 주는 것(bit --> 문자)
public class EncodingDecoding {
	public static void main(String[] args) throws Exception {
		String str = "한글";
		
		// String클래스에 getBytes(운영체제의 인코딩형식) : 문자열을 byte 타입의 배열로 변환
//		byte[] bytes = str.getBytes();
		
		// 인코딩
		// 컴파일 타임 예외처리
		// ms949, euckr는 한글 한문자를 2byte로 처리
		byte[] ms949= str.getBytes("MS949"); // window 인코딩
		byte[] euckr= str.getBytes("EUC-KR"); // linux, unix계열의 인코딩
		// utf8은 한글 한문자를 3byte로 처리
		byte[] utf8= str.getBytes("UTF-8"); // 다국어 지원되는 인코딩 형식
		
		// 숫자하나는 1바이트 => 4개의 숫자 4바이트
//		[-57, -47, -79, -37] => [-57, -47](한), [-79, -37](글)
		System.out.println("ms949 : " + Arrays.toString(ms949));
		System.out.println("euckr : " + Arrays.toString(euckr));
		
		// 6바이트
		// [-19, -107, -100, -22, -72, -128] => -19, -107, -100(한)
		System.out.println("utf8 : " + Arrays.toString(utf8));
		
		// 디코딩
		String sMs949= new String(ms949, "MS949");
		String sEuckr= new String(euckr, "EUC-KR");
		String sUtf8= new String(utf8, "UTF-8");
		System.out.println(sMs949);
		System.out.println(sEuckr);
		System.out.println(sUtf8);
	}
}
