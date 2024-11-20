package demo_02;

public class MemberDTO {
	// Fields
	private String id; // 아이디
	private String pw; // 비번
	private String name;
	
	// 기본 생성자는 명시를 해주는게 좋다
	public MemberDTO() {}

	// 인자 생성자(Constructor)	
	public MemberDTO(String id, String pw, String name) {
		super(); // 부모의 기본 생성자를 호출
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}

	// getter/setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
