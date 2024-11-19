package demo_05;

enum Color{
	RED, GREEN, BLUE
}

class ColorTable{
	Color rgb;
	
	void setValue(Color rgb) {
		this.rgb = rgb;
	}
	
	String getValue() {
		switch(rgb) {
		case RED : return "빨강";
		case GREEN : return "초록";
		default: return "파랑";
		}
	}
}

public class Enum_02 {
	public static void main(String[] args) {
		ColorTable ct = new ColorTable();
		ct.setValue(Color.RED); // RED 
		ct.setValue(Color.GREEN); // GREEN
		// RED, GREEN, BLUE 외에 값을 올수 없음.
//		ct.setValue(Color.YELLOW); // 컴파일에러
		
		System.out.println(ct.getValue());
	}
}
