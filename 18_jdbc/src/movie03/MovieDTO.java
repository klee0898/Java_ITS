package movie03;

public class MovieDTO {
	private int movie_num;
	private String m_name;
	private String summary;
	private String run_time;
	private String release;
	private String director;
	private String cast;
	private int box_office;
	public int getMovie_num() {
		return movie_num;
	}
	public void setMovie_num(int movie_num) {
		this.movie_num = movie_num;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getRun_time() {
		return run_time;
	}
	public void setRun_time(String run_time) {
		this.run_time = run_time;
	}
	public String getRelease() {
		return release;
	}
	public void setRelease(String release) {
		this.release = release;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public int getBox_office() {
		return box_office;
	}
	public void setBox_office(int box_office) {
		this.box_office = box_office;
	}
	@Override
	public String toString() {
		return "MovieDTO [movie_num=" + movie_num + ", m_name=" + m_name + ", summary=" + summary + ", run_time="
				+ run_time + ", release=" + release + ", director=" + director + ", cast=" + cast + ", box_office="
				+ box_office + "]";
	}
	
}
 
	 
	    
	 
	   
	   
	   