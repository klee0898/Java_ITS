package demo2;

public class PrintEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("하이 자바!!"); // println : 줄바꿈 포함
	      System.out.print("하이 자바!!");
	      System.out.print("하이 자바!!");
	      System.out.println();
	      System.out.print("하이 자바!!");
	      System.out.println();
	      System.out.println();
	      System.out.print("하이 자바!!");
	      System.out.println();
	      
	      // ""안에 \n : 줄바꿈을 의미하는 특수문자        
	      System.out.printf("age:%d, year:%d\n", 22, 2024);
	      System.out.printf("age:%d, name:%s", 22, "홍길동");
	      System.out.println("\n하이");
	      System.out.println("=================");
	      // ""안에 자주 사용되는 특수문자 => 이스케이프 문자
	      String str = "고양이는 \"야옹\"";
	      System.out.println("str = " + str);
	      str = "국어\t영어\t수학"; // \t : tab
	      System.out.println("str = " + str);
	   }
	}
