package demo_05;

//class DeviceState{
	//public static final DeviceState ON = new DeviceState("켜짐");
	//public static final DeviceState OFF = new DeviceState("꺼짐");
	//public static final DeviceState PAUSE = new DeviceState("일시정지");
	//public static final DeviceState STOP = new DeviceState("멈춤");
	//public static final DeviceState PLAY = new DeviceState("동작중");
	//
	//
	//private final String state;
	//
	//private DeviceState(String state) {
	//	this.state = state;
	//}
	//
	//public String getState() {
	//	return state;
	//}
//}

// enum은 정해진 상수들의 집합
// enum은 값의 정의를 외부에서 수정하거나 새로운 값을 생성하지 못하도록 강제합니다.
// enum의 생성자를 private으로 제한함으로써 외부에서 생성할 수 없도록 보장
enum DeviceState{
	ON("켜짐"), OFF("꺼짐"),PAUSE("일시정지"),STOP("멈춤"),PLAY("동작중");
	
	private final String state;
	
	private DeviceState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
}

public class Enum_04 {
	public static void main(String[] args) {
		DeviceState[] dsArr =DeviceState.values();
		
		for(DeviceState ds :dsArr) {
			System.out.println(ds.name() + ", "
					+ ds.ordinal()+", "+ds.valueOf(ds.name())+", "+ds.getState());
		}
		
		// 일시정지 출력하세요.
		System.out.println(DeviceState.PAUSE.getState());
	}
}
