package demo_03;

interface Action{
	void exe();
}

// CRUD(저장, 조회, 수정, 삭제) --> 모든 정보기기의 기본 기능
class Create implements Action{
	@Override
	public void exe() {
		System.out.println("생성/저장");
	}
}
class Read implements Action{
	@Override
	public void exe() {
		System.out.println("조회");
	}
}
class Update implements Action{
	@Override
	public void exe() {
		System.out.println("수정");
	}
}
class Delete implements Action{
	@Override
	public void exe() {
		System.out.println("삭제");
	}
}

public class InterfaceEx02 {
	static void def(Action action) { // 매개변수의 다형성
		action.exe();
	}
	public static void main(String[] args) {
		// 다형성
		Action[] crud = {new Create(), new Read(), new Update(), new Delete()};
		
		for(Action action : crud) {
			action.exe();
		}
		System.out.println("=====");
		// def()를 이용해서 수정, 삭제를 출력하세요.
		Update up = new Update();
		def(up); // 같은 클래스내에 있는 스태틱메소드 호출시 클래스명 생략가능
		Delete del = new Delete();
		InterfaceEx02.def(del); // 스태틱메소드 호출 ==> 클래스명.메소드명
		
	}
}
