package demo_01;

import java.util.ArrayList;

class ObjectArray{
	private int count;
	private Object[] arr;
	
	// 기본생성자
	public ObjectArray() {
		this(10); // 생성자안에서 다른 생성자를 호출할 때 this()
	}
	// 인자생성자
	public ObjectArray(int init) {
		this.arr = new Object[init];
	}	
	public Object get(int index) {
		return arr[index];
	}	
	public void add(Object obj) {
		arr[count++] = obj;
	}	
	public int size() {return count;}
}
class A{
	public void go() {
		System.out.println("나는 A의 go()");
	}
}
class B{
	public String toString() {
		return "B클래스";
	}
	public void go() {
		System.out.println("나는 B의 go()");
	}
}

public class ObjectArrayEx {
	public static void main(String[] args) {
		ObjectArray arr1 = new ObjectArray();
		
		arr1.add(10);
		arr1.add(20);
		arr1.add(new B());
		arr1.add("Hello");
		for(int i=0; i<arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
		System.out.println();
		ArrayList arr2= new ArrayList(); // ArrayList 생성
		arr2.add(10);
		arr2.add(20);
		arr2.add(new B());
		arr2.add("Hello");
		for(int i=0; i<arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
		System.out.println(arr2.size());
		// Object타입의 Array가 만들어짐
		// Object Array의 단점 : 
		// #1. 타입 안전성이 보장되지 않는다.
		// #2. 캐스팅을 수동으로 해야함.(캐스팅 오류 발생가능성이 높다)
		// #3. 코드의 가독성이 떨어짐(유지보수 어려워짐)
		// 위와 같은 단점을 해결하기 위해 제네릭을 사용한다.
		ArrayList arr3= new ArrayList();
		arr3.add(new A());
		arr3.add(new A());
		arr3.add(new B());
		arr3.add(new A());
		arr3.add(new A());
		arr3.add(new B());
		
		for(Object obj:arr3) {			
//			A a= (A) obj;
//			a.go();
			if(obj instanceof A) {
				//우선순위가 .(멤버접근연산자)이 ()(=캐스팅연산자)보다 우선순위가 높다
				((A) obj).go(); 
			}else {
				((B)obj).go();
			}
		}
		
		// 제네릭 사용
		ArrayList<A> aList = new ArrayList<A>();
		aList.add(new A());
		aList.add(new A());
//		aList.add(new B()); // 컴파일 에러, 런타임오류(실행중오류) 예방   
		
		
	}
}
