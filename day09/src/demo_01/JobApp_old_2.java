package demo_01;

import java.util.Arrays;
import java.util.Scanner;

// 구직 앱
public class JobApp_old_2 {
	static int jsCnt; // 스태틱 변수(공유변수) 선언
	
	// 메뉴 디스플레이
	public static void showMenu() {
		System.out.println("========== JOB App ===========");
		System.out.println("== 1. 구직 등록               ==");
		System.out.println("== 2. 구인 등록               ==");
		System.out.println("== 3. 구직자 리스트            ==");
		System.out.println("== 4. 구인업체 리스트           ==");
		System.out.println("== 9. 종료                   ==");
		System.out.println("==============================");
		System.out.println(" 메뉴를 선택하세요 > ");
	}
	// 구직자 등록                     // 입력 => Scanner, 객체배열(jsArr)
	public static void registerSeeker(Scanner sc, JobSeeker[] jsArr) {
		// 구직 등록을 선택할 때마다 새로운 인스턴스(주소)를 생성
		JobSeeker js = new JobSeeker();
		System.out.println("------- 구직 등록 START ------");
		System.out.println("이름 입력 > ");
		String name = sc.next();
		js.setName(name);
		
		System.out.println("나이 입력 > ");
		int age = sc.nextInt();
		js.setAge(age);
		
		while(true) {
			System.out.println("------- 성별 -------");
			System.out.println("1.남 2.여");
			System.out.println("-------------------");
			System.out.println("성별을 선택하세요 > ");
			int gender = sc.nextInt();
			if (gender == 1) {
				js.setGender('M');
				break;
			}else if(gender == 2) {
				js.setGender('F');
				break;
			}else {
				System.out.println("다시 입력하세요!!");
			}
		}	
		
		System.out.println("전화번호 입력 > ");
		String tel = sc.next();
		js.setTel(tel);
		
		System.out.println("희망직종 입력 > ");
		String job = sc.next();
		js.setJob(job);
		
		System.out.println("희망연봉 입력 > ");
		int salary = sc.nextInt();
		js.setSalary(salary);
					
		// 등록
		jsArr[jsCnt] = js;
		
		jsCnt++;
	}
	
	// 등록 구직자 출력
	public static void jsList(JobSeeker[] jsArr) {
		System.out.println(Arrays.toString(jsArr));
		for(JobSeeker seeker : jsArr) {
			if(seeker != null) {
				seeker.showProfile();
				seeker.wantJob();
			}else {
				break; // for루프 탈출
			}
		}// for
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 구직자를 저장하기 위한 배열 생성 (100명 저장하는 객체배열)
		JobSeeker[] jsArr = new JobSeeker[100];
		
//		JobSeeker js = new JobSeeker();
		
		while(true) {
			showMenu(); // 메뉴 출력			
			int menu = sc.nextInt();
			
			if(menu == 9) {
				System.out.println("프로그램 종료!!");
				System.exit(0);
			}else if(menu == 1) {
				// 구직 등록 메소드 호출
				registerSeeker(sc, jsArr);
			}else if(menu == 2) {
				
			}else if(menu == 3) {
				// 구직자 리스트
				jsList(jsArr);
			}else if(menu == 4) {
				
			}// if
			
		}// while
	} // main()
} // class
