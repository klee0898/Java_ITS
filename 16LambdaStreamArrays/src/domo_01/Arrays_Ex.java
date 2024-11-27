package domo_01;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;

// Arrays 클래스 : 배열을 다루는 클래스(배열의 정렬, 검색, 복사, 변환 등의 작업)
public class Arrays_Ex {
	public static void main(String[] args) {
		int[] n = {5,2,9,1,7};
		
		// 오름차순 정렬
		Arrays.sort(n);
		System.out.println(Arrays.toString(n)); // 출력 [1, 2, 5, 7, 9]
		
		// 검색
		int idx = Arrays.binarySearch(n, 7); // 값 7의 인덱스를 리턴 
		System.out.println(idx); // 3
		
		idx = Arrays.binarySearch(n, 4); // 값 7의 인덱스를 리턴 
		System.out.println(idx); // 못찾으면 음수값
		
		// 복사
        int[] numbers3 = {1, 2, 3, 4, 5};

        // 전체 복사
        int[] copied = Arrays.copyOf(numbers3, numbers3.length);
        System.out.println("복사된 배열: " + Arrays.toString(copied)); // [1, 2, 3, 4, 5]

        // 범위 복사
        int[] rangeCopied = Arrays.copyOfRange(numbers3, 1, 4); // 인덱스 1부터 4전까지
        System.out.println("범위 복사된 배열: " + Arrays.toString(rangeCopied)); // [2, 3, 4]
        
        System.out.println("------------------------");
        // 초기화, 채우기
        int[] numbers4 = new int[5];

        // 배열을 1로 초기화
        Arrays.fill(numbers4, 1);
        System.out.println("초기화된 배열: " + Arrays.toString(numbers4)); // [1, 1, 1, 1, 1]

        // 계산된 값으로 배열 채우기
//      public static void setAll(int[] array, IntUnaryOperator generator) {
        
        // 매개변수개수는 하나이면서 매개변수타입과 리턴값의 타입이 동일한 형태의 함수형 인터페이스        
        IntUnaryOperator io = i -> i*2; 
        
//        Arrays.setAll(numbers4, io); // 인덱스에 2를 곱한 값으로 설정
        Arrays.setAll(numbers4, i -> i*2); // 인덱스에 2를 곱한 값으로 설정
        System.out.println("계산된 값으로 채운 배열: " + Arrays.toString(numbers4)); // [0, 2, 4, 6, 8]
		
        System.out.println("------------------------");
        // 배열 비교
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[][] deepArr1 = {{1, 2}, {3, 5}};
        int[][] deepArr2 = {{1, 2}, {3, 4}};

        // 1차원 배열 비교
        System.out.println(Arrays.equals(arr1, arr2)); // true

        // 다차원 배열 비교
        System.out.println(Arrays.deepEquals(deepArr1, deepArr2)); // false
        System.out.println("-----------------------");
        String[] names = {"kim", "lee", "choi"};
        
        // 배열을 리스트로 변환
        List<String> list= Arrays.asList(names);
        System.out.println(list);
        list.set(1, "kang"); // 1인덱스 수정
        System.out.println(list);
        
        // UnsupportedOperationException, 리스트 사이즈 조정을 안됨
//        list.add("park");
        
        System.out.println("-----------------------");
        int[] a = {1,2,3};
        // 1차원 배열 출력
        System.out.println(Arrays.toString(a)); //[1, 2, 3]
        
        int[][] a2 = {{1,2}, {3,4}};
        System.out.println(Arrays.toString(a2)); //[[I@13221655, [I@2f2c9b19]
        // 2차원 배열 출력
        System.out.println(Arrays.deepToString(a2)); // [[1, 2], [3, 4]]
	}
}
