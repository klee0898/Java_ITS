package demo_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User{
	String name;
	User (String name){
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

public class MapEx_03 {
	public static void main(String[] args) {
		Map<String, List<User>> map = new HashMap<>();
		// Q> 아래와 같이 map에 추가하세요.
		// {자바과정 = [홍길동, 김길동], 데이터분석과정 = [김민수, 최민수, 홍민수]}
		
		// User를 담는 리스트 생성
		List<User> javaList= new ArrayList<User>();
		
//		User hong = new User("홍길동");
//		User kim = new User("김길동");
//		javaList.add(hong);
//		javaList.add(kim);
		
		javaList.add(new User("홍길동"));
		javaList.add(new User("김길동"));
		
		List<User> dataList= new ArrayList<User>();
		dataList.add(new User("김민수"));
		dataList.add(new User("최민수"));
		dataList.add(new User("홍민수"));
		
		// map에 추가하기
		map.put("자바과정", javaList);
		map.put("데이터분석과정", dataList);
		
		// map 출력하기
		System.out.println(map);
		
		// Q> 각과정별 인원수 확인하세요.
		List<User> java = map.get("자바과정");
		List<User> data = map.get("데이터분석과정");
		
		System.out.println("java과정인원 : " + java.size());
		System.out.println("data분석과정인원 : " + data.size());
	}
}
