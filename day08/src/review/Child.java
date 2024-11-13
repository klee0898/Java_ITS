package review;

public class Child {
	
	String name; // 인스턴스 변수
	int grade; // 학년, 인스턴스 변수
	static int candy; // 스태틱 변수
	
	// 기본 생성자는 사용하던 않하던 명시를 해주자
	public Child(){}
	
	// 생성자 역할 : 멤버 변수의 초기화
	// 인자 생성자
	public Child(String name, int grade) {
		// this는 인스턴스 자체
		this.name = name;
		this.grade = grade;
		// candy는 인스턴스와 무관한 스태틱변수
		// 이기에 this를 안붙여도 된다.
		candy = 10;
	}
	
	// 메소드
	void gotoSchool() {
		System.out.println(grade +"학년 학생 "+name+"는 학교에 간다");
	}
	
	void eatCandy() {
		System.out.println(name + "학생이 사탕을 먹어요");
		candy--;
	}

}
