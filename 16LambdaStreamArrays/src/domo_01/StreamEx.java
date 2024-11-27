package domo_01;

import java.util.Arrays;
import java.util.List;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/*
# 스트림(Stream) 개요
	자바의 스트림(Stream)은 자바 8에서 도입된 기능
	"데이터의 흐름"이라고 생각하면 됨.
	스트림은 데이터를 순차적으로 처리하기 위한 도구이며, 
	데이터를 읽고 변환하고 필터링하는 작업을 효율적이고 간결하게 
	수행할 수 있도록 도와줌.

[스트림의 특징]
	데이터 소스로부터 연산 지원:
	스트림은 컬렉션(List, Set), 배열, 파일, I/O 채널, 또는 
	특정 생성 메서드에서 데이터를 가져옵니다.

[파이프라인 처리]
	스트림 연산은 중간 연산과 최종 연산으로 나뉘며, 연속적으로 연결되어 처리
	데이터는 흐름처럼 처리되며, 중간 연산은 필요할 때만 실행

[비파괴성 (Immutable)]
스트림은 원본 데이터를 변경하지 않는다. 데이터를 처리한 결과를 새로 생성

[일회성 (Non-reusable)]
스트림은 한 번 사용하면 다시 사용할 수 없음. 
필요하면 새로운 스트림을 생성해야 함.

[병렬 처리 지원]
parallelStream()을 사용하면 데이터를 병렬로 처리하여 성능을 향상


# 스트림 동작 과정 요약
1. 스트림 생성 (Source):
	데이터를 스트림으로 가져옴
	예: List.stream(), Arrays.stream().
	
2. 중간 작업 (Intermediate Operations):
	데이터를 변환하거나 필터링
	예: .filter(), .map(), .sorted().
	
3. 최종 작업 (Terminal Operations):
 	변환된 데이터를 결과로 반환하거나 처리
	예: .collect(), .reduce(), .forEach().
*/

public class StreamEx {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4);
		
		// Iterator 방식, 자바 2부터 지원, 자바 8이전에는 이방식으로 사용
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			int num = iter.next();
			System.out.println("값 : " + num);
		}
		System.out.println("--------------");
		// Stream방식
		Stream<Integer> st = list.stream(); // 스트림생성(=> 데이터를 가져옴)
		
//		st.forEach(num -> System.out.println("값 : " + num));
		
		//
		st.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer num) {				
				System.out.println("값 : " + num);
			}			
		});
		
		
	}
}
