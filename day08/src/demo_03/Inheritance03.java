package demo_03;

class Human{
	String name;
	int height; // 키
	
	public String getInfo() {
		String str = "이름 : " +name+"\n키 : " + height; 
		return str;
	}
}

// Human을 상속받는 Superman 클래스를 만드세요.
class Superman extends Human{
	int power; // 초능력
	
	@Override
	public String getInfo() {
		String str = "이름 : " +name+"\n키 : " + height +
				"\n초능력 : "+power; 
		return str;
	}
	
	// 오버로딩
	public String getInfo(String title) {
		String str = title+"\n"+this.getInfo(); 
		return str;
	}
}
public class Inheritance03 {
	public static void main(String[] args) {
		Superman sp1 = new Superman();
		sp1.name = "수퍼맨";
		sp1.height = 190;
		sp1.power = 1000;
		String info = sp1.getInfo();
		System.out.println(info);
		info = sp1.getInfo("------ 수퍼맨 정보 -------");
		System.out.println(info);
				
	}
}
