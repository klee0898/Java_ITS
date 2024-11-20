package demo_01;

// DTO(Data Transfer Object) : 데이터를 전달하기위한 목적으로 사용되는 클래스
// 	단순한 필드(field: 멤버변수)와 Getter/Setter 메서드로 구성
// 데이터를 한덩어리로 묶는 역할 ==> VO(Value Object) : 값 덩어리  

// DAO(Data Access Object) : 데이터를 처리(CRUD)하기 위한 목적으로 
// 사용되는 클래스

// 상품DTO
class ProductDto{
	// field(멤버변수, 전역변수)
	private int pcode; // 상품코드
	private String pname; // 상품명
	private int price;
	private int qty; // 수량
	
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
}

class MemberDTO{
	String name = "김";
	int age = 30;
	String addr = "서울";
	
	public MemberDTO() {}
	
	public MemberDTO(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}

public class DtoDao {
	static void abc(MemberDTO member) {
		System.out.println(member.name);
		System.out.println(member.age);
		System.out.println(member.addr);
	}
	
	// 오버로딩
	static void abc(String name, int age, String addr) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
	}
	
	public static void main(String[] args) {
		String name = "홍";
		int age = 33;
		String addr = "서울";
		
		abc(name, age, addr);
		
		System.out.println("--------");
		MemberDTO member = new MemberDTO();
		abc(member);
		MemberDTO member2 = new MemberDTO("최", 22, "강서구");
		abc(member2);
	}
}
