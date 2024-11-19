package demo_02;

import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesEx {
	public static void main(String[] args) {
		// 키 값 쌍으로 데이터를 저장, 키와 값이 타입이 모두 String
		// 제네릭 사용 안함(String만 사용하기)
		Properties p = new Properties();
		
		p.put("1", "생산");
		p.put("2", "인사");
		p.put("3", "회계");
		p.put("4", "영업");
		p.put("5", "구매");
		
		// 키값
		Set<Object> ks= p.keySet();
		System.out.println(ks);
		
		// 값(value)
		Collection<Object> vcoll= p.values();
		System.out.println(vcoll);
		
		// 값 접근 get(키)
		Object v = p.get("1"); // 값을 Object로 리턴
		System.out.println(v);
		
		// 값을 String으로 리턴해주는 getProperty(키)를 많이 사용
		String strValue = p.getProperty("2");
		System.out.println(strValue);
	}
}
