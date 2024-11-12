package review;

public class HouseApp {
	public static void main(String[] args) {
		House h1 = new House();
		House h2 = new House();
		
		h1.getInfo();
		h1.room = 2;
		h1.address = "강남구";
		h1.ownerName = "홍길동";
		h1.getInfo();
		
		h2.room = 3;
		h2.address = "강서구";
		h2.ownerName = "김말똥";
		h2.getInfo();
		
		// 전세 얼마인지?
		h1.rent(1000);
		h2.rent(2000);
		
		h1.existAt();
		h2.existAt();
		
//		review.House@7229724f
		System.out.println(h1);
//		review.House@4c873330
		System.out.println(h2);
		
		// 컴파일 에러 해결 하세요.
//		? h3 = h1;
		House h3 = h1;
		// h1의 주소값과 같다
		System.out.println(h3);
		System.out.println(h3.ownerName); //홍길동
		
		h3.ownerName = "홍길북";
		System.out.println(h1.ownerName); // 홍길북
		
		
		
	}
}
