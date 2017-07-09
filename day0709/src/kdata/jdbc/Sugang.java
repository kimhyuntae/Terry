package kdata.jdbc;

import java.sql.Date;

public class Sugang {
	
	private String snum;
	private String subcode;
	private int grade;
	private Date date;
	
	public Sugang(){
		super();
		
	}
	
	public Sugang(String snum, String subcode, int grade, Date date){
		super();
		this.snum=snum;
		this.subcode=subcode;
		this.grade=grade;
		this.date=date;
	}

	public String getSnum() {
		return snum;
	}

	public void setSnum(String snum) {
		this.snum = snum;
	}

	public String getSubcode() {
		return subcode;
	}

	public void setSubcode(String subcode) {
		this.subcode = subcode;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Sugang [snum=" + snum + ", subcode=" + subcode + ", grade=" + grade + ", date=" + date + "]";
	}
	
	
	

}
