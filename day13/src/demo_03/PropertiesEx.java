package demo_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
	
	// IOException으로 처리하면 자식인 FileNotFoundException도 처리가 됨
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		
		// 파일 내용 읽어오기
		FileInputStream fis;
		// FileNotFoundException 발생, IOException 자식 
		// conf.properties파일에 입력 빨대 꼽기
		fis = new FileInputStream("src/demo_03/conf.properties");
		
		// 읽어옴
		p.load(fis); // IOException 발생
		System.out.println(p);
		System.out.println();
		System.out.println(p.keySet());
		
		p.put("a", "kor");
		p.put("b", "jp");
		p.put("c", "cn");
		p.put("d", "usa");
		
		System.out.println(p);
		// 출력 통로 만들기, conf.properties에 출력 빨대 꼽기
		FileOutputStream fos;
		fos = new FileOutputStream("src/demo_03/conf.properties");
		
		// 파일에 properties 요소를 출력하기
		// fos를 통로를 통해서 제목은 country로 하고 p의 내용을 씀
		p.store(fos, "country");
	}
}
