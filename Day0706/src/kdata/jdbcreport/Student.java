package kdata.jdbcreport;

public class Student {

	private String snum;
	private String sname;
	private String sgender;
	
	
	@Override
	public String toString() {
		return "Student [snum=" + snum + ", sname=" + sname + ", sgender=" + sgender + "]";
	}
	public String getSnum() {
		return snum;
	}
	public void setSnum(String snum) {
		this.snum = snum;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String sgetGender() {
		return sgender;
	}
	public void setGender(String sgender) {
		this.sgender = sgender;
	}
	
	
	
	
}
