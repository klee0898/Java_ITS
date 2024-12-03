package demo_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getSalary() { return salary; }
}

public class StreamEx_02 {
   public static void main(String[] args) {
      List<Employee> emps = Arrays.asList(
            new Employee("kim", 6000),
            new Employee("lee", 4000),
            new Employee("park", 7000),
            new Employee("kang", 3000)
            );
      // 급여가 5000이상인 직원의 이름을 출력하세요.
      // ------ 기존 방식
      List<String> result = new ArrayList<>();
      for (Employee emp : emps) {
         if(emp.getSalary() >= 5000) {
            result.add(emp.getName());
         }
      }
      // 정렬후 출력
      Collections.sort(result);
      System.out.println(result);
      System.out.println("--------------");
      
      // ------ 스트림 방식
      emps.stream() // 스트림 생성
         .filter(emp -> emp.getSalary() >= 5000)
         .map(emp -> emp.getName())
         .sorted()
         .forEach(name -> System.out.println(name));
      
      System.out.println("-----------");
      // collect(수집하는 방식) : 수집하는 동작을 한다.
      // Collectors.toList() => 수집하는 방식을 List로 수집하라는 의미
      // Collectors.toSet() => 수집하는 방식을 Set로 수집하라는 의미
      // Collectors.toMap() => 수집하는 방식을 Map로 수집하라는 의미
      result = emps.stream() // 스트림 생성
         .filter(emp -> emp.getSalary() >= 5000)
         .map(emp -> emp.getName())
         .sorted()
         .collect(Collectors.toList());
      
      System.out.println(result);
      System.out.println(result.get(0));
      
      // collect() : 리스트에 추가해서 재활용 가능      
      // 최종연산 collect() : result(=리스트or셋or맵)에 담는 역할
      
//      System.out.println(result); // 재활용
   }
}
