package demo_01;

public class Exception_04 {
	public static void main(String[] args) {
		String[] str = {"하이", "안녕"};

		try {
			// ArrayIndexOutOfBoundsException
//			System.out.println(str[2]);
			
			// NumberFormatException
			int no = Integer.parseInt(str[1]);
			
			// NullPointerException
//			String str2 = null;
//			str2.trim(); // 좌우 공백없앰
			
//		}catch(Exception e) { // 부모예외는 자식 예외보다 먼저 올 수 없다.
//			System.out.println("예외 처리!!");
//			e.printStackTrace();
//		}catch(ArrayIndexOutOfBoundsException ae) {
//			System.out.println("인덱스 범위를 초과");
//		}catch(NumberFormatException ne) {
//			System.out.println("숫자문자열이 아닙니다~");
//		}catch(NullPointerException npe) {
//			System.out.println("널 값 확인하세요~");
			
//		}catch(ArrayIndexOutOfBoundsException | NumberFormatException | NullPointerException e) {	
//			System.out.println("예외 처리");
			
		}catch(Exception e) { // 위의 3개의 예외가 아닌 나머지 예외처리
			System.out.println("예외 처리!!");
			e.printStackTrace();
		}
	}
}
