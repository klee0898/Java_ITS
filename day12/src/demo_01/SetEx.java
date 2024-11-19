package demo_01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
//		HashSet<Integer> set = new HashSet<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(10);
		
		System.out.println(set); // 중복허용X, 순서유지X
		System.out.println(set.size());
		set.remove(10); // remove(요소값)
		System.out.println(set); 
		
		Random rd = new Random();
		System.out.println(rd.nextInt(10)); // 0<= rd < 10사이의 랜덤값을 출력
		
		// 로또 번호 6개 추출하기
		Set<Integer> set2 = new HashSet<Integer>();
		
		int cnt = 0;
		while(true) {
			// 중복을 허용하지 않기 때문에 사이즈가 6이 될때까지 반복
			if(set2.size() == 6) break;
			set2.add(rd.nextInt(45)+1); // 1 ~ 45
			cnt++;
		}
		System.out.println(set2);
		System.out.println("반복횟수="+cnt);
		
		System.out.println("---------------------");
		ArrayList<Integer> list = new ArrayList<Integer>();
		cnt = 0;
		while(true) {
			// 중복을 허용하기 때문에 사이즈가 6이되면 무조건 루프 탈출
			if(list.size() == 6) break;
			list.add(rd.nextInt(45)+1); // 1 ~ 45
			cnt++;
		}
		System.out.println(list);
		System.out.println("반복횟수="+cnt);
	}
}
