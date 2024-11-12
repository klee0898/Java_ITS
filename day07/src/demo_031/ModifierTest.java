package demo_031;

import demo_03.AccessModifier;

public class ModifierTest {
	public static void main(String[] args) {
		AccessModifier accessModifier = new AccessModifier();
		
		
//		accessModifier.add();
		
		accessModifier.minus();
		
//		accessModifier.multi(); // not visible
		
		accessModifier.divide();
		
//		System.out.println(accessModifier.num);
	}
}
