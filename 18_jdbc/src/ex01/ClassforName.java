package ex01;

class A{
	static {
		System.out.println("AA 클래스 블럭");
	}
}

public class ClassforName {
	public static void main(String[] args) {
//		A a = new A();
		
		// Class.forName("클래스명") : 해당클래스의 객체(주소) 생성
		 try {
			 // 해당 클래스를 찾아서 동적으로 객체 생성
			Class.forName("ex01.A"); // 클래스명 : 패키지명 포함해야함 
//			Class.forName("ex01.B"); // 클래스명 : 패키지명 포함해야함
		} catch (ClassNotFoundException e) {			
			// e.printStackTrace();
			System.out.println("해당 클래스를 못찾음");
		}
	}
}
