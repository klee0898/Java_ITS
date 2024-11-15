package demo_04;

public class LotteApt implements SmartHeater{
	// 협력업체 대성
	String daesungHeater = "off";
	int baseTemp = 10;
	
	@Override //난방기 작동기능
	public void heatOn(Boolean bool) { 
		if(bool) {
			daesungHeater = "on";
			System.out.println("대성 난방기기 가동합니다....");
		}else {
			daesungHeater = "off";
			System.out.println("대성 난방기기 중지 합니다....");			
		}
	}

	@Override // 온도 조절기능
	public void tempHigh(Boolean bool) {		
		if(daesungHeater.equals("on")) {
			if(bool) {
				baseTemp++;
				System.out.println("현재 난방온도 : " + baseTemp);
			}else {
				baseTemp--;
				System.out.println("현재 난방온도 : " + baseTemp);
			}
		}else {
			System.out.println("난방기기를 동작시키세요~~~");
		}
	}

}
