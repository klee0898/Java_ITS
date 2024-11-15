package demo_02;

class X{
	// Object클래스에 있는 toString()메소드를 오버라이딩
	public String toString() {return "x";}
	int abc() {return 100;}
}
class Y{
	// Object클래스에 있는 toString()메소드를 오버라이딩
	public String toString() {return "y";}
	int def() {return 200;}
}

public class InstanceOfEx02 {
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		Object[] arr = {x, y};
		
		// 위의 3라인을 한줄로
//		Object[] arr = {new X(), new Y()}
		
		System.out.println("~~~~~~~~~");
		for(Object obj : arr) {
			System.out.println(obj.toString());
			// toString()메소드는 생략가능
			// System.out.println(obj);
			
//			obj.abc(); // X의 고유기능
//			obj.def(); // Y의 고유기능
			
			// obj의 실제 타입이 X 또는 Y인지를 구분
			// obj가 X클래스의 인스턴스인지 확인
			if(obj instanceof X) { // obj가 X타입이면 true
				X xObj = (X)obj;
				System.out.println(xObj.abc());
			}else { // obj가 X타입이 아니면
				Y yObj = (Y)obj;
				System.out.println(yObj.def());
			}
		}
		
	}
}
