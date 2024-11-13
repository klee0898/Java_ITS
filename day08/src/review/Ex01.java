package review;

public class Ex01 {
	public static void main(String[] args) {
//		Child child1 = new Child();
//		Child child2 = new Child();
		
		Child child1 = new Child("홍길동", 3);
		Child child2 = new Child("김길동", 4);
		
		child1.gotoSchool();		
		child2.gotoSchool();
		
		child1.eatCandy();
		child1.eatCandy();
		child2.eatCandy();
		
		// candy 변수는 스태틱변수(모든 인스턴스가 공유하는 공유변수)
		System.out.println(child1.candy);
		System.out.println(child2.candy);
//		System.out.println(Child.candy);
		
		Child child3 = new Child("홍길서", 2);
		child3.eatCandy();
		System.out.println(child3.candy);//9
		
		
	}
}
