package demo_01;

public class StringEx {
	public static void main(String[] args) {
		String str = "Hello Java";		
		String str2 = new String("Hello Java");
		
		System.out.println("str = " + str + ",\nstr2 = " + str2);
				
		System.out.println(str.length()); // 10
		System.out.println(str.toUpperCase()); // HELLO JAVA
		System.out.println(str.toLowerCase()); // hello java
		
		// charAt(0) : 0번 인덱스의 문자를 리턴
		System.out.println(str.charAt(0)); // H
		
		// 대소문자 구분
		System.out.println(str.contains("java")); // false
		
		System.out.println(str.indexOf("Java")); // 6
		// 해당 문자열이 없으면 -1을 반환
		System.out.println(str.indexOf("java")); // -1
		
		System.out.println(str.lastIndexOf("a")); // 9
		System.out.println(str.lastIndexOf('a')); // 9
//		System.out.println(str.lastIndexOf('va')); // 홑따옴표 안에는 한문자만 가능 에러
		
		System.out.println(str.startsWith("He")); // true
		System.out.println(str.endsWith(".")); // false
		
		System.out.println(str.replace("Java", "World"));
		System.out.println(str.substring(6)); // Java
		System.out.println(str.substring(6, 8)); // Ja
		
		str = "   java   ";
		System.out.println(str.length()); // 10
		System.out.println(str.trim()); //java
		
		str = str.trim();
		System.out.println(str.length()); // 4
		
		String s1 = "Java";
		String s2 = "Python";
		
		System.out.println(s1.equals("java")); // false
		System.out.println(s1.equals(s2)); // false
	}
}
