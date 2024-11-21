package demo_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class IOEx_01 {
	public static void main(String[] args) throws Exception {
		// 한글은 깨짐
//		FileInputStream fis 
//			= new FileInputStream("src/demo_02/test.txt");
		
		FileReader fr= new FileReader("src/demo_02/test.txt");
		
		while(true) {
//			int data = fis.read();
//			if(data == -1) break; // EOF이면 루프탈출
			int data = fr.read();
			if(data == -1) break; // EOF이면 루프탈출
			System.out.print((char)data);
		}
		
//		fis.close();
		fr.close();
		
		// 덮어쓰기 모드
//		FileWriter fw = new FileWriter("src/demo_02/test.txt");
		
		// append 모드로 스트림생성
		FileWriter fw = new FileWriter("src/demo_02/test.txt",true);
		fw.append("엘지전자");// write()와 같은 의미 
		fw.write("현대중공업\r\n"); // \r\n은 엔터, (\r)캐리지리턴+(\n)줄바꿈
		fw.write("삼성SDI");
		fw.close();
	}
}
