package demo_01;

//import java.util.*; // util패키지에 있는 모든 것을 불러오는 방법
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
//		LinkedList<String> lkList= new LinkedList<String>();
		List<String> lkList= new LinkedList<String>();
		
		lkList.add("하이");
		lkList.add("굿모닝");
		lkList.add("굿나이트");
		
		// Object의 toString() 메소드는 주소를 출력
		// ArrayList, LinkedList의 toString()은 오버라이드를 하였음
		// toString() 생략됨, 
		System.out.println(lkList); // [하이, 굿모닝, 굿나이트]
		System.out.println(lkList.toString());//[하이, 굿모닝, 굿나이트]
		
		lkList.remove(1);
		System.out.println(lkList); // [하이, 굿나이트]
		
		lkList.add(1, "Hello");
		System.out.println(lkList); // [하이, Hello, 굿나이트]
		
	}
}
