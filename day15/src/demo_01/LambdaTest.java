package demo_01;

// 람다식 소스코드를 줄이기 위해 사용
// 람다식은 함수형 인터페이스를 간결하게 구현하기 위한 문법

// 함수형 인터페이스 : 추상메소드를 하나만 갖고 있는 인터페이스
// @FunctionalInterface : 함수형 인터페이스인지 체크를 해줌

@FunctionalInterface 
interface Calculator{
	int doCalc(int x, int y);
//	int doCalc2(int x, int y);
}

public class LambdaTest {
	public static void main(String[] args) {
		
		Calculator c = new Calculator() {
			@Override
			public int doCalc(int x, int y) {				
				return x + y;
			}			
		};
		
		// 매개변수 -> return
		// (x,y) -> x + y; 는 익명클래스를 대체한것임 
		Calculator add = (x,y) -> x + y;
		
		int sum = add.doCalc(10, 20);
		
		System.out.println(sum);
	}
}
