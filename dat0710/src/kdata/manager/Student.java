package kdata.manager;

public class Student {

	private String snum;
	private String sname;
	private String sgender;
	
	public Student(String snum, String sname, String sgender){
		super();
		this.snum=snum;
		this.sname=sname;
		this.sgender=sgender;
		
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
	public String getSgender() {
		return sgender;
	}
	public void setSgender(String sgender) {
		this.sgender = sgender;
	}	
	
	
	@Override
	public String toString() {
		return "Student [snum=" + snum + ", sname=" + sname + ", sgender=" + sgender + "]";
	}
	
	
}
