package demo_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx_03 {
	public static void main(String[] args) throws IOException {
		
		
		// 덮어쓰기
		FileOutputStream fos 
			= new FileOutputStream("src/demo_01/a.txt");
		
		// 추가 : append
//		FileOutputStream fos 
//		= new FileOutputStream("src/demo_01/a.txt", true);
//		FileOutputStream fos 
//		= new FileOutputStream("c:/fileTest/a.txt", true);
		fos.write('s');		
		fos.write('\n'); // '\n'대신 10을 넣어도 됨		
		fos.write('L'); 
		fos.write('G');
		
		String ls= System.lineSeparator();//줄바꿈 객체
		fos.write(("h" + ls).getBytes());
		fos.write(100);//d 
		fos.close(); // 스트림 닫기
		
		
		// FileInputStream을 활용해서 a.txt 내용을 읽어오세요.
//		FileInputStream fis= new FileInputStream("c:/fileTest/a.txt");
//
//		int data;
//		// EOF(End of File)를 만났을 때 while문이 종료됨
//		while((data = fis.read()) != -1) { // 파일의 끝에 도착하면 -1을 리턴
//			System.out.print((char)data);
//		}
//		
//		fis.close();
	}
}
