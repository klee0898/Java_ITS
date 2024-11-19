package demo_03;

public class Atest {
	public static void main(String[] args) {
		// 객체가 생성될 때 타입이 정해짐
		A<String> a1= new A<String>();
		
		a1.set("Hello");
		String str = a1.get();
		System.out.println("str = " + str);
		
		// 제네릭에서 임의의 타입T는 참조형만 올 수 있음
		A<Integer> a2= new A<Integer>();
		a2.set(10000); // autoboxing, 매개변수가 int=>Integer
		int intVal = a2.get(); // unboxing
		System.out.println("intVal = " + intVal);
	}
}
