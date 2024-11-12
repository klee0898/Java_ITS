package review;

public class House {
	// 속성
	int room; // 방수
	String ownerName;
	String address;
	
	// 기본 생성자
	public House() {}
	
	void rent(int price) {
		System.out.println(ownerName + "집 : "+price+"만원에 세를 놓고 있음");
	}
	
	void existAt() {
		System.out.println(address + "에 위치");
	}
	
	void getInfo() {
		System.out.println("----- 집 정보 -----");
		System.out.println("소유주 : " + ownerName);
		System.out.println("집주소 : " + address);
		System.out.println("방 수 : " + room);
	}
}
