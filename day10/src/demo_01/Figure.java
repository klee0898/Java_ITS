package demo_01;

public abstract class Figure {
	int x, y;
	
	public String getDetails() {
		return "나는 도형";
	}
	
	abstract public void area(int x, int y);
}

// 사각형 개발자
class Rectangle extends Figure{
	@Override
	public void area(int x, int y) {
		int size = x * y;
		System.out.println("사각형 면저 : " + size);
	}
}

// 삼각형 개발자
class Triangle extends Figure{
	@Override
	public void area(int x, int y) {
		int area = x*y/2;
		System.out.println("삼각형 면적 : " + area);
	}
}

// 원 개발자
class Circle extends Figure{
	@Override
	public void area(int x, int y) {} // {}만 있어도 오버라이딩 됨
	
	// 오버로딩
	public void area(int r) {
		// 파이*반지름*반지름
		double size = r*r*Math.PI;
		System.out.println("원의 면적 : " + size);
	}
}


