package demo_02;

public class SwitchEx {
	public static void main(String[] args) {
		
		int result = 0;		
		int n1 = 10;
		int n2 = 20;
				
		char op = '%';
		
		switch(op) {
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/':
			result = n1 / n2;
			break;
		default:
			System.out.println("사칙연산만 가능합니다...");
		}
		
		System.out.println("연산결과 : " + result);
	} // main
}// class