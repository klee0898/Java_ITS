package demo_01;

import java.util.Arrays;
import java.util.Scanner;

// 구직 앱
public class JobApp {
	static int jsCnt; // 스태틱 변수(공유변수) 선언
	static int comCnt;
	
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
	
	// 구인업체 등록
	public static void registerCompany(Scanner sc, ItCompany[] icArr) {
		//?
		ItCompany ic = new ItCompany();
		
		System.out.println("--------- 구인등록 START ----------");
		System.out.println("회사명 입력 => ");
		
		String name = sc.next();
		ic.setName(name);
		
		System.out.println("지역 입력 => ");
		String addr = sc.next();
		ic.setAddress(addr);
		
		System.out.println("연락처 입력 => ");
		String tel = sc.next();
		ic.setTel(tel);
		
		System.out.println("모집분야 입력 => ");
		String dept = sc.next();
		ic.setDepartment(dept);
		
		// 채용정보 입력
		System.out.println("----- 채용정보 입력 -------");
		
		System.out.println("경력구분 입력 => ");
		String career = sc.next();
		ic.setCareer(career);
		
		System.out.println("자격요건 입력 => ");
		String skill = sc.next();
		ic.setSkill(skill);
		
		System.out.println("연봉 입력 => ");
		int pay = sc.nextInt();
		ic.setPay(pay);
		
		System.out.println("모집기한(입력예 2022-10-11) 입력 => ");
		String period = sc.next();
		
		ic.setPeriod(period);
		
		
		icArr[comCnt] = ic;
		comCnt++;
		
		System.out.println("구인 등록 완료!!");
	}
	
	// 구인업체 리스트
	public static void companyList(ItCompany[] icArr) {
		//?
		if(comCnt >0) {
			for(int i =0; i<comCnt;i++) {
				icArr[i].showCompanyInfo();
				icArr[i].jobPosting();
			}
		}else {
			System.out.println("구인업체가 존재하지 않습니다!!");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 구직자를 저장하기 위한 배열 생성 (100명 저장하는 객체배열)
		JobSeeker[] jsArr = new JobSeeker[100];
		
		// 구인업체를 저장하기 위한 배열 생성
		ItCompany[] icArr = new ItCompany[100]; // null값 할당
		
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
				// ?
				registerCompany(sc, icArr);
			}else if(menu == 3) {
				// 구직자 리스트
				jsList(jsArr);
			}else if(menu == 4) {
				// ?
				companyList(icArr);
			}// if
			
		}// while
	} // main()
} // class
