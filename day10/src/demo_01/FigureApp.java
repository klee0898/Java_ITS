package demo_01;

public class FigureApp {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.area(5, 10);
		
		Triangle tri = new Triangle();
		tri.area(5, 10);
		
		Circle circle = new Circle();
		circle.area(5, 10);  // 출력 안됨
		circle.area(5);
		
		String str = circle.getDetails();
		System.out.println(str);
		
		System.out.println("---------");
		// Q> 배열에 사각형과 삼각형 객체를 저장해서
		// area(10, 20)을 각각 호출 하세요.
		// 배열명 : figArr
		// 힌트 : 다형성의 원리, 추상클래스는 타입선언 가능
		Figure[] figArr = {rect, tri};
		
		for(Figure fig : figArr) {
			fig.area(10, 20);
		}
		
		// 모든 클래스의 조상은 Object
		Object[] fArr = {rect, tri};		
	}
}
