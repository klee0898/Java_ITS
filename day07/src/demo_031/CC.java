package demo_031;


// 다른 패키지에 있는 클래스 사용하기
// import 해준다.
import demo_03.BB;

public class CC {
	void abc() {
		BB bb = new BB();
		bb.def();
	}
}
