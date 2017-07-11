package kdata.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentManager {
//테이블당 클래스 따로 만드는게 유지보수에 좋음
	
	//학생 정보 추가
	public static int insert(Student s) throws SQLException {
		//1
		Connection con= null;
		PreparedStatement pstmt = null;
		int result = 0;
	  //  ResultSet rs = null;
		
		try{
		
		//2
		con = DBUtill.getConnection();
		
		//3.4
        String sql = "insert into student values(?,?,?)";
		pstmt = con.prepareStatement(sql);		
	 		
		pstmt.setString(1, s.getSnum());
		pstmt.setString(2, s.getSname());
		pstmt.setString(3, s.getSgender());

		//5
			result = pstmt.executeUpdate();
		
		}finally{
		
		//6
		DBUtill.close(con, pstmt);
		}
		return result;

	}
	
	//학생 리스트 출력
	public List<Student> selectAll() throws SQLException{
		Connection con= null;
		PreparedStatement pstmt = null;		
	    ResultSet rs = null;
	    
	    List<Student> list = new ArrayList<>();
		try{
			con=DBUtill.getConnection();		
			String sql=" select * from student order by snum";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();		
			System.out.println("Asdfadsfadsfe");
			while(rs.next()){
				Student s = new Student(rs.getString("snum"), rs.getString("sname"), rs.getString("sgender"));
				list.add(s);
			}			
		}finally{
		DBUtill.close(rs, pstmt, con);
	}		
		return list;	
}
	
	
	public Student selectByName(String name) throws SQLException{		
		Connection con= null;
		PreparedStatement pstmt = null;		
	    ResultSet rs = null;
	    Student s =null;
	 
		
		try{
			con=DBUtill.getConnection();
			String sql=" select * from student where sname= ? ";
			
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				 s = new Student(rs.getString("snum"),rs.getString("sname"), rs.getString("sgender"));
				System.out.println(s.toString());
			}		

			
		}finally{
			DBUtill.close(rs,  pstmt, con);
			
		}return s;		
	}

	public static void delete(String snum) throws SQLException{
		Connection con =null;
		PreparedStatement pstmt=null;
		String sql="";
		
		try{
			con= DBUtill.getConnection();
			sql = "delete from sugang where snum=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, snum);			
		}
		finally{
			DBUtill.close(con, pstmt);
		}
	}
	
	public static void grade(int grade, String snum, String subcode) throws SQLException{
		Connection con= null;
		PreparedStatement pstmt=null;
		String sql="";
		
		try{
			con=DBUtill.getConnection();
			sql="update sugang set grade=? where snum=? and subcode=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, grade);
			pstmt.setString(2, snum);
			pstmt.setString(3, subcode);
			pstmt.executeUpdate();
		}
		finally{
			DBUtill.close(con, pstmt);
		}		
	}//grade
	
	/*
	Map<String, Integer>map = new HashMap<>();
	 
	public Map<String, Integer> gradeAvg() throws SQLException{
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	String sql="";
	 
	try{
		con=DBUtill.getConnection();
		sql="select * from sugang group by subcode";
		pstmt=con.prepareStatement(sql);
		rs = pstmt.executeQuery();
	 
		Iterator<String> keys = map.keySet().iterator();
	while(key.hashNext()){
	String key= key.next();
	String value = map.get(key);
	System.out.println(key+":"+value);
	}
	 
	}finally{
	DBUtill.close(rs, pstmt, con);
	}
	return map;
	}
	*/
	
	
}
