package kdata.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Sugang {
	private String snum=null;
	private String subcode=null;
	private int grade=1;	
	private Date date;
	
	public Sugang(String snum, String subcode, int grade, Date date){
		super();
		this.snum=snum;
		this.subcode=subcode;
		this.grade=grade;
		this.date=date;
	}
	
	
	
	@Override
	public String toString() {
		return "Sugang [snum=" + snum + ", subcode=" + subcode + ", grade=" + grade + ", date=" + date + "]";
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
	public void setData(Date date) {
		this.date = date;
	}
	
	
		

}
	
	
	
	
	
	
	
	
	
