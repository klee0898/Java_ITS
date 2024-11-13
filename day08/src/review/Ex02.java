package review;

public class Ex02 {
	public static void main(String[] args) {
		// 인자생성자를 이용하여 아래의 학생을 만드시오.		
		// 손흥민, 강남구, 학점 A		
		Student son = new Student("손흥민", "강남구");
		son.score = 'A';
		son.info();

		System.out.println("~~~~~~~~");
		// 황희찬, 마포구, 학점 B
		Student hwang = new Student("황희찬", "마포구");
		hwang.score = 'B';
		hwang.info();
		
		System.out.println("~~~~~~~~");
		// 유재석, 학번:1234, 도봉구, 학점 C
		Student yoo = new Student(1234, "유재석", "도봉구");
		System.out.println("학번 : " + yoo.num);
		yoo.score = 'C';
		yoo.info();
		yoo.work();
	}
}
