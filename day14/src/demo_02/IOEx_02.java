package demo_02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class IOEx_02 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis= new FileInputStream("src/demo_02/test.txt");
		
		// inputStream를 Reader스트림으로 변환		
		InputStreamReader isr = new InputStreamReader(fis);
		
		// 성능향상을 위해서 isr을 BufferedReader로 변환
		BufferedReader br = new BufferedReader(isr);
		
		int num = 1;
		while(true) {
			String line = br.readLine(); // 한라인씩 읽어옴
			if(line == null) break;
			System.out.println(num++ + ":" + line);
		}
	}
}
