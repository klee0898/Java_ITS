package demo_03;

public class ModifierTest {
	public static void main(String[] args) {
		// ctrl + space 키를 이용한 객체생성
		AccessModifier accessModifier = new AccessModifier();		
		accessModifier.add();		
		accessModifier.minus();		
//		accessModifier.multi(); // not visible		
		accessModifier.divide();		
		System.out.println(accessModifier.num);
		
	}
		
}
