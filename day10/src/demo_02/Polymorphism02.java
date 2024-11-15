package demo_02;

class Person{
	String name;
	int age;
}
class Student extends Person{
	int num;
}
class Teacher extends Person{
	String subject;
}

public class Polymorphism02 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Person s3 = new Student();
		
		Teacher t1 = new Teacher();
		Person t2 = new Teacher();
		// 다형성 예 > 배열은 동종의 타입만 담는다. 하지만 다형성을 이용하면 다양한 타입을 담을 수 있다.
		Person[] p = {s1, s2, s3, t1, t2}; 
		Object[] p2 = {s1, s2, s3, t1, t2};
	}
}
