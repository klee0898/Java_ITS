package demo_01;

public class Exception_03 {
	public static void main(String[] args) {
		String[] arr = {"a", "b", "c"};
		
		try {
	//		ArrayIndexOutOfBoundsException
			for(int i=0; i<=3; i++) {
				System.out.println(arr[i]);
			}
		}catch(Exception e) {	
//		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("인덱스 초과.. 확인 요망!!");
		}
		
		try {
			// java.lang.ArithmeticException
			for(int i = 1; i<=5; i++) {
				int a = 50/(i-3); // 0으로 나눔
				System.out.println("a = " + a);
			}
		}catch(Exception e) { // 모든 예외처리
//		}catch(ArithmeticException e) { // ArithmeticException만 처리
//		}catch(ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException만 처리
//			System.out.println(ae.getMessage());
			e.printStackTrace();
		}
	}
}
