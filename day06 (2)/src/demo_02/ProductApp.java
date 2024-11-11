package demo_02;

public class ProductApp {
	public static void main(String[] args) {
		// 객체화
		Product prod = new Product();
		
		prod.number = 100;
		prod.name = "냉장고";
		
		prod.info();
		
		Product prod2 = new Product();
		prod2.number = 200;
		prod2.name = "세탁기";
		
		prod2.info();
		
	}
}
