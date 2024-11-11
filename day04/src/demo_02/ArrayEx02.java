package demo_02;

public class ArrayEx02 {
	public static void main(String[] args) {
		String[] names = {"홍길동", "고길동", "강길남", "김길동"};
		
		String str = "Hello Java";
		// contains("Java") : Java 문자열이 포함되었는지 확인
		System.out.println(str.contains("Java")); //true  
		
		// 이름이 길동인 사람의 수를 구하시오.
		// cnt 변수 : 사람의 수
		// for문 안에 if문
		int cnt = 0;
//		for(int i =0; i < names.length; i++) {
//			// 이름에 길동이 포함된 요소만 cnt에 1씩 추가
//			if(names[i].contains("길동")) { 
////				cnt += 1;
//				cnt++; // cnt = cnt + 1;
//			}
//		}
		
		// 향상된 for문으로 변경하세요.
		// for(배열요소를 담을 변수 : 배열 )
		for(String name : names) {
			if(name.contains("길동"))
				cnt++;
		}
		System.out.println(cnt + "명");
		
	}
}
