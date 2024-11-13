package demo_01;

public class Teacher {
	// 속성 : 이름, 교번, 과목
	private String name;
	private int no;
	private String subject;
	
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void printInfo() {
		System.out.println("----- 강사 정보 -----");
		System.out.println("이름 : " + name);
		System.out.println("교번 : " + no);
		System.out.println("과목 : " + subject);
	}
}
