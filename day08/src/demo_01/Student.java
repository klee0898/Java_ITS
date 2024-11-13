package demo_01;

public class Student {
	// 속성: 이름, 학번, 학급
	private String name;
	private int stuNum;
	private String className;
		
	public Student() {}
	
	// 인자 생성자
	public Student(String name, int stuNum, String className) {
		this.name = name;
		this.stuNum = stuNum;
		this.className = className;
	}
	
	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	public void printInfo() {
		System.out.println("----- 학생 정보 -----");
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + stuNum);//this가 생략됨
		System.out.println("학급 : " + this.className); 
	}
}
