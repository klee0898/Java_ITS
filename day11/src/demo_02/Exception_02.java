package demo_02;

public class Exception_02 {
	public void showMsg() {
		// 직접 예외처리 수행
		try {
			int intVal = 10/0;
			System.out.println(intVal);
		} catch (Exception e) {
			System.out.println("ArithmeticException 예외 입니다. 확인하세요!!");
		}
	}
	
	// 예외를 호출한곳에 떠넘김
	public void showMsg2() throws ArithmeticException{
		int intVal = 10/0;
		System.out.println(intVal);
	}
	
//	public static void main(String[] args) {
//		Exception_02 ex = new Exception_02();
////		ex.showMsg();
//		
//		// main() 에서 직접 예외 처리
//		try {
//			ex.showMsg2();
//		}catch (Exception e) {
//			System.out.println("ArithmeticException 예외 입니다. 확인하세요!!");
//		}
//	}
	
	// jvm에게 예외를 떠넘김, 최종적으로 jvm이 예외를 처리함
	public static void main(String[] args) throws ArithmeticException{
		Exception_02 ex = new Exception_02();
//		ex.showMsg();		
		ex.showMsg2();
	}
}
