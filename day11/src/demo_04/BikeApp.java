package demo_04;
class Carbon extends Material{
	public String toString() {
		return "카본 재료 입니다.";
	}

	@Override
	void using() {
		System.out.println("가볍고 강해서 "
				+ "산악 자전거용으로 사용됨..");
	}	
}

class Titanium extends Material {
	public String toString() {
		return "티타늄 재료 입니다.";
	}

	@Override
	void using() {
		System.out.println("가볍고 매우 강함~~");
	}
}

class Wood{
	public String toString() {
		return "나무 재료 입니다.";
	}
}

public class BikeApp {
	public static void main(String[] args) {
		Bike<Carbon> cBike= new Bike<>();
		Carbon carbon = new Carbon();
		cBike.setMaterial(carbon);
		
		//cBike뒤에 toString()이 생략된 형태
		System.out.println("이 자전거는 " + cBike);		
		System.out.println("이 자전거는 " + cBike.toString());		
		cBike.description();
		
		
		Wood wood = new Wood();
		// 생성불가
//		Bike<Wood> wBike = new Bike<>();
	}
}
