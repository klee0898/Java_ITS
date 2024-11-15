package demo_01;

// 구직자
public class JobSeeker extends Person{
	private String tel;
	private String job; // 원하는 직업
	private int salary; // 원하는 연봉
	
	// getter, setter
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void showProfile() {
		String info = "--- 구직자 : "+getName()+"프로필";
		info +="\n나이 : " + getAge();
		info +="\n성별 : " + getGender();
		info +="\n전화 : " + tel;
		
		System.out.println(info);
	}
	
	public void wantJob() {
		System.out.println("희망 직종 : " + job);
		System.out.println("희망 연봉 : " + salary +"만원\n\n");
	}
	
}
