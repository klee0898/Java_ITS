package demo_02;

class AB{
	int abc(int x, int y) {
		return 10; // 10은 abc메소드를 호출한 곳에 반환하는 값
	}
	
	int add(int x, int y) {
		int sum = x + y;
		return sum;
	}
}

public class Method04 {
	public static void main(String[] args) {
		AB ab = new AB();
		System.out.println(ab.abc(12, 10));
		
		int i = ab.abc(11, 11);
		System.out.println("i=" + i);
		
		int sum = ab.add(1, 2);
		System.out.println(sum);
	}
}
