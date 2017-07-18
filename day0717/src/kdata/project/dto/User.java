package kdata.project.dto;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable{	//Serializable:Á÷·ÄÈ­
	//dto
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 715333381605484031L;
	private String id;
	private String pw;
	private String name;
	private String profile;
	private String reg_date;
	
	public User(String id, String pw, String name){
		super();
		this.id=id;
		this.pw=pw;
		this.name=name;
	}	
	
	
	
	public User(){
		
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfile() {
		return profile;
	}
	public String getReg_date() {
		return reg_date;
	}



	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}



	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + ", profile=" + profile + ", reg_date=" + reg_date
				+ "]";
	}



	
	
		
	
}
