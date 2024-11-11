package demo_02;

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
	        
	        // 입력받은 값을 변수 sel에 저장한다.
	        int sel = sc.nextInt();
	        
	        // sel 변수값이 0이면 while루프를 빠져나가는 if문 작성한다.
	        if(sel == 0) {
	        	break;
	        }
	        
	        // 입력값이 1이 아니면 프로그램 종료하도록 하시오.
	        if(sel != 1) {
	        	break;
	        }
	        
	        System.out.println("*** 좌석 예매 ***");
	        System.out.println("----------------------------");
			System.out.println("좌석 배치도(□:예매가능, ■:예매완료");
			System.out.println("----------------------------");
			System.out.println();
			
			// 좌석 번호를 출력하시오.
			for(int i = 0; i<seat.length; i++)
				System.out.print(i+1 + " ");
			System.out.println();
			// 배열 seat의 모든 요소값을 출력하시오.(수평으로 나란히 출력)
//			for(int i = 0; i < seat.length; i++) 
//				System.out.print(seat[i]+" ");
			
			// 향상된 for문
			for( String s : seat)
				System.out.print(s + " ");
			
			System.out.println();
			System.out.println("-------------");
			System.out.println("몇번 좌석을 예약하시겠습니까?");
			// 예약 좌석번호 입력받는다.
			int seatNum = sc.nextInt();
			
			seat[seatNum-1] = "■";
			System.out.println("["+seatNum+"]번 좌석이 예약되었습니다!!");
			
		}
		
		System.out.println("프로그램 종료~");
	}
}
