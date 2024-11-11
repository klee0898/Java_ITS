package demo_02;

public class WhileEx {
	public static void main(String[] args) {
		int i = 1;
		while(i < 5) {
			System.out.println("i = " + i);
			i++;
		}
		
		while(true) {
			System.out.println("무한 루프");
			break;
		}
		
		
	}
}
