package demo_01;

import java.util.Scanner;

public class ArrayEx02 {
	public static void main(String[] args) {
		// 극장 좌석 만들기
		String[][] seats = new String[10][10];
		
		String[] row = {"A","B","C","D","E","F","G","H","I","J"};
		
		// 좌석표 만들기
		for(int i =0; i <seats.length; i++) { // 행의 수
			for(int j =0; j<seats[i].length; j++) {
//				seats[i][j] = j+1+""; // anyType + 문자열 = 문자열, 문자열+anyType=문자열 
//				seats[i][j] = "A"+j+1; 
//				seats[i][j] = "A"+(j+1); 
				seats[i][j] = row[i]+(j+1); 
			}
		}
		
		// 좌석번호 출력
		for(int i =0; i <seats.length; i++) { // 행의 수
			for(int j =0; j<seats[i].length; j++) {
				System.out.print(seats[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 좌석 예약 번호 체크
//		seats[2][3] = "--"; // C4
//		seats[7][5] = "--"; // H4
		
		System.out.println("예약번호 2자리를 입력하세요 >");
		Scanner sc = new Scanner(System.in);
		
		int seatNum = sc.nextInt();
		
		int rIdx = seatNum / 10;
		int cIdx = seatNum % 10;

		System.out.println(row[rIdx]+(cIdx+1)+"이 예약되었습니다.");
		seats[rIdx][cIdx] = "--";
		
		System.out.println();		
		
		for(int i =0; i <seats.length; i++) { // 행의 수
			for(int j =0; j<seats[i].length; j++) {
				System.out.print(seats[i][j] + " ");
			}
			System.out.println();
		}
	}
}
