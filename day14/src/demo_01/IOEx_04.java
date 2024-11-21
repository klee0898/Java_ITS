package demo_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx_04 {
	public static void main(String[] args) throws IOException {
		String path1="src/demo_01/dog.jpg";
		String path2="src/demo_01/cat.jpg";
		
		// 이미지, 동영상, 오디오파일 등은 byte단위로 입출력
		FileInputStream fis = new FileInputStream(path1);
		FileOutputStream fos= new FileOutputStream(path2);
		
		// 1024바이트만큼 담기위해 배열 생성(==버퍼(메모리))
		byte[] buffer = new byte[1024];
		
		int n = 0;
		while((n = fis.read(buffer)) != -1) {
			fos.write(buffer, 0, n);
		}
		
		fis.close();
		fos.close();
	}
}
