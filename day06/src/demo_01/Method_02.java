package demo_01;

class Person{
	// 전역변수(멤버변수)
	String name; // null값이 할당
	int age; // 0으로 할당
	
	// 리턴값이 없는 메소드
	void setValue(String s, int a) {		
		name = s;
		age = a;
	}	
	String getName() {
		return name;
	}	
	int getAge() {
		return age;
	}
	void work() {
		System.out.println(name + "은 열심히 일을 합니다!!!");
	}
}

public class Method_02 {
	public static void main(String[] args) {
		//#1. 주소생성
		Person person = new Person();
		System.out.println(person.name);//null
		System.out.println(person.age);//0
		
		System.out.println("----------");
		// 메소드 호출
		person.setValue("홍길동", 23);		
		System.out.println(person.name);
		System.out.println(person.age);
		// 메소드를 이용한 출력
		String name = person.getName();
		System.out.println(name);
		System.out.println(person.getAge());
		person.work();
		
		System.out.println("----------");
		person.setValue("김길동", 33);
		System.out.println(person.name);
		System.out.println(person.age);
		// 메소드를 이용한 출력
		name = person.getName();
		System.out.println(name);
		System.out.println(person.getAge());
		person.work();
	}
}
