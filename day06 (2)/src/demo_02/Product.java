package demo_02;

// Product를 추상화 하세요.(클래스를 생성)
// 제품번호, 제품이름, 제품정보를 출력하는 기능
public class Product {
	int number;
	String name;
	// 기본생성자가 생략되어 있음
//	public Product() {}
	
	void info() {
		System.out.println("제품번호 :" + number);
		System.out.println("제품명 :" + name);
	}
}

//문제> ProductApp 클래스를 만들어서 
// Product를 객체화(인스턴스화, 주소생성) 하시오