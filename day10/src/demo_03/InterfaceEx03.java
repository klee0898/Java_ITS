package demo_03;

interface MyInf{
	void abc();
}

interface HisInf{
	void def();
	void ghi();
}

interface YourInf{
	String str = "Hello"; // public static final 생략
}

public class InterfaceEx03 implements MyInf, HisInf, YourInf {
	@Override
	public void def() {}
	@Override
	public void ghi() {}
	@Override
	public void abc() {}
	
	public static void main(String[] args) {
//		YourInf y = new YourInf();// 인터페이스는 객체생성 안됨
		// 인터페이스는 타입선언 가능
		HisInf h = new InterfaceEx03(); // 참조변수의 다형성
		h.def(); h.ghi(); // 오버라이딩된 메소드 호출
		
		// Q> str에 접근해서 "Hello"를 출력하세요.
		System.out.println(InterfaceEx03.str);
		System.out.println(YourInf.str); // 스태틱변수 => 인터페이스명.str 접근 가능
//		InterfaceEx03.str = "java"; // 값할당 안됨. final이기 때문에
	}
}
