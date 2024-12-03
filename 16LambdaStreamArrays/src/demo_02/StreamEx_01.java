package demo_02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 최종연산자
		List<String> names = Arrays.asList("kim", "lee", "park");

        // forEach 최종 연산자 사용
        names.stream()
             .forEach(name -> System.out.println(name));
		
		
		// collect()
		List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("l"))
                .collect(Collectors.toList());

		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        // 짝수의 개수를 계산
        long evenCount = numbers.stream()
                                .filter(num -> num % 2 == 0)
                                .count();

        System.out.println("짝수의 개수: " + evenCount);
        
		System.out.println(filteredNames);


	}

}
