package review;

import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		// 극장 좌석 만들기
		String[][] seats = new String[10][10];
		
		String[] row = {"A","B","C","D","E","F","G","H","I","J"};
		
		// 값 입력
		for(int i =0; i < seats.length; i++) {
			for(int j=0; j < seats[i].length; j++) {
//				seats[i][j] = j+1; // 컴파일 에러, j+1은 수치형
//				seats[i][j] = j+1+""; // j+1+"" => 문자열(String)
//				seats[i][j] = row[i]+j+1; // A01, A12, A13, ....
				seats[i][j] = row[i]+(j+1); // 문자열+(j+1)
			}
		}
		
		// 좌석 예매
//		seats[3][3] = "--";
//		seats[5][7] = "--";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("좌석 번호 2자를 입력하세요(예: 00 ~ 99) > ");
		int seatNum = sc.nextInt();
		
		int i1 = seatNum / 10; // 몫
		int i2 = seatNum % 10; // 나머지
		
		seats[i1][i2] = "--";		
		System.out.println(row[i1]+(i1+1)+"이 예약되었습니다.");
		
		System.out.println();	
		
		// 값 출력
		for(int i =0; i < seats.length; i++) {
			for(int j=0; j < seats[i].length; j++) {
				System.out.print(seats[i][j]+ " "); 
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
