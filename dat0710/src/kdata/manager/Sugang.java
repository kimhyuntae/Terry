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
	private String sname=null;
	private String sgender=null;
	private String subname=null;
	
	
	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
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

	public void setDate(Date date) {
		this.date = date;
	}

	public Sugang(String snum, String subcode, int grade, Date date){
		super();
		this.snum=snum;
		this.subcode=subcode;
		this.grade=grade;
		this.date=date;
	}
	
	public Sugang(String snum, String sname, String subname ){
		super();
		this.snum=snum;		
		this.sname=sname;
		this.subname=subname;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Sugang [snum=" + snum + ", subcode=" + subcode + ", grade=" + grade + ", date=" + date + ", sname="
				+ sname + ", sgender=" + sgender + ", subname=" + subname + "]";
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
	
	
	
	
	
	
	
	
	
