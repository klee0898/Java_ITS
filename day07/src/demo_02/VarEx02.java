package demo_02;

public class VarEx02 {
	// 스태틱변수
	static String str1 = "안녕";
	// 인스턴스 변수
	String str2 = "헬로";
	String str3;
	static int x = 100;
	
	public static void main(String[] args) {
		// x, y, str1, str2, str3의 값을 출력하세요.
		System.out.println(ABC.x);//50
		System.out.println(x);//100
		
		ABC abc = new ABC();
		System.out.println(abc.y);
		
		// 같은 클래스의 스태틱변수 접근시 클래스명 생략가능
		System.out.println(VarEx02.str1);
		
		VarEx02 ve = new VarEx02();
		System.out.println(ve.str2);
		System.out.println(ve.str3);
		
		// foo(), bar()를 모두 호출하세요.
		abc.foo();
		String s = ABC.bar();
		System.out.println(s);
	}
}
