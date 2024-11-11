package review;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 > ");
		int kor = sc.nextInt();
		
		System.out.println("영어 점수 입력 > ");
		int eng = sc.nextInt();
		
		System.out.println("수학 점수 입력 > ");
		int mat = sc.nextInt();
		
		// 총점 변수 : total
		int total = kor + eng + mat;
		
		// 평균 변수 : avg, 정수/실수 = 실수
		double avg = total / 3.0;
		
		System.out.println("------------------");
		System.out.println("국어\t영어\t수학");
		System.out.println("------------------");
		System.out.println(kor+"\t"+eng+"\t"+mat);
		System.out.println("------------------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
	}
}
