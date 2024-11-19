package demo_02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx_01 {
	public static void main(String[] args) {
		// K=key의 타입, V=value의 타입 => HashMap<K, V>
		HashMap<String, String> hm= new HashMap<String, String>();
		
		hm.put("d1", "인사과");
		hm.put("d2", "총무과");
		hm.put("d3", "경리과");
		hm.put("d4", "영업과");
		hm.put("d5", "마케팅");
		hm.put("d6", "전산실");
		hm.put("d6", "전산팀"); // 키값이 중복되면 마지막 입력된 값으로 덮어쓰기
		
		// 순서가 유지되지 않는다.
		//{d4=영업과, d5=마케팅, d6=전산팀, d1=인사과, d2=총무과, d3=경리과}
		System.out.println(hm); // hm뒤에 toString() 생략
		
		// 값읽기 get(키)
		String dept = hm.get("d1");
		System.out.println(dept); // 인사과
		
		// 값 제거하기 remove(키)
		hm.remove("d6");
		System.out.println(hm);// {d4=영업과, d5=마케팅, d1=인사과, d2=총무과, d3=경리과}
		
		boolean b = hm.containsKey("d5");// 키의 존재 여부확인
		System.out.println(b); // true
		
		b = hm.containsValue("전산실");
		System.out.println(b); // false, 전산팀
		
		// 키와 값을 확인하기
		Set<Map.Entry<String, String>> ent= hm.entrySet();
		System.out.println("ent : " + ent);
		
		// 키값만 확인
		Set<String> kset = hm.keySet();
		System.out.println("kset : "+ kset);
		
		// 값만 확인
		Collection<String> vcoll= hm.values();
		System.out.println("vcoll : "+vcoll);
		
		// 크기
		System.out.println("크기 : " + hm.size());
		
		
		
		
	}
}
