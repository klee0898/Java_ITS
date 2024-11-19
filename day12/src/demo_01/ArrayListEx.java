package demo_01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> sList = new ArrayList<String>();
		
		//요소 추가
//		sList[0] = "삼성"; // 배열에서 값 추가
		sList.add("삼성");
		sList.add("현대");
		sList.add("SK");
//		sList.add(10000); // 컴파일 오류, 타입 오류
		
		// get(인덱스): 접근, size(): 리스트 요소의 개수
		for(int i=0; i<sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		
		// 요소 지우기: remove(인덱스)
		sList.remove(1);
		System.out.println(sList.toString());//[삼성, SK]
		System.out.println(sList);//[삼성, SK], toString()은 생략가능
		
		System.out.println();
		sList.add("SK");
		System.out.println(sList); // [삼성, SK, SK]
		System.out.println(sList.size());
		int idx = sList.indexOf("SK"); // 특정 요소의 첫번째 인덱스를 반환
		System.out.println(idx); // 1
		idx = sList.lastIndexOf("SK"); // 특정 요소의 마지막 인덱스를 반환
		System.out.println(idx); // 2
		System.out.println();
		System.out.println(sList.isEmpty());// false, 비어있는지 확인
		
		System.out.println(sList.contains("현대"));//false, 특정요소 포함되었는지 확인
		
		sList.set(2, "현대");// 특정 인덱스의 요소를 수정
		System.out.println(sList);//[삼성, SK, 현대]
		
		sList.clear();// 리스트의 모든 요소 제거
		System.out.println(sList.isEmpty());//true
		
		System.out.println("-------------");
//		ArrayList<Integer> iList = new ArrayList<Integer>();
		List<Integer> iList = new ArrayList<Integer>(); // 부모타입으로 자식 생성
		
		iList.add(10);
		iList.add(20);
		iList.add(30);
		iList.add(40);
		iList.add(50);
		iList.add(60);
		
		List<Integer> iList2 = new ArrayList<Integer>(); // 부모타입으로 자식 생성
		iList2.add(10);
		iList2.add(20);
		iList2.add(40);
		
		boolean b = iList.containsAll(iList2); // iList2의 모든 요소가 iList에 포함됬는지 확인
		System.out.println(b); //true
		
		iList.remove(10); // IndexOutOfBoundsException 예외 발생
	}
}
