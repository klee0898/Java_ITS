package demo_04;

public class SamsungApt implements SmartHeater{
	// 협력업체 : 귀뚜라미
	String kituHeater = "off";
	int currentTemp = 15; 
			
	@Override
	public void heatOn(Boolean bool) {
		if(bool) {
			kituHeater = "on";
			System.out.println("귀뚜라미 난방기 Run~");
		}else {
			kituHeater = "off";
			System.out.println("귀뚜라미 난방기 Stop~");
		}
	}

	@Override
	public void tempHigh(Boolean bool) {
		if(kituHeater.equals("on")) {
			if(bool) {
				currentTemp++;
				System.out.println("현재 온도 : " + currentTemp);
			}else {
				currentTemp--;
				System.out.println("현재 온도 : " + currentTemp);
			}
		}else {
			System.out.println("난방기기가 꺼져 있습니다..동작 시키세요");
		}		
	}

}
