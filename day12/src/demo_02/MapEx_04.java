package demo_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx_04 {
	public static void main(String[] args) {
		String[] countries = {"미국", "캐나다", "독일"};
		String[] capitals = {"워싱턴", "오타와", "베를린"};
		
		// 두배열 매핑(키:국가명, 값:수도)
		// 맵이름 : ccMap
		// 키타입: String, 값타입: String
		// for문 활용해서 키/값 입력
		   // put()이용해서 키, 값 입력
		HashMap<String, String> ccMap = new HashMap<>();
		
		for(int i=0; i<countries.length;i++) {
			ccMap.put(countries[i], capitals[i]);
		}		
		
		// Q> 국가와 수도를 모두 출력하세요
		// 향상된 for문으로 출력 for( String country : ccMap.keySet())
		System.out.println(ccMap.keySet()); // [캐나다, 독일, 미국]
		for(String country : ccMap.keySet()) {
			System.out.println(country + " : "+ccMap.get(country));
		}
		System.out.println();
		// entrySet()활용
		// Set<Map.Entry<String, String>> ent= ccMap.entrySet();
		
		// ArrayList<Integer>의 요소의 타입이 Integer이듯이
		// Set<Map.Entry<String, String>>의 요소 타입 ==> Map.Entry<String, String>
		System.out.println(ccMap.entrySet());//[캐나다=오타와, 독일=베를린, 미국=워싱턴]		 
		for( Map.Entry<String, String> entry : ccMap.entrySet()) {
			// entry는 캐나다=오타와, 독일=베를린, 미국=워싱턴 각각의 값을 갖는 변수
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
	}
}
