package demo_05;

enum TvResolution{HD, FHD, UHD}

public class Enum_03 {
	public static void main(String[] args) {
		// 열거형 상수를 배열로 반환
		TvResolution[] arr = TvResolution.values();
		
		for(TvResolution resolution : arr) {
			System.out.println(resolution);
		}
	}
}
