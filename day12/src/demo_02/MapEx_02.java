package demo_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapEx_02 {
	public static void main(String[] args) {
		Map<String, List<Integer>> map = new HashMap<>();
		
		String str = "Hello";
		List<Integer> list1= new ArrayList<>();
		list1.add(1);
		list1.add(2);
		List<Integer> list2= new ArrayList<>();
		list2.add(10);
		list2.add(20);
		
		map.put(str, list1);
		map.put("aa", list2);
		
		System.out.println(map);// {aa=[10, 20], Hello=[1, 2]}
		
		// map을 이용해서 list1, list2의 사이즈를 구하세요.
		System.out.println(map.get("Hello").size());
		System.out.println(map.get("aa").size());
		
		// 입력받은키의 리스트 사이즈를 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("키값을 입력하시오 > ");
		String key = sc.next();
		
		if(map.containsKey(key)) {
			System.out.println("리스트 사이즈 : " + map.get(key).size());
		}else {
			System.out.println("해당 키가 존재하지 않습니다!!");
		}
		
	}
}
