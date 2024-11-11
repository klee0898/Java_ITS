package demo_02;

import java.util.Scanner;

public class Book_Ex3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String grade = "F";
		
		System.out.println("숫자를 입력하세요.");
		int score = sc.nextInt();
		
		if(score >=90)	grade = "A";
		else if(score >= 80) grade = "B";
		else if(score >= 70) grade = "C";
		else if(score >= 60) grade = "D";
//		else grade = "F";
		
		System.out.println("당신의 학점은 " + grade +" 입니다.");	
		
		// 문제> 위의 다중 if문을 switch문으로 작성하세요.
		
		
		
	}
}
