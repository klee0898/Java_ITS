package review;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in); 
		
		String[] seat = {"□","□","□","□","□"};
		
		while(true) {
			System.out.println("=============");
	        System.out.println("좌석 예매 pgm");
	        System.out.println("=============");
	        System.out.println("1.예매  0.종료");
	        System.out.println("=============");
	        System.out.println("메뉴 선택 >");	
	        
	        int selMenu = sc.nextInt();
	        if(selMenu == 0) break;
	        
	        if(selMenu != 1) break;
	        
	        System.out.println("********* 좌석 예매하기 *********");
	        while(true) {
				System.out.println("----------------------------");
				System.out.println("좌석 배치도(□:예매가능, ■:예매완료");
				System.out.println("----------------------------");
				System.out.println();
				// 배열의 길이를 이용해서 좌석번호를 출력
				int size = seat.length;
				for(int i=0; i<size; i++)
					System.out.print(i+1+" ");
				System.out.println();
				// 배열 요소를 출력
				for(String s : seat) {
					System.out.print(s+" ");
				}
		        System.out.println();
		        System.out.println("몇번 좌석을 예약하시겠어요?");
		        // 예약 좌석번호 입력
		        int reservedNum= sc.nextInt();
		        
		        if(seat[reservedNum-1].equals("□")) { // 예약가능
		        	seat[reservedNum-1] = "■";
		        	System.out.println("["+reservedNum+"]번 좌석이 예약되었습니다!!");
		        	break;
		        }else { // 예약불가
		        	System.out.println("이미 예약된 좌석입니다.., 다시 확인하세요");
		        }
	        }// while
	        
		}// while
		
		System.out.println("프로그램 종료~");
	}

}
