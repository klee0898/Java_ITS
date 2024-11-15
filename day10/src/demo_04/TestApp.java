package demo_04;

public class TestApp {
	public static void main(String[] args) {
		SmartHeater sh = new SamsungApt();
		
		sh.heatOn(true); // 난방기기 동작
		sh.tempHigh(true);
		sh.tempHigh(true);
		sh.tempHigh(true);
		sh.tempHigh(false);
		sh.heatOn(false);
		
		System.out.println("--------");
		sh = new LotteApt();
		sh.heatOn(true);
		sh.tempHigh(true);
		sh.tempHigh(true);
		sh.tempHigh(true);
		sh.tempHigh(false);
		sh.heatOn(false);
		
	}
}
