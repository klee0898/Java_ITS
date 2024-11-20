package demo_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// DAO(Data Access Object) : CRUD 처리하는 객체(데이터 처리)
public class MemberDAO {
	Scanner sc = new Scanner(System.in);
	// ArrayList에 3명의 회원을 저장
	// #1. ArrayList 생성
	List<MemberDTO> members= new ArrayList<MemberDTO>();
	
	// #2. MemberDAO가 생성될때 3명의 회원을 리스트에 추가 	
	public MemberDAO() { // CRUD(저장,조회,수정,삭제) 중에 Create(저장)
//		MemberDTO hong = new MemberDTO("test", "1212", "홍길동");
//		MemberDTO sman = new MemberDTO("spman", "1212", "고길동");
//		MemberDTO bman = new MemberDTO("batman", "1212", "강길동");
//		members.add(hong);
//		members.add(sman);
//		members.add(bman);
		// 위의 6줄을 간소하게 표현
		members.add(new MemberDTO("test", "1212", "홍길동"));
		members.add(new MemberDTO("spman", "1212", "고길동"));
		members.add(new MemberDTO("batman", "1212", "강길동"));
	}
	
	
	// 로그인
	public void login() {
		// 입력
		System.out.println("아이디 : ");
		String id = sc.next();
		System.out.println("비밀번호 : ");
		String pw = sc.next();
		
		// 회원리스트에 아이디와 비번이 일치해야 로그인 성공
		// #1. 입력아이디가 리스트에 있는지 확인
		// #2. 리스트에 아이디가 존재하면 비밀번호 확인
		
//		for(MemberDTO dto : members) {
//			// System.out.println(dto.getId());
//			// 리스트 아이디와 입력아이디가 같은지 비교
//			if(dto.getId().equals(id)) { // 아이디 일치하는 경우
//				// 리스트 비번과 입력비번을 다시 확인
//				if(dto.getPw().equals(pw)) { //비번 일치 
//					System.out.println(id + "님 로그인 성공!!");
//					break;
//				}else {// 비번 불일치
//					System.out.println("비밀번호가 틀립니다~");
//				}				
//			}else { // 아이디 불일치
//				System.out.println("아이디가 존재하지 않습니다!!");
//			}
//			
//		}// for
		////////////////////////////////////////////////////
		MemberDTO member = findById(id);
		// 아이디를 못찾으면 member = null
		// 기본형은 null값을 담을 수 없음, 참조형은 null을 담을 수 있음
		// int a = null; 에러
		// Integer a = null;// Wrapper클래스 참조형, null을 담을 수 있음
		
		if(member == null) {
			System.out.println("아이디가 존재하지 않습니다!!");
		}else if(member.getPw().equals(pw)) {
			System.out.println(id + "님 로그인 성공~~");
		}else {
			System.out.println("비밀번호가 틀립니다~~");
		}
		
	}// login()
	
	// 일치하는 아이디의 MemberDTO를 반환
	public MemberDTO findById(String id) {
		for(MemberDTO dto : members) {
			if(dto.getId().equals(id)) {
				// 일치하는 아이디의 MemberDTO를 리턴하고 메소드 종료
				// return은 메소드의 종료를 의미
				// 3명의 리스트에서 첫번째 아이디를 찾으면 1번만 반복후 메소드 종료
				return dto; 
			}
		}
		// 리스트 갯수만큼 반복후 null을 리턴하고 종료
		// 리스트에서 아이디를 못찾으면 null 리턴하고 종료
		return null;
	} // findById()
	
	// 회원가입 : Create(저장)	
	public void memberJoin() {
		// 입력
		System.out.println("아이디 : ");
		String id = sc.next();
		System.out.println("비밀번호 : ");
		String pw = sc.next();
		System.out.println("이름 : ");
		String name = sc.next();
		
		// 아이디 중복체크후 리스트에 저장
		if(idCheck(id)) { // true이면 리스트에 아이디 존재
			System.out.println("중복된 아이디가 존재합니다~");
		}else {
			// members 리스트에 저장
			members.add(new MemberDTO(id, pw, name));
			System.out.println(id+"님 가입을 축하해요~~");
		}
	}	
	// 아이디 중복체크
	public boolean idCheck(String id) {
		boolean chk = true;
		MemberDTO member = findById(id);
		if(member == null) { // 리스트에 입력한 아이디가 없는 경우
			chk = false;
		}
		return chk;
	}
	
	
	// 회원리스트 : Read(조회)
	public void memberList() {
		//------- 향상된 for문 활용해서 리스트 출력
//		for(MemberDTO member : members) {
//			System.out.println(member);//member뒤에 toString();
////			System.out.println(member.toString());
//		}
		
		//------- Iterator(반복자, 순회자)를 이용한 리스트 출력하기
		// 리스트나 배열등을 iterable객체(순회할 수 있는 객체)
		// iterator()는 Iterator 객체를 리턴해주는 메소드
		Iterator<MemberDTO> iter = members.iterator();
		while(iter.hasNext()) { // 순회할수 있는 객체가 있으면 true, 없으면 false
			// next()는 객체가 있으면 그객체를 가져옴
			// 즉, members에 있는 MemberDTO를 가져오는 것임
			// iter.next() => MemberDTO객체
			System.out.println(iter.next()); 
		}
		
		
	}
	
}







