package domo_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// collections class
public class Collections_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(5, 3, 8, 1);
		
		// 정렬
		Collections.sort(list);
		System.out.println(list); //[1, 3, 5, 8]

		// 정렬
		Collections.sort(list);
		System.out.println(list); //[1, 3, 5, 8]
	}

}
