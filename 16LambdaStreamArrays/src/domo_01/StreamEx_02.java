package demo_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
   List<String> result = new ArrayList<String>();
   for (Iterator iterator = result.iterator(); iterator.hasNext();) {
	String string = (String) iterator.next();
	
}
	}
}
