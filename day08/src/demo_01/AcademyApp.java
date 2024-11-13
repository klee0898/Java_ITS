package demo_01;

//전체 조건 >> 캡슐화를 해서 만들기

//문제1> 학생객체 만들기
//Student 추상화 ==> Student 클래스 만들기
//속성 : 이름(name), 학번(stuNum), 학급(className)
//메서드 : printInfo() ==> 이름, 학번, 학급 정보를 출력하는 메서드 

//객체화 ==> 주소생성(==인스턴스생성)
//학생 정보 출력하기

//문제2> 강사객체 만들기
//Teacher 추상화 ==> Teacher 클래스 만들기
//속성 : name(이름), no(교번), subject(과목)
//메서드 : printInfo()
//객체화 후 강사 정보 출력하기
public class AcademyApp {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setName("홍길동");
		st1.setStuNum(1);
		st1.setClassName("자바 개발자 과정");		
		st1.printInfo();
		
		Student st2 = new Student();
		st2.setName("강길동");
		st2.setStuNum(2);
		st2.setClassName("데이터 분석과정");		
		st2.printInfo();
		
		Student st3 = new Student();
		st3.setName("이길동");
		st3.setStuNum(3);
		st3.setClassName("네트워크 과정");		
		st3.printInfo();
		
		Student st4 = new Student();
		st4.setName("고길동");
		st4.setStuNum(4);
		st4.setClassName("웹디자인 과정");
		
		Teacher tc = new Teacher();
		tc.setName("김교수");
		tc.setNo(100);
		tc.setSubject("자바");
		//tc.printInfo();
		// getter 메소드 사용
		System.out.println("---- 강사 정보 -----");
		System.out.println("이름 :" +tc.getName());
		System.out.println("교번 :" +tc.getNo());
		System.out.println("과목 :" +tc.getSubject());
		
		// 인자 생성자 사용
		Student st5 = new Student("홍길남", 5, "파이썬 과정");
		st5.printInfo();
		System.out.println("############");
		// Q> 5명의 학생을 배열에 담아보세요.
		// int[] arr = {1,2,3,4,5}
		// int[] arr = new int[5]
		// arr[0]=1,arr[1]=2,arr[2]=3,arr[3]=4,arr[4]=5 
		
		// 객체 배열 : 객체를 담은 배열
		// Student[] sArr = {st1, st2, st3, st4, st5}		
		Student[] sArr = new Student[5]; // null로 할당
		sArr[0] = st1;
		sArr[1] = st2;
		sArr[2] = st3;
		sArr[3] = st4;
		sArr[4] = st5;
		
		// Q> 객체배열에 저장된 5명의 학생정보를 출력하세요.
		// 배열의 길이 : sArr.length
		for(int i =0; i<sArr.length; i++) {
			sArr[i].printInfo();
		}
		System.out.println("==============");
		// Q> 위의 for문을 향상된 for문으로
		// for(배열의 요소를 담을 변수 : 배열)
		for(Student s : sArr) {
			s.printInfo();
		}
		System.out.println("############");
		// Q> 모든 학생의 이름만 출력하세요. getter 활용
		for(Student s : sArr) {
			System.out.println(s.getName());
		}
		
		// Q> 모든 학생의 학급만 출력하세요.
		for(Student s : sArr) {
			System.out.println(s.getClassName());
		}
		
		// 문제> 객체 배열을 활용하여 강사 2명을 추가해서 
		// 위의 Q> 처럼 모든강사 정보, 강사의 이름만, 담당과목만 출력해보세요.
		System.out.println("====================");
		Teacher tc2 = new Teacher();
		tc2.setName("정교수");
		tc2.setNo(200);
		tc2.setSubject("데이터 분석");
		
		Teacher tc3 = new Teacher();
		tc3.setName("홍교수");
		tc3.setNo(300);
		tc3.setSubject("네트워크");
		
		Teacher[] tArr = {tc, tc2, tc3}; // Teacher객체 배열
		
		for(Teacher t : tArr) {
			t.printInfo();
		}
		
		for(Teacher t : tArr) 
			System.out.println("강사명 : " + t.getName());
		
		for(Teacher t : tArr) 
			System.out.println("담당과목 : " + t.getSubject());
		
		
		
		
		
		
		
		
	}
}
