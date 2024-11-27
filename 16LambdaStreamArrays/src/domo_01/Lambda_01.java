package domo_01;


interface Calc{
	int doCalc(int x);
}

interface Calc2{
	void doCalc();
}

interface Calc3{
	void doCalc();
	int doCalc(int x);
}


public class Lambda_01 {
	public static void main(String[] args) {
		// 익명클래스를 이용한 doCalc() 오버라이드 하세요.
		Calc c = new Calc() {
			@Override
			public int doCalc(int x) {				
				return x*x;
			}
		};
		
		System.out.println(c.doCalc(10));
		// 람다식으로 변형, -> 기준으로 왼쪽은 매개변수, 오른쪽은 리턴값(or 실행코드)
		Calc c2 = (x)-> x*x; // 실행코드가 한줄이고 return이 생략된 형태
//		Calc c2 = (int x)-> {return x*x;}; // {}을 사용하면 return을 명시
//		Calc c2 = x -> x*x; // 매개변수 하나인 경우 () 생략가능
		
		System.out.println(c2.doCalc(10));
		
		// Calc2를 람다식으로 바꿔보세요. -> 다음에 실행코드가 두줄이상이면 { } 생략불가
		Calc2 c3 = () -> {
				int a = 100;
				System.out.println("하이 자바");
			};
			
		c3.doCalc();		
		// Calc3 람다구현 안됨(함수형 인터페이스가 아니기 때문에)
	}
}
