package demo_04;

class NoteBook <T, S>{
	private T brand;
	private S version;
	
	public T getBrand() {
		return brand;
	}
	public void setBrand(T brand) {
		this.brand = brand;
	}
	public S getVersion() {
		return version;
	}
	public void setVersion(S version) {
		this.version = version;
	}
}

public class NoteBookApp {
	public static void main(String[] args) {	      
      NoteBook<String, String> nb1 = new NoteBook<String, String>();
      NoteBook<String, Integer> nb2 = new NoteBook<>();
      NoteBook<String, Float> nb3 = new NoteBook<>();
      
      nb1.setBrand("Samsung");
      nb1.setVersion("갤럭시 북 pro");
      
      nb2.setBrand("엘지 그램");
      nb2.setVersion(2024);
      
      nb3.setBrand("레노버 ThinkPad x");
      nb3.setVersion(10.1f);
      
      System.out.println("제조사 : " + nb1.getBrand()
      + ", 버전 : " + nb1.getVersion());
      System.out.println("제조사 : " + nb2.getBrand()
      + ", 버전 : " + nb2.getVersion());
      System.out.println("제조사 : " + nb3.getBrand()
      + ", 버전 : " + nb3.getVersion());
   }
}
