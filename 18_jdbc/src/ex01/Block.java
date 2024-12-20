package ex01;

// oracle jdbc 드라이버 위치
//C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar
//  src/lib 폴더 생성후 ojdbc6.jar 복붙
//  #1. 인스턴스 초기화브럭
//  #2. static 초기화 블럭. 

class Sample{
	int a;
	{ //  #1. 인스턴스 초기화브럭
		a = 100;
		System.out.println("초기화 블럭 실행 : a =  " + a);
	}
	Sample(){ System.out.println(" 생성자 실행 ");}
}

class Sample2{
	static int b;
	static { //  #2. static 초기화 블럭. 
		b = 200;
		System.out.println("static 초기화 블럭 실행 : b =  " + b);
		
	}
}
public class Block {
	static {  //  #2. static 초기화 블럭. 
		System.out.println(" //  #2. static 초기화 블럭. ");
	}
	public static void main(String[] args) {
		Sample sp1 = new Sample();
		Sample sp2 = new Sample();
		
	}

}
