package review;

public class Student {
	int num;
	String name;
	String address;
	
	// 학점
	char score; // 'A', 'B'
	
	public Student() {}
	
	// 인자 생성자
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public Student(int num, String name, String address) {
		this.num = num;
		this.name = name;
		this.address = address;
	}
	
	void work() {
		// 여기서 name은 this.name과 같다
		System.out.println(name +"는 열심히 공부합니다~~");
	}
	
	void info() {
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("학점 : " + score);
	}
}
