package demo_01;

// Company를 상속받는다
public class ItCompany extends Company{
	private String department; // 모집분야	
	private String career; // 경력
	private String skill; // 자격요건 
	private int pay; // 연봉
	private String period; //모집기한
	
	// getter, setter	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	
	public void showCompanyInfo() {
		//?
		String info="========"+getName()+"에서 사원을 모집 합니다!!=========";
		info += "\n지역 : " + getAddress();
		info += "\n연락처 : " + getTel();
		info += "\n모집분야 : " + getDepartment();
		
		System.out.println(info);
	}
	
	// 채용정보
	public void jobPosting() {
		//?
		System.out.println("--------- 채용 정보 --------");
		System.out.println(" 경력구분 :" + career);
		System.out.println(" 자격요건 :" + skill);
		System.out.println(" 연봉 :" + pay + "만원");
		System.out.println(" 모집기간 :" + period + "까지 \n\n");
	}
}
