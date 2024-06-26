package kr.co.sist.aak.domain.instructor;



public class StudentListDomain {
	
	private String sub_code,STD_ID,name,status;
	private int score,TRY;
	
	public StudentListDomain(String sub_code, String sTD_ID, String name, String status, int score, int tRY) {
		super();
		this.sub_code = sub_code;
		this.STD_ID = sTD_ID;
		this.name = name;
		this.status = status;
		this.score = score;
		this.TRY = tRY;
	}

	public StudentListDomain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSub_code() {
		return sub_code;
	}

	public void setSub_code(String sub_code) {
		this.sub_code = sub_code;
	}

	public String getSTD_ID() {
		return STD_ID;
	}

	public void setSTD_ID(String sTD_ID) {
		STD_ID = sTD_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getTRY() {
		return TRY;
	}

	public void setTRY(int tRY) {
		this.TRY = tRY;
	}

	@Override
	public String toString() {
		return "StudentListDomain [sub_code=" + sub_code + ", STD_ID=" + STD_ID + ", name=" + name + ", status="
				+ status + ", score=" + score + ", TRY=" + TRY + "]";
	}
	
	
	

	
}
