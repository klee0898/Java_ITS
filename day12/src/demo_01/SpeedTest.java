package demo_01;

import java.util.ArrayList;
import java.util.LinkedList;

public class SpeedTest {
	public static void main(String[] args) {
		
		// 유닉스 타임
		// System.currentTimeMillis()는 1970년 1월1일 오전0시0분0초부터
		// 지금까지의 흘러온 시간 (1000분의 1초로 계산해서 long값으로 리턴)		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		System.out.println("====== 데이터를 순차적으로 추가========");
		long startTime = System.currentTimeMillis();
		for(int i=0; i<1_000_000; i++) {
			aList.add(i);
		}
		long endTime = System.currentTimeMillis();
		long diffTime = endTime - startTime;
		
		System.out.println("ArrayList : "+diffTime);
		
		LinkedList<Integer> lkList = new LinkedList<Integer>();
		startTime = System.currentTimeMillis();
		for(int i=0; i<1_000_000; i++) {
			lkList.add(i);
		}
		endTime = System.currentTimeMillis();
		diffTime = endTime - startTime;
		
		System.out.println("LinkedList : "+diffTime);
		
		System.out.println("====== 데이터를 특정 인덱스에 추가========");
		ArrayList<Integer> aList2 = new ArrayList();		
		startTime = System.currentTimeMillis();
		for(int i=0; i<100_000; i++) {
			aList2.add(0, i);
		}
		endTime = System.currentTimeMillis();
		diffTime = endTime - startTime;		
		System.out.println("ArrayList : "+diffTime);
		
		LinkedList<Integer> lkList2 = new LinkedList<Integer>();
		startTime = System.currentTimeMillis();
		for(int i=0; i<100_000; i++) {
			lkList2.add(0, i);
		}
		endTime = System.currentTimeMillis();
		diffTime = endTime - startTime;		
		System.out.println("LinkedList : "+diffTime);
		
	}
}
