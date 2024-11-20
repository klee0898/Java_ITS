package demo_03;

import java.io.File;
import java.io.IOException;

// File 클래스 : 파일관리(이름수정/삭제/폴더생성 등)를 위한 클래스
public class FileEx {
	public static void main(String[] args) throws IOException {
		File txtFile= new File("c:/fileTest/fileIO.txt");
		File txtDir= new File("c:/fileTest/fDirectory");
		
		// 파일 경로 얻어오기
		String p1 = txtFile.getPath();
		System.out.println(p1);
		String p2 = txtDir.getPath();
		System.out.println(p2);
		
		// 파일 존재 여부 확인
		boolean b1= txtFile.exists();
		System.out.println(b1); // false
		// 폴더 존재 여부 확인
		boolean b2 = txtDir.isDirectory();
		System.out.println(b2); // false
		
		// 파일 생성
		boolean b3= txtFile.createNewFile();
		System.out.println(b3);
		
		// Q> fileTest 폴더안에 aa.txt파일을 생성하세요.
		// #1. File 객체 생성
		// #2. 생성된 File객체 이용해서 createNewFile() 호출
		File aa = new File("c:/fileTest/aa.txt");
		aa.createNewFile();
		
		// 폴더 생성
		boolean b4 = txtDir.mkdir();
		System.out.println(b4);
		
		// 파일명 수정 : aa.txt => b.txt
		File bFile = new File("c:/fileTest/b.txt");
		aa.renameTo(bFile);
		
		// 파일삭제
		bFile.delete();
		
		// 폴더삭제
		txtDir.delete();
	}
}
